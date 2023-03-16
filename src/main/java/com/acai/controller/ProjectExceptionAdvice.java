package com.acai.controller;

import com.acai.exception.BusinessException;
import com.acai.exception.SystemException;
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

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        //记录日志
        //通知运维
        //通知开发
        return new Result(Code.SYSTEM_ERR, null, ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {

        return new Result(Code.BUSINESS_ERR, null, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        //记录日志
        //通知运维
        //通知开发
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "系统繁忙，请稍后重试！");
    }

}
