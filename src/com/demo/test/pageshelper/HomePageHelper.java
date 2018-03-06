package com.demo.test.pageshelper;

import org.apache.log4j.Logger;

import com.demo.test.pages.HomePage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author Gorky
 * @description 首页帮助类：专门提供在这个页面进行操作的方法封装
 */

public class HomePageHelper {
	//提供本类中日志输出对象
	public static Logger logger = Logger.getLogger(HomePageHelper.class);
	
	/**
	 * 等待首页元素加载
	 */
	public static void waitHomePageLoad(SeleniumUtil seleniumUtil,int timeOut) {
		logger.info("开始等待首页元素加载");
//		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_IMAGE_INFO);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_UESERCOUNT);
		seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERNAME);
		logger.info("首页元素加载完毕");
	}
	
	/**
	 * 验证登录成功后首页的用户姓名是否正确
	 */
	public static void checkName(SeleniumUtil seleniumUtil,String name) {
		logger.info("开始检查用户姓名是不是："+name);
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_USERNAME), name);
		logger.info("用户名检查完毕,用户姓名是："+name);
	}
	
	/**
	 * 验证登录成功后验证首页的账号是否正确
	 */
	public static void checkAccount(SeleniumUtil seleniumUtil,String username) {
		seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_UESERCOUNT), username+"@163.com");
	}
}
