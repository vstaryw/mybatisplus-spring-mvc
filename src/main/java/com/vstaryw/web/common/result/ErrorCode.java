package com.vstaryw.web.common.result;

/**
 * Created by yuw on 2016/11/2.
 */
public enum ErrorCode {

    SUCCESS("0","请求成功"),

    UNKNOWN_ERROR("1","未知错误"),

    INVALID_PARAM("100","请求参数无效"),

    INCORRECT_SIGNATURE("101","无效签名"),

    INVALID_USER_ID("102","无效的user id"),

    INVALID_ACCESS_TOKEN("103","无效的access token"),

    ACCESS_TOKEN_EXPIRED("104","access token过期"),

    USER_NOT_VISIBLE("210","用户不可见"),

    SPECIFIED_OBJECT_CANNOT_BE_FOUND("211","指定的对象不存在"),

    INVOKE_SERVICE_ERROR("400","调用服务出错");

    private String code;

    private String msg;


    private ErrorCode(String code,String msg){
        this.code= code;
        this.msg = msg;
    }

    public static String getMsg(String code){
        for(ErrorCode errorCode : ErrorCode.values()){
            if(errorCode.getCode().equals(code)){
                return errorCode.getMsg();
            }
        }
        return null;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
