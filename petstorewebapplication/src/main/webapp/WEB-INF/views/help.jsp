<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.controller.HomeController,java.util.List"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is help Page</h1>
	<h2>please!, "Tell Me what do you want"</h2>

	<%
	/*
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> city = (List<String>) request.getAttribute("city");
	*/
	%>

	<h2>
		Your name is:-
		<%--  <%=name%>  --%>
		<!-- Comment -->
		${name }

		<h2>
			Your I'D is:-
			<%-- <%=id%>  --%>
			${id }

		</h2>

		<h2>Cities where services Available ${city }</h2>

		<%-- 
	<%
	for (String c : city) {
	%>
	<h2><%=c%></h2>
	<%
	}
	%>
	--%>
</body>
</html>