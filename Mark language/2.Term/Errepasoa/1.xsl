<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="./bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet"/>
			<script src="./bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
		</head>
		<body class="container">
			<h1 class="h1">ESPACIOS NATURALES</h1>
			
			<table class="table table-striped">
				
				<tr>
					<th>Documentname</th>
					<th>Turismedescription</th>
				</tr>
				<xsl:for-each select="//row">
					<xsl:if test="@num &gt; 29">
						<tr>
							<td><xsl:value-of select="documentname"/></td>
							<td><xsl:value-of select="turismdescription"/></td>
						</tr>
					</xsl:if>
				</xsl:for-each>
			</table>
		</body>
	</html>
	</xsl:template>
</xsl:stylesheet>