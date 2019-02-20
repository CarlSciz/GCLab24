<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SLURM User Registration</title>
</head>
<body>

<form action="/submit-user-registration" method="get">
<p> 
<label for="firstname">First Name:</label><input id="firstname" name="firstname" required minlength="1" maxlength="20"/>
</p>
<p>
<label>Last Name:</label><input name ="lastname" pattern= "[A-Z][a-z]*"/>
</p>
<p>
<label>DateOfBirth</label><input type = "number" name ="dob"/>
<p>
<label>Email:</label><input type ="email" name ="email"/>
</p>
<p>
<label>Phone Number:</label><input type ="number" name ="phone"/>
</p>
<p>
<label>Password:</label><input type ="password" name ="password"required minlength="5" maxlength="20"/>

</p>
<p>
<button>Submit</button>
</p>
</form>

</body>
</html>