<html>
<body>

<h1>Formulario Datuak</h1>

<?php
if(empty ($_POST["name"])){
	echo "name is required";
}else if(empty ($_POST["surname"])){
	echo "surname is required";
}else if($_POST["name"]===$_POST["password"] or $_POST["surname"]===$_POST["password"]){
	echo "Password cant be the same as surname or name";
}else if(empty ($_POST["password"])){
	echo  "password is required";
}
else{
	echo "You are <b>".$_POST["name"]." ".$_POST["surname"]. "</b> and your password is <b>'" .$_POST["password"]."</b>";
}
?>
<a href="form.php"> Click here to return </a>

</body>
</html>