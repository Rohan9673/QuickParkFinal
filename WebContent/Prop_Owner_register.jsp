<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="resources/style.css"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<div class="login-page">
         <div class="form">
            <div class="col-3"></div>
            <div style="font-size:30px;">Property Owner Register</div> 
            <div class="col-3"><br></div> 
           
             <form class="Login-form" action="pqr" method="post" >
                 
                 <input type="text" required="required" placeholder="First Name" name="FirstName"/>
                 <input type="text" required="required" placeholder="Last Name" name="LastName"/>
                 <input type="text" required="required" placeholder="Mobile No" name="MobNo"/>
                 <input type="text" required="required" placeholder="Email Id" name="EmailID"/>
                 <input type="text" required="required" placeholder="PassWord" name="Password"/>
                 
                 <button >
                     Submit
                 </button>
                <p class="message">Already registered?
             	<a class="text-light" href="Login.jsp">login</a></p>
            </div>
             </form>
         </div>


</body>
</html>