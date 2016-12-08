package com.blitz.blog.utils.tools;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**http操作
 * @Description:
 * @Author:MaJi
 * @CreatDate:2015年9月9日
 * @Version:V1.0
 */
public class HttpUtil {

	/**
	 * 设置cookie
	 * @param param
	 * @param value
	 */
	public static void setCookieValue(String param, String value,HttpServletResponse response,HttpServletRequest request) {
		//String host = request.getServerName();
		try {
			Cookie cookie = new Cookie(param, URLEncoder.encode(value,"UTF-8"));
			cookie.setPath("/");// cookie有效路径是网站根目录
			//cookie.setDomain(host);
			cookie.setMaxAge(24 * 60 * 60 * 30);
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {e.printStackTrace();}
	}
	
	/**
	 * 获取coolie
	 * @param param
	 * @return
	 */
	public static String getCookieValue(String param,HttpServletResponse response,HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		if (cookies == null || cookies.length == 0) {
			return null;
		}
		for (Cookie cookie : cookies) {
			if (param.equals(cookie.getName())) {
				try {
					return URLDecoder.decode(cookie.getValue(), "UTF-8");
				} catch (UnsupportedEncodingException e) {}
			}
		}
		return null;
	}
	
	/**
	 * 删除cookie
	 */
	public static void deleteCookie(HttpServletRequest request, HttpServletResponse response) {
		String host = request.getServerName(); 
		Cookie[] cs = request.getCookies();
		if (cs != null && cs.length > 0) {
			for (int i = 0; i < cs.length; i++) {
				Cookie cookie = cs[i];
				Cookie cookies = new Cookie(cookie.getName(), null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				cookie.setDomain(host);
				response.addCookie(cookie);
			}
		}
	}
	
	public static void deleteCookie(String name,HttpServletResponse response,HttpServletRequest request) {
		
		Cookie[] cs = request.getCookies();
		if (cs != null && cs.length > 0) {
			for (int i = 0; i < cs.length; i++) {
				Cookie cookie = cs[i];
				if(name.equals(cookie.getName())) {
					Cookie cookienew = new Cookie(cookie.getName(), null);
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
		}
	}
	
	public static void DELETE_COOKIE(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cs = request.getCookies();
		if (cs != null && cs.length > 0) {
			for (int i = 0; i < cs.length; i++) {
				Cookie cookie = cs[i];
				Cookie cookies = new Cookie(cookie.getName(), null);
				cookie.setMaxAge(0);
				cookie.setPath("/");
				cookie.setDomain("");
				response.addCookie(cookie);
			}
		}
	}
	
}
