package com.cas.handler;

import com.cas.common.AjaxResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // 处理所有未捕获的异常
    @ExceptionHandler(value = {Exception.class})
    protected AjaxResult handleGeneralError(Exception ex) {
        return AjaxResult.error("异常错误");
    }
}
