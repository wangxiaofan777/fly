package com.wxf.fly.account.api;

import com.wxf.fly.account.service.IndexService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author Wxf
 * @since 2025-05-19 08:52:34
 **/
@Service
public class AccountIndexApiImpl implements AccountIndexApi {

    @Resource
    private IndexService indexService;

    @Override
    public String index() {
        return indexService.index();
    }
}
