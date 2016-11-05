package com.vstaryw.web.common.exception;


/**
 * 后台接口调用异常类
 * @author vstaryw
 *
 */
public class ProcessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2671643227097369681L;
	private String errCode;

	public ProcessException() {}

	public ProcessException(String errMsg, Throwable cause) {
		super(errMsg,cause);
	}
	
	public ProcessException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public ProcessException(String errCode, String msg, Throwable cause) {
		super(msg,cause);
		this.errCode = errCode;
	}
	
	public String getErrorCode(){
		return errCode;
	}
	
}
