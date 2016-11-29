package com.blitz.blog.utils.tools;
import java.nio.charset.Charset;

/**
 * 字符串工具类
 * @author jianglong
 */
public class StringUtils {
	
	/**
	 * 将字符串有某种编码转变成另一种编码
	 * @param string 编码的字符串
	 * @param originCharset 原始编码格式
	 * @param targetCharset 目标编码格式
	 * @return String 编码后的字符串
	 */
	public static String encodeString(String string,Charset originCharset,Charset targetCharset){
		return string=new String(string.getBytes(originCharset),targetCharset);
	}
	//获取字符串某一部分
	public static String subString(String str,int start, int end){
		return str.substring(start,end);
	}
	
	
}
