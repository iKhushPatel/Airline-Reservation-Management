<!DOCTYPE html>
<html>
	<head>
		<title>Signup Form</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
		<style>
		
			.star{color:red ;}
			div{font-family:arial ; font-size:19px ;}
			fieldset{width:200px ;}
			
		</style>
		
	</head>
	<body>
	<div>
		<h1>Signup Form</h1>
		
			<form action="P8_2.html" method="get">
				<label for="firstname">First Name <span class="star">*</span></label>
					<input type="text" id="firstname" required>
				
				<br><br>
				
				<label for="lastname">Last Name <span class="star">*</span></label>
					<input type="text" id="lastname" required>
				
				<br><br>
				
				<label for="e-mail">Email <span class="star">*</span></label>
					<input type="email" id="e-mail" required>
				
				<br><br>
				
				<label for="pass">Password <span class="star">*</span></label>
					<input type="password" id="pass" required>
					
				<br><br>
				
				<label for="dob">Birthday <span class="star">*</span></label>
					<input type="date" id="dob" required>
					
				<br><br>
				
				<fieldset>
					<legend>Gender <span class="star">*</span></legend>
						<input type="radio" id="male"><label for="male">Male</label>
						<input type="radio" id="male"><label for="female">Female</label>
				</fieldset>
				
				<br><br>
				
				<label for="number">Phone <span class="star">*</span></label>
					<input type="tel" id="number" required>
					
				<br><br>
				
				<label for="location">Location <span class="star">*</span></label>
				<input list="location">
					<datalist id="location" required>
						<option value="Ahmedabad">
						<option value="Surat">
						<option value="Rajkot">
					</datalist>
					
				<br><br>
					
				<label for="zip">Zip Code 5 Digits</label>
					<input type="tel" id="zip" maxlength="5">
					
				<br><br>
				
				<input type="radio" id="terms" required>
				<label for="terms"> <span class="star">*</span> I agree to terms of services</label>
				
				<br><br>
				
				<button type="submit" value="submit" >Submit</button>
			</form>
	</div>
	</body>
</html>