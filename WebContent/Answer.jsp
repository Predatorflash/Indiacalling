<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Answer Query</title>
<script type="text/javascript">
function onclick1()  
{  
	alert('Query answered.');  
	return true;   
 }  
</script>
</head>
<body >
 	<a href="Admin.jsp"  style="position:absolute;left:0;top:0;font-color:red"> <img src="logo2.png" alt="Home" title="Home"  style="width:150px;height:100px;border:0;"></a>
<center>
<h2>Answer Queries</h2>
</center>
<style>
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
}</style>
<center>
<h4>UserId:</h4><% request.getSession().setAttribute("Id",request.getParameter("id"));%><%=request.getParameter("id")%><br>
<h4>UserName:</h4><%=request.getParameter("username") %><br>
<h4>UserQuery:</h4><%=request.getParameter("query") %><br>
<h4>Answer:</h4><br>

<form id="ansform" method="get" action="AnswerQueryServlet" onsubmit="return onclick1();">
<textarea rows="10" cols="50" name="ans" id="ansform" placeholder="your answer"></textarea><br>
<input type="submit" value="Submit" class="button">
</form>
</center>
</body>
</html>