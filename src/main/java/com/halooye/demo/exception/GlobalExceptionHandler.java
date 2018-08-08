package com.halooye.demo.exception;

import com.halooye.demo.model.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response) {
        ex.printStackTrace();

        if(ex instanceof NoPersonException) {
            logger.error("================="+ex.getMessage()+"==============");
            return new ResponseResult(401,"无数据！",null);
        }
        return new ResponseResult(500,"系统内部异常",null);
    }
}
