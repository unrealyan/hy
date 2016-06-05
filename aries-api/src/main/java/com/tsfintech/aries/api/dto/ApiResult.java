package com.tsfintech.aries.api.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erric on 6/1/16.
 */
public class ApiResult {


    private boolean success = true;

    private List<String> errorMessages = new ArrayList<>();

    public ApiResult() {
    }

    public ApiResult(List<String> errorMessages) {
        this.errorMessages = errorMessages;
        this.success = false;
    }

    public ApiResult(String msg) {
        this.setSuccess(false);
        this.addErrorMsg(msg);
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void addErrorMsg(String msg) {
        errorMessages.add(msg);
    }


}
