package com.cas.handler;

import com.cas.common.AjaxResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ResponseWrapperAspect {
    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public Object wrapResponse(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue = joinPoint.proceed(); // 执行原方法
        if (!(returnValue instanceof AjaxResult)) {
            // 如果返回值不是ResponseEntity，自动包装
            return AjaxResult.success(returnValue);
        }
        return returnValue; // 已经是ResponseEntity，直接返回
    }
}
