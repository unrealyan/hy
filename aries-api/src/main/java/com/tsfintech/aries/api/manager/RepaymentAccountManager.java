package com.tsfintech.aries.api.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.api.dto.ApiResult;
import com.tsfintech.aries.api.dto.RepaymentAccount;
import com.tsfintech.aries.core.dao.LoanAccountModelDao;
import com.tsfintech.aries.core.model.LoanAccount;
import com.tsfintech.rest.core.exception.RestValidationException;
import com.tsfintech.rest.core.operator.EntityCreator;
import com.tsfintech.rest.core.operator.EntityValidator;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chaizj on 16/6/2.
 */
public class RepaymentAccountManager implements EntityCreator<RepaymentAccount>, EntityValidator<RepaymentAccount> {
    @Autowired
    private LoanAccountModelDao loanAccountModelDao;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Mapper dozerBeanMapper;

    @Transactional
    @Override
    public Object save(String s, RepaymentAccount repaymentAccount) {
        LoanAccount loanAccount = loanAccountModelDao.findLoanAccountByLoanNo(repaymentAccount.getLoanNo());

        String oldDebitAccountNo = loanAccount.getDebitAccountNo();
        String oldDebitAccountName = loanAccount.getDebitAccountName();
        String oldDebitAccountBranch = loanAccount.getDebitAccountBank();

        if (!oldDebitAccountNo.equals(repaymentAccount.getDebitAccountNo())
                || !oldDebitAccountName.equals(repaymentAccount.getDebitAccountName())
                || !oldDebitAccountBranch.equals(repaymentAccount.getDebitAccountBranch())) {
            return new ApiResult("输入的原账户信息校验不通过");
        }

        loanAccount.setDebitAccountNo(repaymentAccount.getNewDebitAccountNo());
        loanAccount.setDebitAccountName(repaymentAccount.getNewDebitAccountName());
        loanAccount.setDebitAccountBank(repaymentAccount.getNewDebitAccountBranch());

        loanAccountModelDao.save(loanAccount);

        return new ApiResult();
    }

    @Override
    public void validate(RepaymentAccount repaymentAccount) throws RestValidationException {

    }
}
