package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Gorky
 * @description 首页面元素定位声明
 */

public class HomePage {
	/**获取首页用户账号*/
	public static final By HP_TEXT_UESERCOUNT = By.id("spnUid");
	/**获取首页用户姓名*/
	public static final By HP_TEXT_USERNAME = By.xpath("//span[@id='_mail_component_145_145']/span[1]");
	/**获取首页天气预报图片*/
//	public static final By HP_IMAGE_INFO = By.xpath("//*[src='https://mimg.127.net/p/t.gif']");
}
