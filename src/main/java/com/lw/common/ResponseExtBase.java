package com.lw.common;

/**
 * @className: ResponseExtBase
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/3 9:28
 **/
public class ResponseExtBase<T>{
    private int totalPages;
    private int totalSize;
    private String returnCode = "0";
    private String returnMessage = "Success";
    private T result;

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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }
}
