package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Gorky
 * @description 登录页面元素定位声明
 */

public class LoginPage {
	/**用户名输入框*/
	public static final By LP_INPUT_USERNAME = By.name("email");
	
	/**密码输入框*/
	public static final By LP_INPUT_PASSWORD = By.name("password");
	
	/**登录按钮*/
	public static final By LP_BUTTON_LOGIN = By.id("dologin");
	
	/**登录错误信息*/
	public static final By LP_TEXT_ERROR = By.className("ferrorhead");
	
	/**继续登录按钮*/
//	public static final By LP_BUTTON_CLOGIN = By.id("auto-id-1519970769086");
}
