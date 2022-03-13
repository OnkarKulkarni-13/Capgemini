<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.controller.HomeController,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is a Onkar Kulkarni</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer Id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>

	<h1>
		Name is:-
		<%=name%></h1>
	<h1>
		I'd is:-
		<%=Id%></h1>

	<h3>List of Friends:-</h3>
	<%
	for (String s : friends) {
	%>
	<h2><%=s%></h2>
	<%
	}
	%>

</body>
</html>