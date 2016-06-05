package com.tsfintech.aries.api.manager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.api.component.CommonValidator;
import com.tsfintech.aries.api.dto.*;
import com.tsfintech.aries.core.dao.*;
import com.tsfintech.aries.core.model.*;
import com.tsfintech.rest.core.exception.RestServiceException;
import com.tsfintech.rest.core.exception.RestValidationException;
import com.tsfintech.rest.core.operator.EntityCreator;
import com.tsfintech.rest.core.operator.EntityValidator;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by chaizj on 16/6/2.
 */
@Service
public class LoanManager implements EntityCreator<Loan>, EntityValidator<Loan> {
    @Autowired
    private BorrowInfoModelDao borrowInfoModelDao;

    @Autowired
    private CustomerModelDao customerModelDao;

    @Autowired
    private LoanInfoModelDao loanInfoModelDao;

    @Autowired
    private BorrowSpouseModelDao borrowSpouseModelDao;

    @Autowired
    private BorrowerContactModelDao borrowerContactModelDao;

    @Autowired
    private LoanImageDocModelDao loanImageDocModelDao;

    @Autowired
    private LoanAccountModelDao loanAccountModelDao;

    @Autowired
    private LoanAccountHistoryModelDao loanAccountHistoryModelDao;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Mapper dozerBeanMapper;

    @Autowired
    private CommonValidator commonValidator;


    @Transactional
    @Override
    public Object save(String s, Loan loan) {
        Product product = loan.getProduct();

        String loanNo = product.getLoanNo();

        /*
        判断是否存在这笔放款,防止重复放款
         */
        LoanInfo existed = loanInfoModelDao.findByLoanNo(loanNo);
        if (existed != null) {
            return new ApiResult("duplicated loan:"+loanNo);
        }

        LoanInfo loanInfo = dozerBeanMapper.map(product, LoanInfo.class);
        loanInfoModelDao.save(loanInfo);

        CustomerBase customerBase = loan.getCustomerBase();
        BorrowerInfo borrowerInfo = dozerBeanMapper.map(customerBase, BorrowerInfo.class);
        borrowerInfo.setLoanNo(loanNo);
        borrowInfoModelDao.save(borrowerInfo);

        CustomerSpouse customerSpouse = loan.getCustomerSpouse();
        BorrowerSpouse borrowerSpouse = dozerBeanMapper.map(customerSpouse, BorrowerSpouse.class);
        borrowerSpouse.setLoanNo(loanNo);
        borrowSpouseModelDao.save(borrowerSpouse);

        CustomerContact customerContact = loan.getCustomerContact();
        BorrowerContact borrowerContact = dozerBeanMapper.map(customerContact, BorrowerContact.class);
        borrowerContactModelDao.save(borrowerContact);

        Account account = loan.getAccount();
        LoanAccount loanAccount = dozerBeanMapper.map(account, LoanAccount.class);
        loanAccountModelDao.save(loanAccount);

        /*
        更新账号历史
         */
        LoanAccountHistory loanAccountHistory =
                loanAccountHistoryModelDao.findLastLoanAccountHistory(loanNo, new PageRequest(0, 3));
        loanAccountHistory.setEndTime(new Date());
        loanAccountHistoryModelDao.save(loanAccountHistory);

        List<ImgDocs> imgDocsList = loan.getImgDocses();
        for (ImgDocs imgDocs : imgDocsList) {
            LoanImageDoc loanImageDoc = dozerBeanMapper.map(imgDocs, LoanImageDoc.class);
            loanImageDoc.setLoanNo(loanNo);
            loanImageDocModelDao.save(loanImageDoc);
        }

        return new ApiResult();
    }

    @Override
    public void validate(Loan loan) throws RestValidationException {
        commonValidator.validate(loan);
    }
}
