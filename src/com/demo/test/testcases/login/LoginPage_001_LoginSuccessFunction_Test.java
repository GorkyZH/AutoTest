package com.demo.test.testcases.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;

/**
 * @author Gorky
 * @description 登录之后验证用户名是不是正确的
 */

public class LoginPage_001_LoginSuccessFunction_Test extends BaseParpare{
	@Test(dataProvider="testData")
	public void loginSuccessFunction(Map<String,String> data) throws InterruptedException {
		//等待登录页面加载
		LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut); 
		//输入登录信息
		LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));
		//等待首页元素显示出来
		HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		//检查用户姓名是不是期望的“郑虹”
		HomePageHelper.checkName(seleniumUtil, data.get("NAME"));
		//检查用户账号是不是期望的“gorky1112@163.com”
		HomePageHelper.checkAccount(seleniumUtil, data.get("USERNAME"));
	}
}
