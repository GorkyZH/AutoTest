package com.demo.test.pageshelper;

import org.apache.log4j.Logger;

import com.demo.test.pages.FramePage;
import com.demo.test.pages.LoginPage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author Gorky
 * @description 登录页面帮助类：提供在这个页面上做的操作的方法封装
 */

public class LoginPageHelper {
	//提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(LoginPageHelper.class);

	/**
	 * 等待登录页面元素加载
	 */
	public static void waitLoginPageLoad(SeleniumUtil seleniumUtil,int timeOut) {
		seleniumUtil.pause(1000);
		//先进入login iframe中，才能找到登录界面的元素
		FramePageHelper.jumpIntoFrame(seleniumUtil, FramePage.FP_FRAME_LOGIN);
		logger.info("开始检查登录页面元素");
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_USERNAME);
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_INPUT_PASSWORD);
		seleniumUtil.waitForElementToLoad(timeOut, LoginPage.LP_BUTTON_LOGIN);
		logger.info("检查登录页面元素完毕");
	}
	
	/**
	 * 登录操作封装
	 * @throws InterruptedException 
	 */
	public static void typeLoginInfo(SeleniumUtil seleniumUtil,String username,String password) throws InterruptedException {
		logger.info("开始输入登录信息");
		//清空用户名输入框
		seleniumUtil.clear(LoginPage.LP_INPUT_USERNAME);
		//输入用户名到用户名输入框
		seleniumUtil.type(LoginPage.LP_INPUT_USERNAME, username);
		//清空密码输入框
		seleniumUtil.clear(LoginPage.LP_INPUT_PASSWORD);
		//输入密码到密码输入框
		seleniumUtil.type(LoginPage.LP_INPUT_PASSWORD, password);
		logger.info("输入登录信息完毕");
		Thread.sleep(3000);
		//点击登录按钮
		seleniumUtil.click(LoginPage.LP_BUTTON_LOGIN);
	}
	
	/**
	 * 验证登录错误信息
	 */
	public static void checkLoginErrorInfo(SeleniumUtil seleniumUtil,String errorInfo) {
		seleniumUtil.isTextCorrect(seleniumUtil.getText(LoginPage.LP_TEXT_ERROR), errorInfo);
	}
}
