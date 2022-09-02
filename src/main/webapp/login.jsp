<h2>JAVA BY KIRAN</h2>
<h2>Account Login</h2>
<%
String message = (String) request.getAttribute("msg");
if(message!=null){
 out.print(message);
}
%>
<form action="login" method="post" />
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="username" /></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password" /></td>
</tr>
<tr>
<input type="submit" value="Login" />
</tr>
</table>
</form>