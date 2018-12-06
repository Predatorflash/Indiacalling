<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<style>
body {
 	background-image:url("imhg.jpg");
 	background-size: cover;
 color: #222;
 -webkit-font-smoothing: antialiased;
 font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
 font-size: 1.05em;
 font-weight: 400;
 height: auto !important;
 height: 100%;
 line-height: 1.6rem;
 min-height: 100%;
 }
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  
  

  border-radius: 15px;
  box-shadow: 0 9px #999;
  
  
  
      background: #2471FF;
    border: none;
    padding: 10px 20px 10px 20px;
    border-bottom: 3px solid #5994FF;
    
    color: #D2E2FF;
    
    
}

.button:hover {
  background: #6B9FFF;
    color:#fff;
}

.button:active {
  background-color:  #6B9FFF;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }

</SCRIPT>



</head>

<%out.print("<body    onload='noBack();' onpageshow='if (event.persisted) noBack();' onunload=''>");%>

</head>
<style>
* {margin: 0;padding: 0;outline: none;-webkit-box-sizing: border-box;-moz-box-sizing: border-box;box-sizing: border-box;}
*:after, *:before { -webkit-box-sizing: border-box;-moz-box-sizing: border-box;box-sizing: border-box;}
article,aside,details,figcaption,figure,footer,header,hgroup,nav,section {  display: block;}
html {font-size: 100%;height: auto !important;height: 100%;-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%;}
.clear {display: block;	}
.clear::after {clear: both;content: ".";display: block;height: 1px;visibility: hidden;}
	
/*GENERIC STYLES*/

/
.button {
  display: inline-block;
  padding:255px 65px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  
  

  border-radius: 15px;
  box-shadow: 0 9px #999;
  
  
  
      background: #2471FF;
    border: none;
    padding: 10px 20px 10px 20px;
    border-bottom: 3px solid #5994FF;
    
    color: #D2E2FF;
    
    
}

.button:hover {
  background: #6B9FFF;
    color:#fff;
    
}

.button:active {
  background-color:  #6B9FFF;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
.button1 {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  
  

  border-radius: 15px;
  box-shadow: 0 9px #999;
  
  
  
      background:#708090;
    border: none;
    padding: 10px 20px 10px 20px;
    border-bottom: 3px solid ;
    
    color: #D2E2FF;
    
    
}

.button1:hover {
  background: #C0C0C0;
    color:#fff;
    
}

.button1:active {
  background-color:  #C0C0C0;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>


<header>
<center>
<h1><font color="white">  Welcome <b> <%=session.getAttribute("username") %></b>

<form name='form1' method='post' action='LoginnServlet?param=logout'>

  <label>
  <input name="submit2" type="submit" id="submit2" class="button1" value="LOG OUT">
  </label>
 </form>
 </center>





  <a href="PlanDetailServlet?param=plans" class="button" style="width: 500px; "> Subscribe to a New Plan	
	
  <a href="PlanDetailServlet?param=prepaid" class="button" style="width: 420px; " >Prepaid Recharge  

				<a href="PlanDetailServlet?param=postpaid" class="button" style="width: 500px; " >  Postpaid Bill Payment	
			





  
</body>


</html>