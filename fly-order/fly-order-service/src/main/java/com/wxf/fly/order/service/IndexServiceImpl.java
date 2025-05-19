package com.wxf.fly.order.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Wxf
 * @since 2025-05-19 08:53:54
 **/
@Service
public class IndexServiceImpl implements IndexService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public String index() {
        return applicationName;
    }
}
