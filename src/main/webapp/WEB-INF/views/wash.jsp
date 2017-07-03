<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show</title>
</head>
<body>
	<a href="/xiaomahuhu/wash.do?name=雪豹&sts=1&type=gong">check</a><br>
	宠物名称：${baby.catName}<br>
	宠物状态：${baby.sts}<br>
	宠物类型：${baby.catType}<br>
	宠物攻资：${baby.gong}&nbsp;&nbsp;上限：${baby.gongUp}&nbsp;&nbsp;普通：1550；变异：1650<br>
	宠物防资：${baby.fang}&nbsp;&nbsp;上限：${baby.fangUp}&nbsp;&nbsp;普通：1500；变异：1600<br>
	宠物体资：${baby.ti}&nbsp;&nbsp;上限：${baby.tiUp}&nbsp;&nbsp;普通：1500；变异：1600<br>
	宠物法资：${baby.fa}&nbsp;&nbsp;上限：${baby.faUp}&nbsp;&nbsp;普通：1500；变异：1600<br>
	宠物速资：${baby.su}&nbsp;&nbsp;上限：${baby.suUp}&nbsp;&nbsp;普通：1550；变异：1650<br>
	宠物携带技能：${baby.skill}<br>
</body>
</html>