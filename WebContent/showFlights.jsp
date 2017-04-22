<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title>ShowDetails</title>
<style type="text/css">
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
</style>
</head>

<body>

<% String arr[] =new String[15];
					arr[0] = (String)request.getAttribute("F_CODE");
					arr[1] = (String)request.getAttribute("manufacturer");
					arr[2] = (String)request.getAttribute("model");
					arr[3] = (String)request.getAttribute("origin");
					arr[4] = (String)request.getAttribute("destination");
					arr[5] = (String)request.getAttribute("start_date");
					arr[6] = (String)request.getAttribute("departure_time");
					arr[7] = (String)request.getAttribute("arrival_time");
					arr[8] = (String)request.getAttribute("no_of_seats");
					arr[9] = (String)request.getAttribute("services");
					arr[10] = (String)request.getAttribute("review");

 %>

	<h2>Welcome. Please fill in your details</h2>
	<div  class="form">

            <form id="contactform" method="post" action="bookFlight.jsp" name="shoeFlights">

				<p class="contact"><label for="f_id">F_CODE</label></p>
                <input id="f_id" name="f_code" value="<%=arr[0] %>" required tabindex="1" type="text">
				
		
                <p class="contact"><label for="m_name">Manufacturer</label></p>
                <input id="m_name" name="name" value="<%=arr[1] %>" required tabindex="1" type="text">
				
				<p class="contact"><label for="m_model">Model</label></p>
                <input id="m_model" name="middle_name" value="<%=arr[2] %>" required tabindex="1" type="text">
				
				<p class="contact"><label for="l_name">Origin</label></p>
                <input id="l_name" name="last_name" value="<%=arr[3] %>" placeholder="First and last name" required tabindex="1" type="text">
 
				<p class="contact"><label for="add">Destination</label></p>
                <textarea id="add" name="address" value="<%=arr[4] %>" placeholder="Type your Permanant Address" required tabindex="1"></textarea>

				<p class="contact"><label for="p_city">Strat Date</label></p>
                <input id="p_city" name="city" value="<%=arr[5] %>" placeholder="Type City" required tabindex="1" type="text">
				
				<p class="contact"><label for="p_state">Departure Time</label></p>
                <input id="p_state" name="state" placeholder="Type State" value="<%=arr[6] %>" required tabindex="1" type="text">
				
				<p class="contact"><label for="p_code">Arrival Time</label></p>
                <input id="p_code" name="pincode" placeholder="Type Pincode" value="<%=arr[7] %>" required tabindex="1" type="text">
				
				<p class="contact"><label for="c_no">No. of Seats</label></p>
                <input id="c_no" name="contact_no" placeholder="Type Contact No." value="<%=arr[8] %>" required tabindex="1" type="text">
				
                <p class="contact"><label for="email">Services</label></p>
                <input id="email" name="text" value="<%=arr[9] %>" placeholder="example@domain.com" required type="email">
				
               <p class="contact"><label for="dob">Review</label></p>
                <input id="dob" name="date_of_birth" value="<%=arr[10] %>" placeholder="Type Date of Birth (YYYY/MM/DD)" required tabindex="1" type="text">

            <center><input class="buttom" name="submit" id="submit" tabindex="5" value="Show ME !" type="submit"></center>

   </form>

</div>
</body>

</html>

