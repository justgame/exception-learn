package com.justgame.learn.exception.exception;

/**
 * @author XieCl
 * @ClassName: NotFindAddressException
 * @Description:
 * @date 2017-09-06 22:39
 */
public class NotFindAddressException extends RuntimeException {
    public NotFindAddressException() {
        super("找不到此地址");
    }

    public NotFindAddressException(String message) {
        super(message);
    }
}
