<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="./bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet"/>
			<script src="./bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
		</head>
		<body class="container-fluid">
			<div class="container" >
			<h1 class="h1">ESPACIOS NATURALES</h1>
			
			
				
				
					
					<xsl:for-each select="//row[territory='Gipuzkoa']">
					
							<div class="shadow-lg w-50 p-3 mb-5 mt-5 mx-auto">
								<h1 class="h1 mx-auto"><xsl:value-of select="documentname"/></h1>
							<br/>
							<p ><xsl:value-of select="turismdescription"/></p>
							</div>
					</xsl:for-each>
				
				
			</div>
		</body>
	</html>
	</xsl:template>
</xsl:stylesheet>