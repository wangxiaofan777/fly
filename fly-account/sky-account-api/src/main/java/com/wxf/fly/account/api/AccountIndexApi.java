package com.wxf.fly.account.api;

import com.wxf.fly.account.constants.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Wxf
 * @since 2025-05-19 08:43:01
 **/
@FeignClient(name = Constants.clientName, path = Constants.prefix)
public interface AccountIndexApi {

    @GetMapping(value = "/index")
    String index();

}
