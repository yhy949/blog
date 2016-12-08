package com.blitz.blog.web.base.impl;

import com.blitz.blog.utils.tools.ActionContent;
import com.blitz.blog.web.model.returnbean.ReturnBody;
import net.sf.json.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**rest父类
 * @Description:
 * @Author:MaJi
 * @CreatDate:2015年8月6日
 * @Version:V1.0
 */
public class BaseAction {

	protected Logger log = Logger.getLogger(getClass());

	/*@Autowired
	private ObjectFactory<Validator> prototypeValidator;*/



	private static String basePath;

	/**
	 * 
	 * @author wangzhe
	 * @return
	 */
	public String getBasePath() {
		if (null == basePath) {
			HttpServletRequest request = ActionContent.getRequest();
			String path = request.getContextPath();
			basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path
					+ "/";
		}
		return basePath;
	}

	/**
	 * 验证相关的组件,scope级别不一样使用不同方式来获得
	 * 当前vaidator是request级别
	 * @return
	 */
	/*public Validator getValidator() {
		return prototypeValidator.getObject();
	}*/

	/**
	 * 简单传参，适用于不需要后台交互的部分数据，或直接从action中能获得的数据
	 * @param model
	 * @param attributeName
	 * @param Object
	 */
	public void converModelSimple(Model model, String attributeName, Object object) {
		model.addAttribute(attributeName, object);
	}

	/**
	 * 默认处理成功，不返回任何数据
	 * @param model
	 */
	public void converModelSucess(Model model) {
		converModelSucess(model, "处理成功!", null, "returnData");
	}

	/**
	 * 默认处理成功，默认attributeName
	 * @param model
	 * @param obj
	 */
	public void converModelSucess(Model model, Object obj) {
		converModelSucess(model, "处理成功!", obj, "returnData");
	}

	/**
	 * 默认处理成功，自定义attributeName
	 * @param model
	 * @param obj
	 * @param attributeName
	 */
	public void converModelSucess(Model model, Object obj, String attributeName) {
		converModelSucess(model, "处理成功!", obj, attributeName);
	}

	/**
	 * 默认处理成功，默认attributeName,自定义返回信息
	 * @param model
	 * @param message
	 * @param obj
	 */
	public void converModelSucess(Model model, String message, Object obj) {
		converModelSucess(model, message, obj, "returnData");
	}

	/**
	 * 默认处理成功，自定义attributeName,自定义返回信息
	 * @param model
	 * @param message
	 * @param obj
	 * @param attributeName
	 */
	public void converModelSucess(Model model, String message, Object obj, String attributeName) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage(message);
		if (obj != null) {
			body.setData(obj);
		}
		model.addAttribute(attributeName, body);
	}

	/**
	 * 默认处理失败，默认attributeName
	 * @param model
	 */
	public void converModelFaild(Model model) {
		converModelFaild("returnData", model);
	}

	/**
	 * 默认处理失败，自定义attributeName
	 * @param attributeName
	 * @param model
	 */
	public void converModelFaild(String attributeName, Model model) {
		ReturnBody body = new ReturnBody();
		body.setStatus(false);
		body.setMessage("处理失败!");
		model.addAttribute(attributeName, body);
	}

	/**
	 * 默认处理失败，默认attributeName,自定义返回信息
	 * @param model
	 * @param message
	 */
	public void converModelFaild(Model model, String message) {
		converModelFaild("returnData", model, message);
	}

	/**
	 * 默认处理失败，自定义attributeName,自定义返回信息
	 * @param attributeName
	 * @param model
	 * @param message
	 */
	public void converModelFaild(String attributeName, Model model, String message) {
		ReturnBody body = new ReturnBody();
		body.setStatus(false);
		body.setMessage(message);
		model.addAttribute(attributeName, body);
	}

	/**
	 * 自定义
	 * @param model
	 * @param code
	 * @param msg
	 * @param obj
	 */
	public void converModel(Model model, boolean code, String msg, Object obj) {
		ReturnBody body = new ReturnBody();
		body.setStatus(code);
		body.setMessage(msg);
		body.setData(obj);
		model.addAttribute("returnData", body);
	}

	/**
	 * 自定义
	 * @param model
	 * @param code
	 * @param msg
	 * @param obj
	 * @param attributeName
	 */
	public void converModel(Model model, boolean code, String msg, Object obj, String attributeName) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage(msg);
		body.setData(obj);
		model.addAttribute(attributeName, body);
	}

	public void toVM(String key, Object obj, ModelMap modemap) {
		modemap.put(key, obj);
	}



	/**
	 * 默认处理成功，返回ReturnBody对象
	 * @param obj
	 * @return
	 */
	public ReturnBody converReturnBodySuccess(Object obj) {
		ReturnBody returnBody = new ReturnBody();
		returnBody.setData(obj);
		return returnBody;
	}
	
	public ReturnBody converReturnBodySuccess(String messege,Object obj) {
		ReturnBody returnBody = new ReturnBody();
		returnBody.setMessage(messege);
		returnBody.setData(obj);
		return returnBody;
	}

	/**
	 * 默认处理成功，返回ReturnBody对象,只标识true
	 * @return
	 */
	public ReturnBody converReturnBodySuccess() {
		ReturnBody returnBody = new ReturnBody();
		return returnBody;
	}

	/**
	 * 默认处理失败，返回ReturnBody对象
	 * @return
	 */
	public ReturnBody converReturnBodyFailed() {
		return converReturnBodyFailed("操作失败");
	}

	/**
	 * 默认处理失败，返回ReturnBody对象,自定义返回错误信息
	 * @param statement
	 * @return
	 */
	public ReturnBody converReturnBodyFailed(String statement) {
		ReturnBody returnBody = new ReturnBody();
		returnBody.setStatus(false);
		returnBody.setMessage(statement);
		return returnBody;
	}

	/**
	 * 默认处理Ajax验证失败
	 * @param list
	 */
	public ReturnBody convertVerifyFaildForAjax(List<Map<String, String>> l) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", false);
		retMap.put("fieldError", JSONArray.fromObject(l));
		body.setData(retMap);
		return body;
	}

	/**
	 * 验证组件
	 * @param va
	{
		"status": true,
		"message": "服务器响应成功",
		"data": {
			"status": false,
			"globalError": "用户名和密码不匹配，或其它错误",		
			"fieldError" : [
				{
					"name": "userName",
					"errorMessage": "用户名不存在"
				},
				{
					"name": "passWord",
					"errorMessage": "密码错误"
				}
			]
		}
	}
	*/
	/*public ReturnBody validationFail(Validator va) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", false);

		JSONArray arr = new JSONArray();
		if (va != null) {
			// 普通字段验证
			for (ValidatorResult vr : va.getValidatorResultMap().values()) {
				if (StringUtils.equalsIgnoreCase(vr.getCheckerName(), "error")) {
					continue;
				}
				JSONObject obj = new JSONObject();
				obj.put("name", vr.getCheckerName());
				obj.put("errorMessage", vr.getMsg());
				arr.add(obj);
			}

			// 服务器一类的报错使用error
			ValidatorResult vr = va.getValidatorResultMap().get("error");
			if (vr != null) {
				retMap.put("globalError", vr.getMsg());
			}
		}
		retMap.put("fieldError", arr);
		body.setData(retMap);
		return body;
	}*/

	/**
	 * 默认处理Ajax请求成功
	 * @param bodyMsg,childMsg
	 */
	public ReturnBody converModelSucessAjax(String childMsg) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", true);
		retMap.put("message", childMsg);
		body.setData(retMap);
		return body;
	}

	/**
	 * 默认处理Ajax请求成功
	 * @param
	 */
	public ReturnBody converModelSucessAjax(String childMsg, Object obj) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", true);
		retMap.put("message", childMsg);
		retMap.put("data", obj);
		body.setData(retMap);
		return body;
	}

	/**
	 * 默认处理Ajax请求成功并且跳转
	 * @param bodyMsg,url
	 */
	public ReturnBody converModelSucessAjaxForDerict(String url) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", true);
		retMap.put("location", url);
		body.setData(retMap);
		return body;
	}

	/**
	 * Ajax处理业务异常情况
	 * @param bodyMsg,childMsg
	 */
	public ReturnBody converModelFaildAjax(String msg) {
		ReturnBody body = new ReturnBody();
		body.setStatus(false);
		body.setMessage(msg);
		Map<String, Object> retMap = new HashMap<String, Object>();
		body.setData(retMap);
		return body;
	}
	
	/**
	 * Ajax处理业务异常情况
	 * @param bodyMsg,childMsg
	 */
	public ReturnBody converModelFaildAjax(String msg, @SuppressWarnings("rawtypes") Map retMap) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage(msg);
		
		ReturnBody body2 = new ReturnBody();
		body2.setStatus(false);
		body2.setMessage(msg);
		body2.setData(retMap);
		
		body.setData(body2);
		return body;
	}

	/**
	 * Ajax处理业务异常情况
	 * @param bodyMsg,childMsg
	 */
	public ReturnBody converModelFaildAjax(String msg, boolean type) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", type);
		retMap.put("message", msg);
		body.setData(retMap);
		return body;
	}






	/**
	 * 默认处理Ajax验证失败
	 * @param list
	 */

	public void converModelSucess3(Model model, Object obj, String attributeName, String name) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("处理成功!");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put(name, obj);
		body.setData(retMap);
		model.addAttribute(attributeName, body);
	}
	
	/**
	 * 自动拼接url,使用request,contextpath
	 * @param url
	 * @return
	 * @author Wen
	 */
	public ReturnBody ajaxRedirect(String url) {
		String path = url;
		HttpServletRequest req = ActionContent.getRequest();
		if(req != null){
			path = req.getContextPath() + url ;
		}
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("成功");
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("status", true);
		retMap.put("location", path);
		body.setData(retMap);
		return body;
	}
	
	/**
	 *类似格式	
	 * status:
	 *	message:
	 *	data: {
	 *		earnest:
	 *	}
	 * @param obj
	 * @author Wen
	 * @return
	 */
	public ReturnBody ajaxSuccess(Object obj) {
		ReturnBody body = new ReturnBody();
		body.setStatus(true);
		body.setMessage("success");
		body.setData(obj);
		return body;
	}
	
	public ReturnBody ajaxReturn(boolean ret,String msg,Object obj) {
		ReturnBody body = new ReturnBody();
		body.setStatus(ret);
		body.setMessage(msg);
		body.setData(obj);
		return body;
	}

	/**
	 * 放置错误消息
	 * @param model
	 */
	/*public boolean putErrorsMsg(Model model, Validator va) {
		boolean hasError = va.existErrorMsg();
		if (hasError) {
			model.addAttribute("errors", va.getValidatorResultMap());
		}
		return hasError;
	}*/

	protected boolean equalsIgnoreCase(String str1, String str2) {
		return StringUtils.equalsIgnoreCase(str1, str2);
	}

	protected void logInfo(String msg) {
		log.info("*******" + msg + "*******");
	}
}
