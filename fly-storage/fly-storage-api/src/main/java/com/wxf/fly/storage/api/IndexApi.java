package com.wxf.fly.storage.api;

import com.wxf.fly.storage.constants.Constants;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Wxf
 * @since 2025-05-19 08:43:01
 **/
@FeignClient(name = Constants.clientName, path = Constants.prefix)
public interface IndexApi {

    String index();

}
