package com.justgame.learn.exception.exception;

/**
 * @author XieCl
 * @ClassName: NotFindUserException
 * @Description:
 * @date 2017-09-06 22:37
 */
public class NotFindUserException extends RuntimeException {
    public NotFindUserException() {
        super("找不到此用户！");
    }

    public NotFindUserException(String message) {
        super(message);
    }
}
