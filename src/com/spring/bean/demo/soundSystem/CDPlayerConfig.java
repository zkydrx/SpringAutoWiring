package com.spring.bean.demo.soundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Created by ZKY on 2017-07-29 17:20.
 */
@Configuration
//通过制定基础扫描包实现自动装配
//@ComponentScan(basePackages = "com.spring.bean.demo.soundSystem")
//通过value属性指定包的名称(value可不写)
//@ComponentScan(value="com.spring.bean")
//通过指定包中所包含的类或者接口
@ComponentScan(basePackageClasses = {SgtPeppers.class,CompactDisc.class})
public class CDPlayerConfig
{
}
