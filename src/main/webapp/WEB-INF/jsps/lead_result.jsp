<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h3>Lead Details</h3>
<hr>
${error}
<br/>
Lead Id:${lead.id}<br/>
First Name:${lead.firstName}<br/>
Last Name:${lead.lastName}<br/>
City:${lead.city}<br/>
Email:${lead.email}<br/>
Mobile:${lead.mobile}<br/>


</body>
</html>