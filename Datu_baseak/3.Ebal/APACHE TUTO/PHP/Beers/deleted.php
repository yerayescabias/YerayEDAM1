<!DOCTYPE html>
<html>
    <head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css">
		<script rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"></script>
		<title>PHPren adibidea</title>
	</head>
    <body>
		<a href="./index.html"><button type="button" class="btn btn-success m-2 mr-4">INDEX</button></a>
		        
        <?php
            include("test_connect_db.php");
            
			//Normalena, baldintza hauetako bakarra egotea da. Delete-a era batera edo bestera egingo da
			if (isset($_GET['idLang'])) {
				$idL = $_GET['idLang'];
			}
			if (isset($_POST['idLang'])) {
				$idL = $_POST['idLang'];
			}
            $link=KonektatuDatuBasera();

            mysqli_query($link,"delete from langilea where langile_ID = $idL; ");
        ?>
		
		<h1>Succesfully deleted!</h1>
        <a href="./deleteLang.php"><button type="button" class="btn btn-success m-2 mr-4">Atzera</button></a>
		
    </body>
</html> 