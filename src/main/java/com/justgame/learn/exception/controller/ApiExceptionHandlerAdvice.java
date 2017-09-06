package com.justgame.learn.exception.controller;

import com.justgame.learn.exception.exception.apiexception.ApiException;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author XieCl
 * @ClassName: ApiExceptionHandlerAdvice
 * @Description:
 * @date 2017-09-06 23:55
 */
@ControllerAdvice(annotations = RestController.class)
public class ApiExceptionHandlerAdvice {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorDTO> exception(Exception exception, HttpServletResponse response) {
        ErrorDTO errorDTO = new ErrorDTO();
        if (exception instanceof ApiException) {
            ApiException apiException = (ApiException) exception;
            errorDTO.setErrorCode(apiException.getErrorCode());
        } else {
            errorDTO.setErrorCode(0L);
        }
        errorDTO.setMessage(exception.getMessage());
        ResponseEntity<ErrorDTO> responseEntity = new ResponseEntity<>(errorDTO, HttpStatus.valueOf(response.getStatus()));
        return responseEntity;
    }
}

@Data
class ErrorDTO {
    private Long errorCode;
    private String message;
}
