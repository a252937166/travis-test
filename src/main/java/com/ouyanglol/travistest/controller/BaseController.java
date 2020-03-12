package com.ouyanglol.travistest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyangduning
 */
@Slf4j
@RestController
public class BaseController {

    @GetMapping("t")
    public String t() {
        log.info("run...");
        return "ok";
    }

}
