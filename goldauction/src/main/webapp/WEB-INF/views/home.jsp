<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" session="false"%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<form action="testTemp" meyhod="post">
<input type="text" name="no" id="no">
<button ytpe="submit">전송</button>
</form>
<P>  The time on the server is ${serverTime}. </P>

</body>
</html>
