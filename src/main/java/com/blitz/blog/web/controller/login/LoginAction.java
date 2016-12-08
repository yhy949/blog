package com.blitz.blog.web.controller.login;

import com.blitz.blog.web.base.impl.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by my on 2016/12/7.
 */
@Controller
@RequestMapping("/login")
public class LoginAction extends BaseAction{

    @RequestMapping("/index.do")
    public String index() {

        return "/blog/blog";
    }

}
