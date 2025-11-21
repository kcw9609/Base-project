package com.team.backend.global.error.handler;


import com.team.backend.global.code.BaseErrorCode;
import com.team.backend.global.error.exception.GeneralException;

public class BasicException extends GeneralException {
    public BasicException(BaseErrorCode code) {
        super(code);
    }
}