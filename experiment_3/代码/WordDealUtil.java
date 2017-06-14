package com.gwh.JUnit;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 2017-6-14 19:33:56<br>
 * <b>JUnit测试二</b><br>
 * 用于转换字符串格式<br>
 * 将Java对象字符串转换为数据库中的格式
 * 
 * @author guowenhao
 *
 */
public class WordDealUtil {
	/**
	 * 将Java对象名称（每个单词的头字母大写）<br>
	 * 按照数据库命名的习惯进行格式化<br>
	 * 格式化后的数据为小写字母<br>
	 * 并且使用下划线分割命名单词
	 * 
	 * @param name
	 *            Java对象名称
	 * @return 该名称的数据库格式
	 */
	public static String wordFormat4DB(String name) {
		if (name == null) {
			return null;
		}

		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher(name);
		StringBuffer strbuff = new StringBuffer();
		while (m.find()) {
			if (m.start() != 0)
				m.appendReplacement(strbuff, "_" + m.group());
		}
		return m.appendTail(strbuff).toString().toLowerCase();
	}
}
