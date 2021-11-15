package com.lw.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @className: MyDesc
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/15 13:50
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDesc {
    String describe() default "my describe";
}
