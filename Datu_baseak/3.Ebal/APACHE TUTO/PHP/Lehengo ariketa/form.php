<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container">
<div class="mx-auto border border-primary">
		<form class="mx-auto "action="different_messages.php" method="post">
		<label class="form-label">Name:</label> <input class="form-control w-25" type="text" name="name"><br/>
		<label class="form-label">Surname:</label>  <input class="form-control  w-25" type="text" name="surname"><br/>
		<label class="form-label">Password:</label>  <input class="form-control  w-25" type="password" name="password"><br/>
		<input class="btn btn-dark" type="submit"/>
		</form>
</div>
</body>
</html>