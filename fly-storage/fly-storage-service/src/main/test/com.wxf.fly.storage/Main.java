package com.wxf.fly.storage;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 时间测试类
 *
 * @author maosong.wang
 * @since 2025/7/11 14:59:42
 */
public class Main {

    public static void main(String[] args) {
//        2025-07-11T15:03:46.985629200+08:00[Asia/Shanghai]
        System.out.println(ZonedDateTime.now());

//        2025-07-11T07:03:46.985629200Z[UTC]
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC")));

//        2025-07-11T15:03:46.985629200+08:00[UTC+08:00]
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC+8")));

        // Fri Jul 11 15:05:30 CST 2025
        System.out.println(Date.from(ZonedDateTime.now().toInstant()));

        // Fri Jul 11 15:16:38 CST 2025
        System.out.println(new Date());

    }
}
