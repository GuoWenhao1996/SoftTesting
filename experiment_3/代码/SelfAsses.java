package com.gwh.JUnit;

/**
 * 2017-6-14 20:11:13<br>
 * <b>实训二</b>中的一个样例函数<br>
 * 该函数用于对提交的自我评价进行判断<br>
 * 如果为空：提醒用户为空，是否提交。是->提交 不是->不提交<br>
 * 如果不为空：提交。<br>
 * <b>注：</b> 函数源码为JavaScript语言编写<br>
 * 现转换为Java语言描述<br>
 * 稍微改变一下语法，拿来测试使用<br>
 * <b>js函数源码：</b>
 * <textarea>
 * 	function isNull() {
		if (document.getElementById("selfAssess").value.trim().length == 0) {
			var flag = confirm("当前自我评价为空，是否保存？");
			if (flag) {
				document.getElementById('selfAssForm').action = "/UniversityOfShaft/UpdateSelfAssess.do#test3";
				alert("自我评价修改为空！");
			} else {
				document.getElementById('selfAssForm').action = "/UniversityOfShaft/listAssess.do#test3";
				alert("未提交");
			}
		} else {
			alert("自我评价修改成功！");
			document.getElementById('selfAssForm').action = "/UniversityOfShaft/UpdateSelfAssess.do#test3";
		}
 * </textarea>
 * @author guowenhao
 *
 */
public class SelfAsses {
	public static String isNull(String selfAssess, boolean bool) {
		if (selfAssess == null || selfAssess.trim().length() == 0) {
			if (bool) {
				return "自我评价修改成功！";
			} else {
				return "未提交！";
			}
		} else {
			return "自我评价修改成功！";
		}
	}
}
