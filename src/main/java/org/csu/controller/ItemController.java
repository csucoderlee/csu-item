package org.csu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiang on 2017 07 09 下午11:16.
 */
@RestController
public class ItemController {

    @GetMapping("getProductInfo")
    public Object itemDetail(Long productId) {
        return "{\"id\": " + productId + ", " +
                "\"name\": \"iphone7手机\", \"price\": 5599, " +
                "\"pictureList\":\"a.jpg,b.jpg\"," +
                " \"specification\": \"iphone7的规格\"," +
                " \"service\": \"iphone7的售后服务\", " +
                "\"color\": \"红色,白色,黑色\", " +
                "\"size\": \"5.5\", " +
                "\"shopId\": 1, " +
                "\"modifiedTime\": \"2017-01-01 12:00:00\"}";
    }
}
