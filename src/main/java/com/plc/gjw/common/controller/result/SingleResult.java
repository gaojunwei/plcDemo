package com.plc.gjw.common.controller.result;

public class SingleResult<T> extends BasicResult {

    T data;

    public SingleResult(){}

    public SingleResult(boolean success) {
        super(success);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
