<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>  
<body>  
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
</form>  
</body>  
</html> 