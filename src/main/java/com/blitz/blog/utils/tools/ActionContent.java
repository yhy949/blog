package com.blitz.blog.utils.tools;

import com.blitz.blog.utils.constants.SystemConstants;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;



/**
 * 
 * @Author: my
 * @CreatDate: 2015年9月18日
 * @Version:
 */
public class ActionContent {
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		HttpServletRequest req = attr.getRequest();
		return req;
	}

	public static String getLoginCookieKey() {
		HttpServletRequest req = getRequest();
		String cookieKey = HttpUtil.getCookieValue(SystemConstants.LOGIN_USERNAME, null, req);
		return cookieKey;
	}
	

	
	public static String getLoginCookieKey(String paraName) {
		HttpServletRequest req = getRequest();
		String cookieKey = HttpUtil.getCookieValue(paraName, null, req);
		return cookieKey;
	}
	

	
	/**
	 * 获取IP
	 * @return
	 */
	public static String getIpAddr() {
		HttpServletRequest request = getRequest();
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 获取本机IP
	 * @return
	 */
	public static String getIpAddrSelf() {
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			return addr.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "";
	}



}
