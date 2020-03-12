package com.ouyanglol.travistest.controller;

import com.ouyanglol.travistest.TravisTestApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ouyangduning
 * @date 2020/3/12 3:31 下午
 */
class BaseControllerTest extends TravisTestApplicationTests {

    @Autowired
    private BaseController baseController;

    @Test
    void t() {
        baseController.t();
    }

}