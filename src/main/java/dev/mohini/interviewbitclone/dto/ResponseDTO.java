package dev.mohini.interviewbitclone.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseDTO<T> {

    private HttpStatus httpStatus;
    private T data;

    public ResponseDTO(HttpStatus httpStatus, T data)
    {
        this.data=data;
        this.httpStatus=httpStatus;
    }
}
