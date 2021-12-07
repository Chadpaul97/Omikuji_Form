<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h2>Send an Omikuji</h2>
	<form action="/send" method="post" class="container">
	  <label for="number">Pick any number 5 to 25.</label><br>
	  <input type="number" id="number" min="5" max="25" name="number"
	  ><br><br>
	  <label for="city">Enter the name of any city</label><br>
	  <input type="text" placeholder="city" name="city"><br><br>
	  <label for="person">Enter the name of any real person</label><br>
	  <input type="text" placeholder="person" name="person"><br><br>
	  <label for="hobby">Enter professional endeavor or hobby:</label><br>
	  <input type="text" placeholder="hobby" name="hobby"><br><br>
	  <label for="livingthing">Enter any type of living thing:</label><br>
	  <input type="text" placeholder="livingthing" name="livingthing"><br><br>
	  <label for="comment">Say something nice to someone:</label><br>
	   <input type="text" placeholder="comment" name="comment"><br><br>
	  <p> Send and show a friend</p>
	  <input type="submit" value="Send">
	</form>
</body>
</html>