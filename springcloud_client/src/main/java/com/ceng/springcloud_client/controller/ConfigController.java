package com.ceng.springcloud_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cengizhan Ozcan on 5.04.2018.
 */
@RestController
public class ConfigController {

    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky is: " + luckyWord;
    }
}
