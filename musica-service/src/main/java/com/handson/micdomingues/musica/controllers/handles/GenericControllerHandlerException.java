package com.handson.micdomingues.musica.controllers.handles;

import com.handson.micdomingues.musica.exceptions.ParametrosException;
import com.handson.micdomingues.musica.exceptions.mensagens.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GenericControllerHandlerException {

    /**
     * Handle dos erros relacionados a negócio
     * @param exception
     * @return ApiError contendo o código da mensagem e os detalhes
     */
    @ExceptionHandler(ParametrosException.class)
    public ResponseEntity<ApiError> handleParametrosException(ParametrosException exception) {
        return new ResponseEntity<>(new ApiError(exception.getMessagem().getValue()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGenericException(Exception exception) {
        return new ResponseEntity<>(new ApiError(ErrorMessages.ERRO_INTERNO.getValue()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}


