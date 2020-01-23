<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	<title>
			Login Page
	</title>
		<link rel="stylesheet" href="resources/style.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="img">
	<div class="login-page">
         <div class="form">
            <div class="col-3"></div>
            <div style="font-size:30px;">Login Page</div> 
            <div class="col-3"><br></div> 
            
         
             <form class="Login-form" action="abc" method="post" >
                 <input type="text" required="required" placeholder="username" name="UserName"/>
                 <input type="text" required="required" placeholder="Password" name="Password"/>
                 <button >
                     Login
                 </button>
             
            	<div class="row  mt-4" >
          		
          		<div class="col-1"></div>
                <div class="col-4 btn btn-primary"><a class="text-light" href="Prop_Owner_register.jsp">Property Owner</a> </div> 
                <div class="col-2"></div>
                <div class="col-4 btn btn-primary"><a class="text-light"  href="Veh_Owner_register.jsp"> Vehicle Owner </a></div>
            	<div class="col-1"></div>
            </div>
             </form>
         </div>

     </div></div></div></div>
</body>
</html>