package com.acai.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月10日 16:44
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println(ex.getMessage());
        return new Result(666, null, ex.getMessage());
    }

}
