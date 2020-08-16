package com.fh.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
      public JsonData exception(Exception e){
          return JsonData.getJsonDataError(e.getMessage());
      }
}
