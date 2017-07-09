package org.csu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiang on 2017 07 09 下午11:16.
 */
@RestController
public class ItemController {

    @GetMapping
    public Object itemDetail() {
        return "hello csu-item itemdetail";
    }
}
