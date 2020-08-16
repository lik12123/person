package com.fh.util;


public class JsonData {

    private Integer code;
    private String message;
    private Object data;

    private JsonData(String message){
        this.code=500;
        this.message=message;
    }

    private JsonData(Object data){
        this.code=200;
        this.message="success";
        this.data=data;
    }

    public static JsonData getJsonDataSuccess(Object data){
        return new JsonData(data);
    }

    public static JsonData getJsonDataError(String message){
        return new JsonData(message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
