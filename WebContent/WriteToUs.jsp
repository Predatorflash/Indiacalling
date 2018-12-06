<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Write To Us!</title>
<style type="text/css">
.form-style-7 {
	max-width: 400px;
	margin: 50px auto;
	background: #fff;
	border-radius: 2px;
	padding: 20px;
	font-family: Georgia, "Times New Roman", Times, serif;
}

.form-style-7 h1 {
	display: block;
	text-align: center;
	padding: 0;
	margin: 0px 0px 20px 0px;
	color: #5C5C5C;
	font-size: x-large;
}

.form-style-7 ul {
	list-style: none;
	padding: 0;
	margin: 0;
}

.form-style-7 li {
	display: block;
	padding: 9px;
	border: 1px solid #DDDDDD;
	margin-bottom: 30px;
	border-radius: 3px;
}

.form-style-7 li:last-child {
	border: none;
	margin-bottom: 0px;
	text-align: center;
}

.form-style-7 li>label {
	display: block;
	float: left;
	margin-top: -19px;
	background: #FFFFFF;
	height: 18px;
	padding: 2px 5px 2px 5px;
	color: #2f302e;
	font-size: 14px;
	overflow: hidden;
	font-family: Arial, Helvetica, sans-serif;
}

.form-style-7 input[type="text"],.form-style-7 input[type="date"],.form-style-7 input[type="datetime"],.form-style-7 input[type="email"],.form-style-7 input[type="number"],.form-style-7 input[type="search"],.form-style-7 input[type="time"],.form-style-7 input[type="url"],.form-style-7 input[type="password"],.form-style-7 textarea,.form-style-7 select
	{
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 100%;
	display: block;
	outline: none;
	border: none;
	height: 25px;
	line-height: 25px;
	font-size: 16px;
	padding: 0;
	font-family: Georgia, "Times New Roman", Times, serif;
}

.form-style-7 input[type="text"]:focus,.form-style-7 input[type="date"]:focus,.form-style-7 input[type="datetime"]:focus,.form-style-7 input[type="email"]:focus,.form-style-7 input[type="number"]:focus,.form-style-7 input[type="search"]:focus,.form-style-7 input[type="time"]:focus,.form-style-7 input[type="url"]:focus,.form-style-7 input[type="password"]:focus,.form-style-7 textarea:focus,.form-style-7 select:focus
	{
	
}

.form-style-7 li>span {
	background: #F3F3F3;
	display: block;
	padding: 3px;
	margin: 0 -9px -9px -9px;
	text-align: center;
	color: #C0C0C0;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 11px;
}



.form-style-7 input[type="submit"],.form-style-7 input[type="button"] {
	background: #2471FF;
	border: none;
	padding: 10px 20px 10px 20px;
	border-bottom: 3px solid #5994FF;
	border-radius: 3px;
	color: #D2E2FF;
}

.form-style-7 input[type="submit"]:hover,.form-style-7 input[type="button"]:hover
	{
	background: #6B9FFF;
	color: #fff;
}

</style>

<script type="text/javascript">
function onclick1()  
{  
	alert('Thank you for writing to us ...!');  
	return true;   
 }  
</script>
<script type="text/javascript">
//auto expand textarea
function adjust_textarea(h) {
    h.style.height = "20px";
    h.style.height = (h.scrollHeight)+"px";
}

</script>
</head>
<body>

	<a href="indexeff.html"
		style="position: absolute; left: 0; top: 0; font-color: red"> <img
		src="logo2.png" alt="Home" title="Home"
		style="width: 150px; height: 100px; border: 0;"></a>


	<div class="title-box">
		<center>
			<h2>Write To Us</h2>
		</center>


		<center>
			<form class="form-style-7" name="treehouse_form" action="WriteToUsServlet" method="post"
				onsubmit="return onclick1();">
				<ul>
					<li><label for="name">Name</label> <input type="text"
						name="name" id="name" maxlength="20" required><br> <span>Enter
							your full name here</span></li>
					<li><label for="city">City:</label> <input type="text"
						name="city" id="city" maxlength="20" required><br> <span>Enter
							Your City</span></li>
					<li><label for="email">Email:</label> <input type="email"
						name="mail" id="mail" required><br> <span>Enter
							Email like example@website.com</span></li>

					<li><label for="contactNo">ContactNo:</label> <input
						type="text" pattern="[7-9]{1}[0-9]{9}" name="contact" id="contact"
						maxlength="10" required><br> <span>Enter Your
							Contact Number</span></li>

					<li><label for="message" >Message:</label> <textarea name="message" id="message"></textarea>
					<span>Please
							Enter Your Message</span></li>
					<input class="button" type="submit" name="send" value="send"required>

				</ul>
			</form>
		</center>
	</div>
	</div>
</body>
</html>
