package com.plc.gjw.common.controller.result;

import java.util.List;

public class ListResult<T> extends BasicResult {

    private List<T> data;

    public ListResult(){}

    public ListResult(boolean success){
        super(success);
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
