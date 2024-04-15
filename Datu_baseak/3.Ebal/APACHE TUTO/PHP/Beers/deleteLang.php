<html>
	<head>
		<!--BOOTSTRAP-->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css">
		<script href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"></script>

		<title>PHPren adibidea</title>
	</head>
	<body>
		<div class="container">
						
			<H1>Langileak</H1>

			<!--SELECT shown in a table-->
			<?php
				include("test_connect_db.php");
				$link=KonektatuDatuBasera();
					$emaitza=mysqli_query($link,"select * from langilea");
			?>

			<TABLE BORDER=1 class="table">
				<Tr>
					<Th>&nbsp;&nbsp;</Th><Th>&nbsp;Langilearen identifikatzailea</Th><Th>&nbsp;Langilearen izena&nbsp;</Th>
				</Tr>
				<?php
					while($erregistroa = mysqli_fetch_array($emaitza)){
				?>
				<tr>
					<td>
						<a href="deleted.php?idLang=<?php echo $erregistroa["langile_ID"]; ?>"><img style='width:20px' src="img/delete_img.png"></a>
					</td> 
				<?php
					printf("<td>&nbsp;%s</td><td>&nbsp;%s&nbsp;</td></tr>", $erregistroa["langile_ID"],$erregistroa["langile_izena"]);
				}
				mysqli_free_result($emaitza);
				mysqli_close($link);
				?>
			</table>
			
			<H1>Langilea ezabatu</H1>
			<form action="deleted.php" method="POST">
                <label for="id">Langilearen ID:</label>
                <input type="text" id="id" name="idLang"><br><br>
                
                <input type="submit" value="Delete">
				<input type="reset" value="Reset">
            </form>
			<a href="./index.html"><button type="button" class="btn btn-success m-2 mr-4">Atzera</button></a>
		</div>
	</body>
</html>
