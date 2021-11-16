package com.lw.aspect;

import com.lw.annotation.MyDesc;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @className: MyAspect SpringBoot整合AOP面向切面编程
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/15 10:29
 **/
@Aspect //需要配合@Configuration注解，@Aspect才能生效
@Configuration
public class MyAspect {

    //定义一个切入点方法，testPoint，返回值必须为void，不需要写方法体
    //填写切入点表达式，匹配哪些方法需要执行方法 == com.lw.controller包及子包下的所有方法
    @Pointcut("execution(* com.lw.controller..*.*(..))")
    public void testPoint() {}

    //定义前置通知
    @Before("testPoint()")
    public void before(JoinPoint joinPoint) {
        System.out.println("获取方法签名=" + joinPoint.getSignature());
        System.out.println("获取目标方法名称=" + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        System.out.println("获取目标方法的参数=" + Arrays.asList(args));
    }

    //定义后置通知，目标方法执行完
    @After("testPoint()")
    public void after() {
        System.out.println("后置通知@After执行完毕");
    }

    //定义新的切入点
    @Pointcut("execution(* com.lw.controller..*.aspect2(..))")
    public void around() {}

    //定义环绕通知，返回值必须为Object，参数必须携带ProceedingJoinPoint
    //顺序：环绕 - 前置 - 目标方法执行 - 后置
    @Around("around()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {

        try {
            System.out.println("环绕通知开始执行");
            Object obj = proceedingJoinPoint.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    //也可以不定义切入点方法，直接在通知注解编写切入点表达式
    @Around("execution(* com.lw.bean..*.*(..))")
    public Object around2(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("环绕通知开始执行");
            System.out.println("获取目标方法签名=" + proceedingJoinPoint.getSignature());
            System.out.println("获取目标方法名称=" + proceedingJoinPoint.getSignature().getName());
            System.out.println("获取目标方法参数=" + Arrays.asList(proceedingJoinPoint.getArgs()));
            return proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("捕捉到目标方法异常" + throwable);
            throwable.printStackTrace();
        }
        return null;
    }

    //自定义注解+切面编程,这里表示同时满足表达式+被@MyDesc注解
    @Around(value = "execution(* com.lw.service..*.*(..)) && @annotation(myDesc)")
    public Object around3(ProceedingJoinPoint proceedingJoinPoint, MyDesc myDesc) {
        try {
            System.out.println("环绕通知开始了");
            System.out.println("注解的描述为：" + myDesc.describe());
            return proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
