package com.wxf.fly.account.controller;

import com.wxf.fly.account.service.IndexService;
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

    @GetMapping(value = "/index")
    public String index() {
        return indexService.index();
    }
}
