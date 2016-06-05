package com.tsfintech.aries.api.component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tsfintech.aries.api.dto.ApiResult;
import com.tsfintech.aries.api.dto.Loan;
import com.tsfintech.rest.core.exception.RestValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by erric on 6/3/16.
 */
@Component
public class CommonValidator {
    @Autowired
    private Validator validator;

    @Autowired
    private ObjectMapper objectMapper;

    public void validate(Object object) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
        if (constraintViolations.size() != 0) {
            List<String> errorMessages = constraintViolations.stream()
                    .map(n -> n.getPropertyPath() + ":" + n.getMessage())
                    .collect(Collectors.toList());

            ApiResult result = new ApiResult(errorMessages);
            try {
                throw new RestValidationException(objectMapper.writeValueAsString(result));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}