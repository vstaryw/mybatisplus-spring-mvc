package com.vstaryw.web.common.result;

/**
 * Date: 16/8/31
 * Time: 下午5:50
 * Describe: 封装Json返回信息
 */
public class JsonResult {
    private String code;
    private String msg;
    private Object data;

    public JsonResult(){}

    public JsonResult(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public  JsonResult(String code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
