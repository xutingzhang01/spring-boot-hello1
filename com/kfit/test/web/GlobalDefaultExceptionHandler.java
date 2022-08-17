package com.kfit.test.web;


import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 *
 * 全局异常
 *
 */

@ControllerAdvice

public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)


    public void defaultErrorHandler(HttpServletRequest req,Exception e){
        //打印异常信息
        e.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");



    }


}
