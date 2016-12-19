package com.blitz.blog.web.controller.login;

import com.blitz.blog.web.base.impl.BaseController;
import com.blitz.blog.web.model.blog.BlogUser;
import com.blitz.blog.web.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by my on 2016/12/7.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

//    @Autowired
//    private UserService userService;
    @Autowired
    private BlogUserService blogUserService;

//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @PostConstruct
//    public void test(){
//        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
//        Object userService = applicationContext.getBean("userService");
//        System.out.print(userService);
//    }

    @RequestMapping("/index")
    public String index() {

        BlogUser user =  blogUserService.get("admin");
        System.out.print(user);
        return "/blog/blog";
    }

}
