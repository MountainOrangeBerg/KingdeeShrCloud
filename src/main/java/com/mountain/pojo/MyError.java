package com.mountain.pojo;

public class MyError {

    private int code;
    private Boolean flag;
    private String Message;
    private Object object;



    public MyError(String message, Object object) {
        this.code = 500;
        this.flag = false;
        Message = message;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
