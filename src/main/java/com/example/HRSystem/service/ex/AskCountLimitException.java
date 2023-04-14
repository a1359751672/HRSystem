package com.example.HRSystem.service.ex;

public class AskCountLimitException extends ServiceException{
    public AskCountLimitException() {
    }

    public AskCountLimitException(String message) {
        super(message);
    }

    public AskCountLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public AskCountLimitException(Throwable cause) {
        super(cause);
    }

    public AskCountLimitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
