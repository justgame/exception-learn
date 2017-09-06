package com.justgame.learn.exception.exception.apiexception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author XieCl
 * @ClassName: ApiException
 * @Description:
 * @date 2017-09-06 23:14
 */
public class ApiException extends RuntimeException {
    @Getter @Setter
    protected Long errorCode;
    @Getter @Setter
    protected Object data;

    public ApiException(Long errorCode, String message, Object data, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
        this.data = data;
    }

    public ApiException(Long errorCode, String message, Object data) {
        this(errorCode, message, data, null);
    }

    public ApiException(Long errorCode, String message) {
        this(errorCode, message, null, null);
    }

    public ApiException(String message, Throwable e) {
        this(null, message, null, e);
    }

    public ApiException() {}

}
