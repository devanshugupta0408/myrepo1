<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="get">
  <h1>Sign up</h1><br/>

  <span class="input"></span>
 NAME: <input type="text" name="name" placeholder="Full name" title="Format: Xx[space]Xx (e.g. Alex Cican)" autofocus autocomplete="off" required pattern="^\w+\s\w+$" /><br>
  <span class="input"></span>
  USERNAME: <input type="email" name="email" placeholder="Email address" required /><br>
  <span id="passwordMeter"></span>
  PASSWORD:<input type="password" name="password" id="password" placeholder="Password" title="Password min 8 characters. At least one UPPERCASE and one lowercase letter" required pattern="(?=^.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$"/><br>
  DOB: <input type="date" name="DOB"><br>
  Degree:<br>
  	<input type="checkbox" name="Post Graduate"> Post Graduate<br>
		<input type="checkbox" name="Graduate"> Graduate<br>
			<input type="checkbox" name="PhD">PhD<br>
		<input type="checkbox" name="DualDegree"> DualDegree<br>
			Country: <br>
		<select name="Country">
			<option value="India" >India</option>
			<option value="Pakistan">Pakistan</option>
			<option value="US" >US</option>
			<option value="Germany">Germany</option>
			<option value="UK" >UK</option>
			<option value="France">France</option>
		</select><br>
  <button type="submit" value="Sign Up" title="Submit form" class="icon-arrow-right"><span>Sign up</span></button>
</form>
</body>
</html>