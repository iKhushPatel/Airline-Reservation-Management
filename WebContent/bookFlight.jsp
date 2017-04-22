<html>
	<head>
	
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
	<br/><br/>
		<div  class="form">

					<form id="contactform" method="post" action="bookFlight">

						<p class="contact"><label for="r_id">R_CODE</label></p>
						<input id="r_id" name="R_CODE" placeholder="Reservation Code" required tabindex="1" type="text">
						
				
						<p class="contact"><label for="pid">P_ID</label></p>
						<input id="pid" name="P_ID" placeholder="Personal ID" required tabindex="1" type="text">
						
						<p class="contact"><label for="f_id">F_CODE</label></p>
						<input id="f_id" name="F_CODE" placeholder="Flight COde" required tabindex="1" type="text">
						
						<p class="contact"><label for="r_date">Date of Reservation</label></p>
						<input id="r_date" name="date_of_reservation" placeholder="Date of Reservation" required tabindex="1" type="text">
		 
						<p class="contact"><label for="seats">Reserved Seats</label></p>
						<textarea id="seats" name="seats_reserved" placeholder="No. of Seats Reserved" size="3" required tabindex="1"></textarea>

						<p class="contact"><label for="p_class">Class</label></p>
						<input id="p_class" name="class" placeholder="Type Class" required tabindex="1" type="text">
						
						<p class="contact"><label for="p_price">Price</label></p>
						<input id="p_price" name="price" placeholder="Type Price" size="6" required tabindex="1" type="text">
					
					<br/><br/>
					<center><input class="buttom" name="submit" id="submit" tabindex="5" value="Book Ticket" type="submit"></center>

		   </form>

		</div>
	</body>
</html>