package com.acai.exception;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月16日 11:31
 */
public class BusinessException extends RuntimeException {
    private Integer code;


    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
