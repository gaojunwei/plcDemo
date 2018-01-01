package com.plc.gjw.common.controller.result;

import java.io.Serializable;


public class BasicResult implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private boolean success;
    private String returnCode;
    private String returnMessage = "SUCCESS";

    public BasicResult() {
    }

    public BasicResult(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }
}
