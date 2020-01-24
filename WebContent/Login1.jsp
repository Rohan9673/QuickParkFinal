<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
			
	
		<script>
		    function validateform()
			{
				var uname = document.forms["loginForm"]["username"];
				var Password = document.forms["loginForm"]["password"];
				
				if(uname.value == "")
				{
					window.alert("Please enter your username.");
					uname.focus();
					return false;
				}
		
				if(Password.value == "")
				{
					window.alert("Please enter password.");
					Password.focus();
					return false;
				}
				
				return true;
			}
		</script>
			
	
	
	
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
            
         
             <form  class="Login-form" name="loginForm"   method="post" action="abc">
                        
                 <input type="text" style="border-radius: 4px;" placeholder="Username" name="userName"/>
                 <input type="password" style="border-radius: 4px;" placeholder="Password" name="password" minlength=8 maxlength=15 pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
                 <input class="text-light" style="border-radius: 8px; background-color: green;" type="submit" value="Login" id="submit" onsubmit="return validateform()" >
             
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