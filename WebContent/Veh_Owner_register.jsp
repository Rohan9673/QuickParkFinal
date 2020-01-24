
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
	<script>
		
	    function Project()
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
            <div style="font-size:30px;">Vehicle Owner Register</div> 
            <div class="col-3"><br></div> 
           
             <form class="Login-form" name="myForm" action="xyz" onsubmit="return Project()" method="post">
                 <input style="border-radius: 4px;" type="text" name="userName" required="required" placeholder="User Id"/>
                 <input style="border-radius: 4px;" type="text" name="firstName" required="required" placeholder="First Name"/>
                 <input style="border-radius: 4px;" type="text" name="lastName" required="required" placeholder="Last Name"/>
                 <input style="border-radius: 4px;" type="text" name="mobNO" required="required" placeholder="Mobile No"/>
                 <input style="border-radius: 4px;" type="text" name="emailID" required="required" placeholder="Email Id"/>
                 <input style="border-radius: 4px;" type="Password" name="password" required="required" placeholder="PassWord"/>
                 <input style="border-radius: 4px;" type="text" name="address" required="required" placeholder="Address"/>
                 <button style="border-radius: 8px;" >
                     Submit
                 </button>
                <p class="message">Already registered?
             	<a class="text-light" href="Login1.jsp">login</a></p>
            </div>
             </form>
         </div>

     </div></div></div></div>
</body>
</html>