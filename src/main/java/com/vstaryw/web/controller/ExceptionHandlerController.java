package com.vstaryw.web.controller;

import com.vstaryw.web.common.exception.ProcessException;
import com.vstaryw.web.common.result.ErrorCode;
import com.vstaryw.web.common.result.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yuw on 2016/11/2.
 */
@ControllerAdvice
public class ExceptionHandlerController {

    Logger log = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest request, Exception ex){
        log.error(ex.getMessage(),ex);
        JsonResult jsonResult;
        if(ex instanceof ProcessException){
            jsonResult = new JsonResult(((ProcessException) ex).getErrorCode(),ex.getMessage());
        }else{
            jsonResult = new JsonResult(ErrorCode.UNKNOWN_ERROR.getCode(),ErrorCode.UNKNOWN_ERROR.getMsg());
        }
        return jsonResult;
    }
}
