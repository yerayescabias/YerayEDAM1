<html>
<body>

<h1>1.ariketa</h1>

<?php
	$a=7;
	$b=3.34;
	$c="hello world";
	$tw=2;
	$ab=$a+$b;
	$minus=$a-$b;
	$bider=$a*$b;
	$bat=$a+1;
	
	echo "The value of 'a' variable is ".$a;
	print "<br/>";
	echo "The value of 'b' variable is ".$b;
	print "<br/>";
	echo "The value of 'c' variable is ".$c;
	print "<br/>";
	printf ("This is the number 2 in diferent formats: %d %f %.2f",$tw,$tw,$tw)<
	print "<br/>";
	echo "Some easy operantions: <br/>";
	echo "a+b=".$ab;
	print "<br/>";
	echo "a-b=".$minus;
	print "<br/>";
	echo "a*b=".$bider;
	print "<br/>";
	echo "a+1=".$bat;
	print "<br/>";
	echo "<h1>The IF Statement</h1>";
	if($a>$b){
		echo "'a' is bigger than 'b'<br/>";
	}else if($a<$b){
		echo "'b' is bigger than 'a'<br/>";
	}else{
		echo "'a' is the same as 'b'<br/>";
	}
	echo "<h1>For Loop</h1>";
	echo "Simple line outisde the loop<br/>";
	for($x=0;$x<=10;$x++){
		echo"Inside the loop ".$x."<br/>";
		
	}
?>

</body>
</html>	