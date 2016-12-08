package com.blitz.blog.web.controller.login;

import com.blitz.blog.web.base.impl.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by my on 2016/12/7.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @RequestMapping("/index")
    public String index() {

        return "/blog/blog";
    }

}
