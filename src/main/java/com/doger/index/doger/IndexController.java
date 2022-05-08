package com.doger.index.doger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IndexController
 * @Description index controller
 * @Author 𝑫𝒓.𝑴𝒂𝒏𝒉𝒂𝒕𝒕𝒂𝒏
 * @Date 2022/5/7 11:52 上午
 * @ModifyDate 2022/5/7 11:52 上午
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(ModelMap map) {
        return "welcome";
    }
}
