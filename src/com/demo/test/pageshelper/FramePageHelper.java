package com.demo.test.pageshelper;

import org.openqa.selenium.By;

import com.demo.test.utils.SeleniumUtil;

/**
 * @author Gorky
 * @description 这个帮助类主要是进行iframe的跳进和跳出操作
 */

public class FramePageHelper {
	/**进入iframe-根据iframe的元素定位进入*/
	public static void jumpIntoFrame(SeleniumUtil seleniumUtil,By by) {
		seleniumUtil.switchFrame(seleniumUtil.findElementBy(by));
	}
	
	/**跳出iframe*/
	public static void jumpOut(SeleniumUtil seleniumUtil) {
		seleniumUtil.outFrame();
	}
}
