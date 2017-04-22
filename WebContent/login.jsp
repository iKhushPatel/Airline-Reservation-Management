<!DOCTYPE html>
<html>
	<head>
		<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
		<title>Login Form</title>
	<!-- <link rel="stylesheet" href="WEB-INF/css/login-form/style.css"> -->
	<style>
	@import url(http://fonts.googleapis.com/css?family=Tenor+Sans);
html {
  background-color: #5D92BA;
  font-family: "Tenor Sans", sans-serif;
}

.container {
  width: 500px;
  height: 400px;
  margin: 0 auto;
}

.login {
  margin-top: 50px;
  width: 450px;
}

.login-heading {
  font: 1.8em/48px "Tenor Sans", sans-serif;
  color: white;
}

.input-txt {
  width: 100%;
  padding: 20px 10px;
  background: #5D92BA;
  border: none;
  font-size: 1em;
  color: white;
  border-bottom: 1px dotted rgba(250, 250, 250, 0.4);
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  -moz-transition: background-color 0.5s ease-in-out;
  -o-transition: background-color 0.5s ease-in-out;
  -webkit-transition: background-color 0.5s ease-in-out;
  transition: background-color 0.5s ease-in-out;
}
.input-txt:-moz-placeholder {
  color: #81aac9;
}
.input-txt:-ms-input-placeholder {
  color: #81aac9;
}
.input-txt::-webkit-input-placeholder {
  color: #81aac9;
}
.input-txt:focus {
  background-color: #4478a0;
}

.login-footer {
  margin: 10px 0;
  overlow: hidden;
  float: left;
  width: 100%;
}

.btn {
  padding: 15px 30px;
  border: none;
  background: white;
  color: #5D92BA;
}

.btn--right {
  float: right;
}

.icon {
  display: inline-block;
}

.icon--min {
  font-size: .9em;
}

.lnk {
  font-size: .8em;
  line-height: 3em;
  color: white;
  text-decoration: none;
}
.shift--left {
	margin-right: 60px;
}
	
	</style>
	</head>
	
	<body>
	
		<div class="container">
			<div class="login">
				<h1 class="login-heading">
				<strong>Welcome.</strong> Please login.</h1>
				<form method="post" action="Login" name="index">
					<input type="text" name="emailId" placeholder="Email-ID" required="required" class="input-txt" value="Email ID"/>
					<input type="password" name="password" placeholder="Password" required="required" class="input-txt" value="password"/>
					<div class="login-footer">
						<a href="#" class="lnk" title="CLick here if forgot password"> 
						I've forgotten something
						</a>
						
						<button type="submit" class="btn btn--right" name="Submit">Go</button>
						<a href="Signup.jsp" target="_blank" title="Click to Register">
					
					<input type="button" class="btn btn--right shift--left" name="Signin" value="Sign Up" onclick="location.href = 'Signup.jsp';">
					</a>
					</div>
				</form>
			</div>
		</div>
		
		<script src="WEB-INF/assets/js/login-form/index.js"></script>
	
	</body>
</html>