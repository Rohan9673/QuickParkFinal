<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	<title>
			Property Owner Register Page
	</title>
		<link rel="stylesheet" href="resources/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="img">
	<div class="login-page">
         <div class="form">
            <div class="col-3"></div>
            <div style="font-size:30px;">Vehicle Owner Register</div> 
            <div class="col-3"><br></div> 
           
             <form class="Login-form" action="xyz" method="post" >
               	<input type="text" required="required" placeholder="User Name" name="userName"/>
                 <input type="text" required="required" placeholder="First Name" name="firstName"/>
                 <input type="text" required="required" placeholder="Last Name" name="lastName"/>
                 <input type="text" required="required" placeholder="Mobile No" name="mobNo"/>
                 <input type="text" required="required" placeholder="Email Id" name="emailID"/>
                 <input type="text" required="required" placeholder="Address" name="address"/>
                 <input type="Password" required="required" placeholder="password" name="password" /> 
                 <button >
                     Submit
                 </button>
                <p class="message">Already registered?
             	<a class="text-light" href="login.jsp">login</a></p>
            </div>
             </form>
         </div>

     </div></div></div></div>
</body>
</html>