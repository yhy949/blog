package com.blitz.blog.utils.interceptors;

import com.blitz.blog.utils.constants.SystemConstants;
import com.blitz.blog.web.model.user.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @Description:拦截未登录用户访问功能
 * @create Author:yhy
 * @create Date:2015-6-13
 * @version V1.0
 */
public class LoginNotInterceptor implements HandlerInterceptor {
	 private static final String[] IGNORE_URI = {"/images/","/js/","/css/","/login.jsp","index.jsp", "/getRandNum","/login/"};
	/**
     *
	 * 该方法在目标方法之前被调用.
	 * 若返回值为 true, 则继续调用后续的拦截器和目标方法. 
	 * 若返回值为 false, 则不会再调用后续的拦截器和目标方法. 
	 * 
	 * 可以考虑做权限. 日志, 事务等. 
	 */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	 User employee = (User)request.getSession().getAttribute(SystemConstants.LOGIN_USER);
    	 boolean flag = false;
         String url = request.getRequestURL().toString();
         for (String s : IGNORE_URI) {
             if (url.contains(s)) {
                 flag = true;
                 break;
             }
         }
         if (!flag) {
             if (employee != null){
            	 flag = true;
             }else{
            	 flag = false;
            	 response.sendRedirect("/aty/index.jsp");
             }
           }
         return flag;
    }
	/**
	 * 调用目标方法之后, 但渲染视图之前. s
	 * 可以对请求域中的属性或视图做出修改. 
	 */

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	/**
	 * 渲染视图之后被调用. 释放资源
	 */

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		
	}

  }
