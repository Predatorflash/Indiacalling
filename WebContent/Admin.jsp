<!DOCTYPE html>
<html>		
<head>
<meta charset="ISO-8859-1">
<title>Admin page.</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<style>
* {margin: 0;padding: 0;outline: none;-webkit-box-sizing: border-box;-moz-box-sizing: border-box;box-sizing: border-box;}
*:after, *:before { -webkit-box-sizing: border-box;-moz-box-sizing: border-box;box-sizing: border-box;}
article,aside,details,figcaption,figure,footer,header,hgroup,nav,section {  display: block;}
html {font-size: 100%;height: auto !important;height: 100%;-webkit-text-size-adjust: 100%;-ms-text-size-adjust: 100%;}
.clear {display: block;	}
.clear::after {clear: both;content: ".";display: block;height: 1px;visibility: hidden;}
	
/*GENERIC STYLES*/
body {
 	background-image: url("imgg.jpg");
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
/*NAV*/
	/* header {
		background: linear-gradient(to left,rgb(255,127,80) 0,rgba(62,188,207,0.96) 100%);
		border-bottom: 1px solid rgba(0,0,0,.1);
		box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);
		display: block;
		position: fixed;
		width: 100%;
		z-index: 1000;
	} */
	
	header > nav > ul {
		display: flex;
		flex-wrap: wrap;
		justify-content: flex-start;
		list-style: none;
		margin: 0;
		padding: 0;
	}
	
		header > nav > ul > li {
			flex: 0 1 auto;
			margin: 0;
			padding: 0;
			position: relative;
			transition: all linear 0.1s;	
		}
		
			header > nav > ul > li:hover {
				background: rgba(58,162,173,1);
			}
			
			header > nav > ul > li a + div {
				background: linear-gradient(to bottom,rgba(58,162,173,1) 0,rgba(62,188,207,0.96) 100%);; 
				border-radius: 0 0 2px 2px;
				box-shadow: 0 3px 1px rgba(0,0,0,.05);
				display: none;
				font-size: 1rem;
				position: absolute;
				width: 195px;
			}
			
				header > nav > ul > li:hover a + div {
					display: block;
				}
				
				header > nav > ul > li a + div > ul {
					list-style-type: none;	
				}
				
					header > nav > ul > li a + div > ul > li {
						margin: 0;
						padding: 0;
					}
					
						header > nav > ul > li a + div > ul > li > a {
							color: rgba(255,255,255,.9);
							display: block;	
							font-size: .75rem;
							letter-spacing: 1.5px;
							padding: .25rem 1.5rem;
							text-decoration: none;
							text-transform: uppercase;
						}
						
							header > nav > ul > li a + div > ul > li:hover > a {
								background-color: rgba(0,0,0,.15);	
							}
	
			header > nav > ul > li > a {
				align-items: flex-start;
				color: #fff;
				display: flex;
				font-size: 1.55rem;
				font-weight: 200;
				letter-spacing: 1px;
				max-width: 130px;
				padding: 1rem 1.5rem;
				text-decoration: none;
				text-shadow: 0 1px 1px rgba(0,0,0,.1);
				transition: all linear 0.1s;
			}
			
				header > nav > ul > li > a > div > span {
					/* color: rgba(255,255,255,.75); */
					display: block;
					font-family: Georgia, "Times New Roman", Times, serif;
					font-size: .7rem;	
					font-style: italic;
					line-height: 1rem;
					max-width: 260px;
				}

@media (min-width: 990px) {
  header > nav > ul > li > a {
    max-width: 500px;
    font-size: 1.7rem;
	line-height: 2rem;
  }
  
  header > nav > ul > li > a > div > span {
	  margin: 4px 0 0;  
  }
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

<body onload='noBack();' onpageshow='if (event.persisted) noBack();'>

	 	<a href="Admin.jsp"  style="position:absolute;left:0;top:0;font-color:red"> <img src="logo2.png" alt="Home" title="Home"  style="width:150px;height:100px;border:0;"></a>
<header>
<br>
<br>
<center><h2><font color="white"> WELCOME ADMIN</font>
<form  name="form1" method="post" class="form-style-7" action="LoginnServlet?param=Alogout">

  <input name="submit2" type="submit" id="submit2"  class="button" value="LOG OUT">

</form>
</h2></center>
<br>
<br>

<nav role='navigation'>
		<ul>
			
			<li>
				<a href="#">
				<div>
						Plans
						<span>Change plan details</span>
				</div>
				</a><div>
					<ul>
						<li><a href="PlanDetailServlet?param=add">Add plan</a></li>
						<li><a href="PlanDetailServlet?param=del">Modify plan</a></li>
				
						
					</ul>
				</div>
			</li>
			<li>
				<a href="#">
				<div>
						Queries
						<span>Answer user queries</span>
					</div>
				</a><div>
					<ul>
						<li><a href="QueryDetailServlet?param=p">Refine FAQs</a></li>
						
					</ul>
				</div>
			</li>
			<li>
				<a href="#">
						<div>
						Location
						<span>Edit store location</span>
					</div>
				</a><div>
					<ul>
						<li><a href="AddlocationServlet?param=addloc">Add Location</a></li>
						<li><a href="AddlocationServlet?param=delloc">Modify existing Location</a></li>
						
						
					</ul>
				</div>
			</li>
		</ul>
		</nav>
</header>
</body>
</html>