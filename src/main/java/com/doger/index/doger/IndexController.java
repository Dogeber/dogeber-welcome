package com.doger.index.doger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IndexController
 * @Description index controller
 * @Author π«π.π΄ππππππππ
 * @Date 2022/5/7 11:52 δΈε
 * @ModifyDate 2022/5/7 11:52 δΈε
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(ModelMap map) {
        return "welcome";
    }
}
