package com.justgame.learn.exception.exception;

/**
 * @author XieCl
 * @ClassName: NotMatchUserAddressException
 * @Description:
 * @date 2017-09-06 22:40
 */
public class NotMatchUserAddressException extends RuntimeException {
    public NotMatchUserAddressException() {
        super("此地址不是该用户的收货地址");
    }

    public NotMatchUserAddressException(String message) {
        super(message);
    }
}
