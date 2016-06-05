package com.tsfintech.aries.api.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.api.dto.ApiResult;
import com.tsfintech.aries.api.dto.RePayment;
import com.tsfintech.aries.core.dao.RepaymentModelDao;
import com.tsfintech.aries.core.model.Repayment;
import com.tsfintech.rest.core.exception.RestValidationException;
import com.tsfintech.rest.core.operator.EntityCreator;
import com.tsfintech.rest.core.operator.EntityValidator;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chaizj on 16/6/2.
 */
public class RepaymentManager implements EntityCreator<RePayment>, EntityValidator<RePayment> {
    @Autowired
    private RepaymentModelDao repaymentModelDao;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Mapper dozerBeanMapper;

    @Transactional
    @Override
    public Object save(String s, RePayment repayment) {
        /*
        判断是否存在这笔还款,防止重复扣款
         */
        String loanNo = repayment.getLoanNo();
        Repayment existed = repaymentModelDao.findByLoanNo(loanNo);
        if (existed != null) {
            return new ApiResult("duplicated repayment:"+loanNo);
        }

        Repayment repaymentModel = dozerBeanMapper.map(repayment, Repayment.class);
        repaymentModelDao.save(repaymentModel);
        return new ApiResult();
    }

    @Override
    public void validate(RePayment repayment) throws RestValidationException {

    }
}
