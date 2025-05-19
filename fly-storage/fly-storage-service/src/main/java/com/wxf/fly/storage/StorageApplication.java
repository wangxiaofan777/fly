package com.wxf.fly.storage;

import com.wxf.fly.account.api.AccountIndexApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 库存服务
 *
 * @author Wxf
 * @since 2025-05-08 17:38:12
 **/
@EnableFeignClients(
        clients = {
                AccountIndexApi.class
        }
)
@EnableDiscoveryClient
@SpringBootApplication
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
