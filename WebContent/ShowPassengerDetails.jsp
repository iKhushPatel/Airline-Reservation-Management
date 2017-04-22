<!DOCTYPE html>
<%@ page language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>ShowPassengerDetails</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
body
			{
				background-image:url("WEB-INF/assets/images/sea_ocean_steamer_island-wallpaper-1366x768.jpg"); 
				background-repeat:no-repeat ;
				background-attachment: fixed;
			}
.form{

    background:#f1f1f1; width:470px; margin:0 auto; padding-left:50px; padding-top:20px;

}

.form fieldset{border:0px; padding:0px; margin:0px;}

.form p.contact { font-size: 12px; margin:0px 0px 10px 0;line-height: 14px; font-family:Arial, Helvetica;}

 

.form input[type="text"] { width: 400px; }

.form input[type="email"] { width: 400px; }

.forminput[type="password"] { width: 400px; }

.form input.birthday{width:60px;}

.form input.birthyear{width:120px;}

.form label { color: #000; font-weight:bold;font-size: 12px;font-family:Arial, Helvetica; }

.form label.month {width: 135px;}

.form input, textarea { background-color: rgba(255, 255, 255, 0.4); border: 1px solid rgba(122, 192, 0, 0.15); padding: 7px; font-family: Keffeesatz, Arial; color: #4b4b4b; font-size: 14px; -webkit-border-radius: 5px; margin-bottom: 15px; margin-top: -10px; }

.form input:focus, textarea:focus { border: 1px solid #ff5400; background-color: rgba(255, 255, 255, 1); }

.form .select-style {

  -webkit-appearance: button;

  -webkit-border-radius: 2px;

  -webkit-box-shadow: 0px 1px 3px rgba(0, 0, 0, 0.1);

  -webkit-padding-end: 20px;

  -webkit-padding-start: 2px;

  -webkit-user-select: none;

  background-image: url(images/select-arrow.png),

    -webkit-linear-gradient(#FAFAFA, #F4F4F4 40%, #E5E5E5);

  background-position: center right;

  background-repeat: no-repeat;

  border: 0px solid #FFF;

  color: #555;

  font-size: inherit;

  margin: 0;

  overflow: hidden;

  padding-top: 5px;

  padding-bottom: 5px;

  text-overflow: ellipsis;

  white-space: nowrap;}

.form .gender {

  width:410px;

  }

.form input.buttom{ background: #4b8df9; display: inline-block; padding: 5px 10px 6px; color: #fbf7f7; text-decoration: none; font-weight: bold; line-height: 1; -moz-border-radius: 5px; -webkit-border-radius: 5px; border-radius: 5px; -moz-box-shadow: 0 1px 3px #999; -webkit-box-shadow: 0 1px 3px #999; box-shadow: 0 1px 3px #999; text-shadow: 0 -1px 1px #222; border: none; position: relative; cursor: pointer; font-size: 14px; font-family:Verdana, Geneva, sans-serif;}

.form input.buttom:hover    { background-color: #2a78f6; }

h2 {
	text-align: center;
	color: white;
	font-family: Calibri;
}
</style>

</head>
<body>

<h2>Passenger Detail</h2>

<% String array[] =new String[15]; 
array[0] = (String)request.getAttribute("p_id");
array[1] = (String)request.getAttribute("first_name");
array[2] = (String)request.getAttribute("middle_name");
array[3] = (String)request.getAttribute("surname");
array[4] = (String)request.getAttribute("address");
array[5] = (String)request.getAttribute("city");
array[6] = (String)request.getAttribute("state");
array[7] = (String)request.getAttribute("pincode");
array[8] = (String)request.getAttribute("contact_no");
array[9] = (String)request.getAttribute("email_id");
array[10] = (String)request.getAttribute("data_of_birth");
array[11] = (String)request.getAttribute("age");


%>
</head>

<body>
	<div  class="form">

            <form id="contactform" method="post" action="ReadData">

				<p class="contact"><label for="per_id">P_ID</label></p>
                <input id="per_id" name="p_id" placeholder="Personal ID" required tabindex="1" type="text" value="<%=array[0]%>" disabled>
				
		
                <p class="contact"><label for="f_name">First Name</label></p>
                <input id="f_name" name="first_name" placeholder="Type First Name" required tabindex="1" type="text" value="<%=array[1]%>">
				
				<p class="contact"><label for="m_name">Middle Name</label></p>
                <input id="m_name" name="middle_name" placeholder="Type Middle Name" required tabindex="1" type="text" value="<%=array[2]%>">
				
				<p class="contact"><label for="l_name">Last Name</label></p>
                <input id="l_name" name="last_name" placeholder="First and last name" required tabindex="1" type="text" value="<%=array[3]%>">
 
				<p class="contact"><label for="add">Address</label></p>
                <textarea id="add" cols="30" rows="5" name="address" placeholder="Type your Permanant Address" tabindex="1"><%=array[4] %></textarea>
				
				<p class="contact"><label for="p_city">City</label></p>
                <input id="p_city" name="city" placeholder="Type City" required tabindex="1" type="text" value="<%=array[5]%>">
				
				<p class="contact"><label for="p_state">State</label></p>
                <input id="p_state" name="state" placeholder="Type State" required tabindex="1" type="text" value="<%=array[6]%>">
				
				<p class="contact"><label for="p_code">Pincode</label></p>
                <input id="p_code" name="pincode" placeholder="Type Pincode" required tabindex="1" type="text" value="<%=array[7]%>">
				
				<p class="contact"><label for="c_no">Contact No.</label></p>
                <input id="c_no" name="contact_no" placeholder="Type Contact No." required tabindex="1" type="text" value="<%=array[8]%>">
				
                <p class="contact"><label for="email">Email</label></p>
                <input id="email" name="emailId" placeholder="example@domain.com" required type="email" value="<%=array[9]%>">
				
               <p class="contact"><label for="dob">Date of Birth</label></p>
                <input id="dob" name="date_of_birth" placeholder="Type Date of Birth (YYYY/MM/DD)" required tabindex="1" type="text" value="<%=array[10]%>">
				
				<p class="contact"><label for="p_age">Age</label></p>
                <input id="p_age" name="age" placeholder="Type Age" required tabindex="1" type="text" value="<%=array[11]%>">

   </form>

</div>
</body>

</html>