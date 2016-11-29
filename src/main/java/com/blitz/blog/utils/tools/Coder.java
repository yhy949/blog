package com.blitz.blog.utils.tools;
/**
 * 
 * @Description: 密码加密
 * @create Author: jianglong
 * @create Date: 2015-6-1
 */
public class Coder {
	
	public int k = 5;//位移量
	public int q=62; //字母表个数
	
//	
	public static char[] letterMap = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
	    'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
	    'w', 'x', 'y', 'z','0','1','2','3','4','5','6','7','8','9' ,'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
	    'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
	    'W', 'X', 'Y', 'Z'};
	
	/**
	 * 加密
	 * TODO
	 * @param String str(加密前字符串)
	 * @return  String加密后字符串
	 *
	 */
	
	public String encrypt(String str) {
		String code="";
		char[] strChar = str.toCharArray();
		for(int i=0;i<strChar.length;i++){
			
			int pos=findpos(strChar[i]);
			
			int nowpos=(pos+k)%q; 
			
			char temp=letterMap[nowpos];
			  code+=temp;
		}
		return code;
  
	  
	}
	
	/**
	 * 找到字符在字母表中的位置
	 * TODO
	 * @param char c(加密前字符)
	 * @return  int 加密前位置
	 *
	 */
	public int findpos(char c){
		for(int i=0;i<letterMap.length;i++){
			if(letterMap[i]==c) return i;
		 }
	  return -1;
			
	}
	
	/**
	 * 检查是否包含非法字符
	 * TODO
	 * @param String str(加密前字符)
	 * @return  boolean (true:不包含非法字符；false:包含非法字符)
	 *
	 */
	public boolean check(String str){
		 boolean flag=true;
		 char[]c=str.toCharArray();
		  for(int i=0;i<c.length;i++){
			  int hc=(int)c[i];
			  if((hc>=97&&hc<=122)||(hc>=65&&hc<=90)||(hc>=48&&hc<=57)){
				  flag=true;   
			  }
			  
			  else{
				  return false;    
			  }
		  }
		return flag;	
	}

	
	}




