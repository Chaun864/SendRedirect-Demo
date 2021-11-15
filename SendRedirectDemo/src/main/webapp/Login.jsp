
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SevletPage" method="post">
Enter User name <input type="text" name="userName" required><br>

Enter password <input type="password" name="password" required><br>
<input type="submit" value="login">
</form>
<%
String message=request.getParameter("message");

if("invalid".equals(message))
{
%>
<p>Wrong password or user name, please try again!</p>
<%} %>
</body>
</html>