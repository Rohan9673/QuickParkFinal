<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- JavaScript Validation -->
	
	<script>
		    function Validate()
			{

		    	var user = document.forms["myForm"]["userID"];
		    	var Fname = document.forms["myForm"]["fname"];
		    	var Lname = document.forms["myForm"]["lname"];
		    	int Mobile = document.forms["myForm"]["mobile"];
		    	var Mobile = document.forms["myForm"]["email"];
				var Password = document.forms["myForm"]["password"];
				var Address = document.forms["myForm"]["address"];


				if(user.value == "" || user.value == "  ")
				{
					window.alert("Please enter your userID.");
					user.focus();
					return false;
				}
				else if(Fname.value == "" || Fname.value == "  ")
				{
					window.alert("Please enter your username.");
					Fname.focus();
					return false;
				}
				else if(Lname.value == "" || Lname.value == "  ")
				{
					window.alert("Please enter your username.");
					Lname.focus();
					return false;
				}
				else if(Mobile.length < 10 || Mobile.length >10)
				{
					window.alert("Please enter correct Mobile No.");
					Mobile.focus();
					return false;
				}
				else if(Email.value == "" || Email.value == "  ")
				{
					window.alert("Please enter your username.");
					Email.focus();
					return false;
				}
				else if(Password.value == "" || Password.value == "  ")
				{
					window.alert("Please enter your username.");
					Password.focus();
					return false;
				}
				else if(Address.value == "" || Address.value == " ")
				{
					window.alert("Please enter address");
					Address.focus();
					return false;
				}

		}	
			
	</script>	


		
	
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
            <div style="font-size:30px;">Property Owner Register</div> 
            <div class="col-3"><br></div> 
           
             <form class="Login-form" name="myForm" onSubmit="return Validate()"action="pqr" method="post" >
             
             
                 <input type="text" required="required" name="UserName" placeholder="User Name"/>
                 <input type="text" required="required" name="FirstName" placeholder="First Name"/>
                 <input type="text" required="required" name="LastName" placeholder="Last Name"/>
                 <input type="text" required="required" name="MobNo" placeholder="Mobile No"/>
                 <input type="text" required="required" name="EmailId" placeholder="Email Id"/>
                 
                 <input type="Password" required="required" name="Password" placeholder="PassWord" minlength=8 maxlength=15 pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
                 
                 <input type="text" required="required" name="Address" placeholder="Address"/>
                 <button >
                     Submit
                 </button>
                 
                 
                <p class="message">Already registered?
             	<a class="text-light" href="Login.jsp">login</a></p>
            </div>
             </form>
         </div>

     </div></div></div></div>
</body>
</html>