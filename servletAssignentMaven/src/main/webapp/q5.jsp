<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action = "q5Servlet1" method="post">
			<select name="course" id="course">
			  <option value="java" action="q5java">Java</option>
			  <option value="linux">Linux</option>
			  <option value="dbms">DBMS</option>
			
				</select>
	
			<div>
			<button type="submit" class="btn btn-outline-success  text-black" >Submit</button>
			<button type="reset" class="btn btn-outline-warning custom-bg text-white ">Reset</button>
		</div>
			
			</form>
	</div>
</body>
</html>