package com.wxf.fly.order.controller;

import com.wxf.fly.account.api.AccountIndexApi;
import com.wxf.fly.order.service.IndexService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index Controller
 *
 * @author Wxf
 * @since 2025-05-19 08:34:46
 **/
@RestController
public class IndexController {

    @Resource
    private IndexService indexService;
    @Resource
    private AccountIndexApi accountIndexApi;

    @GetMapping(value = "/index")
    public String index() {
        return indexService.index();
    }

    @GetMapping(value = "/index/account")
    public String accountIndexApi() {
        return accountIndexApi.index();
    }
}
