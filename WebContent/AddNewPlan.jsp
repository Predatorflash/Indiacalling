<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Plan</title>
<script type="text/javascript">
function onclick1()  
{  
	alert('Plan added!');  
	return true;   
 }  
</script>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
</SCRIPT>
<style>
.form-style-7{
    max-width:400px;
    margin:50px auto;
    background:#fff;
    border-radius:2px;
    padding:20px;
    font-family: Georgia, "Times New Roman", Times, serif;
}
.form-style-7 h1{
    display: block;
    text-align: center;
    padding: 0;
    margin: 0px 0px 20px 0px;
    color: #5C5C5C;
    font-size:x-large;
}
.form-style-7 ul{
    list-style:none;
    padding:0;
    margin:0;   
}
.form-style-7 li{
    display: block;
    padding: 9px;
    border:1px solid #DDDDDD;
    margin-bottom: 30px;
    border-radius: 3px;
}
.form-style-7 li:last-child{
    border:none;
    margin-bottom: 0px;
    text-align: center;
}
.form-style-7 li > label{
    display: block;
    float: left;
    margin-top: -19px;
    background: #FFFFFF;
    height: 14px;
    padding: 2px 5px 2px 5px;
    color: #B9B9B9;
    font-size: 14px;
    overflow: hidden;
    font-family: Arial, Helvetica, sans-serif;
}
.form-style-7 input[type="text"],
.form-style-7 input[type="date"],
.form-style-7 input[type="datetime"],
.form-style-7 input[type="email"],
.form-style-7 input[type="number"],
.form-style-7 input[type="search"],
.form-style-7 input[type="time"],
.form-style-7 input[type="url"],
.form-style-7 input[type="password"],
.form-style-7 textarea,
.form-style-7 select 
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
.form-style-7 input[type="text"]:focus,
.form-style-7 input[type="date"]:focus,
.form-style-7 input[type="datetime"]:focus,
.form-style-7 input[type="email"]:focus,
.form-style-7 input[type="number"]:focus,
.form-style-7 input[type="search"]:focus,
.form-style-7 input[type="time"]:focus,
.form-style-7 input[type="url"]:focus,
.form-style-7 input[type="password"]:focus,
.form-style-7 textarea:focus,
.form-style-7 select:focus 
{
}
.form-style-7 li > span{
    background: #F3F3F3;
    display: block;
    padding: 3px;
    margin: 0 -9px -9px -9px;
    text-align: center;
    color: #C0C0C0;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 11px;
}
.form-style-7 textarea{
    resize:none;
}
.form-style-7 input[type="submit"],
.form-style-7 input[type="button"]{
    background: #2471FF;
    border: none;
    padding: 10px 20px 10px 20px;
    border-bottom: 3px solid #5994FF;
    border-radius: 3px;
    color: #D2E2FF;
}
.form-style-7 input[type="submit"]:hover,
.form-style-7 input[type="button"]:hover{
    background: #6B9FFF;
    color:#fff;
}.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>
<%out.print("<body bgcolor='white'  onload='noBack();' onpageshow='if (event.persisted) noBack();' onunload=''>");%>
	 	<a href="Admin.jsp"  style="position:absolute;left:0;top:0;font-color:red"> <img src="logo2.png" alt="Home" title="Home"  style="width:150px;height:100px;border:0;"></a>
<center><h2>Add Plan</h2></center>
<center>
<form method="get" action="AddServlet" class="form-style-7" onsubmit="return onclick1();">
<ul>
					<li><label for="city">Enter Type</label> 
<select title="plan" name="type">
<option value="Data">Data
<option value="Talktime">Talktime
</select>
 <span>Select Plan</span></li>
 	<li><label for="city">Enter Type</label> 


<select title="plan" name="plantype">
<option value="pre">pre
<option value="post">post
</select>
<span>Select Plan Type:</span></li>
<li><label for="city">Enter Plan</label> 

<select title="plan" name="plansubtype">
<option value="2G">2G
<option value="3G">3G
<option value="4G">4G
</select>
<span>Enter Plan SubType:</span></li>

<li><label for="city">Enter Plan Subtype</label> 
<input type="text" name="planname" placeholder="plan name"  required>
<span>Enter PlanName:</span></li>


<li><label for="city">Enter Amount</label> 
<input pattern="[0-9]*" type="text" name="amount" placeholder="Amount" required>
<span>Enter Amount</span></li>


<li><label for="city">Enter Validity</label> 
<input pattern="{1,}days" type="text" name="validity" placeholder="* days"  required>
<span>Enter Validity</span></li>
  <br>
<input type="submit" class ="button" value="Add" name="add" id="add" >
</form>

</ul>

</center>
</body>
</html>