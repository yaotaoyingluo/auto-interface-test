package com.auto.yaotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther yaotao
 * @Date 2021/4/7
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AutoInterfaceTest{

    public static void main(String[] args){
        try {
            SpringApplication.run(AutoInterfaceTest.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
