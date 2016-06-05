package com.tsfintech.aries.api.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.api.dto.ApiResult;
import com.tsfintech.aries.api.dto.RepaymentPlan;
import com.tsfintech.aries.core.dao.RepaymentPlanHistoryModelDao;
import com.tsfintech.aries.core.dao.RepaymentPlanModelDao;
import com.tsfintech.aries.core.model.RepaymentPlanHistory;
import com.tsfintech.rest.core.exception.RestValidationException;
import com.tsfintech.rest.core.operator.EntityCreator;
import com.tsfintech.rest.core.operator.EntityValidator;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.Date;

/**
 * Created by chaizj on 16/6/2.
 */
public class RepaymentPlanManager implements EntityCreator<RepaymentPlan>, EntityValidator<RepaymentPlan> {
    @Autowired
    private RepaymentPlanModelDao repaymentPlanModelDao;

    @Autowired
    private RepaymentPlanHistoryModelDao repaymentPlanHistoryModelDao;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Mapper dozerBeanMapper;

    @Override
    public Object save(String s, RepaymentPlan repaymentPlan) {
        com.tsfintech.aries.core.model.RepaymentPlan repaymentPlanModel =
                dozerBeanMapper.map(repaymentPlan, com.tsfintech.aries.core.model.RepaymentPlan.class);
        repaymentPlanModelDao.save(repaymentPlanModel);

        RepaymentPlanHistory repaymentPlanHistory =
                repaymentPlanHistoryModelDao.findLastRepaymentPlanHistory(repaymentPlan.getLoanNo(), new PageRequest(0, 3));
        repaymentPlanHistory.setEndTime(new Date());
        repaymentPlanHistoryModelDao.save(repaymentPlanHistory);

        return new ApiResult();
    }

    @Override
    public void validate(RepaymentPlan repaymentPlan) throws RestValidationException {

    }
}
