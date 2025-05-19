package com.wxf.fly.order;

import com.wxf.fly.account.api.AccountIndexApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单服务
 *
 * @author Wxf
 * @since 2025-05-08 17:36:54
 **/
@EnableFeignClients(
        clients = {
                AccountIndexApi.class
        }
)
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
