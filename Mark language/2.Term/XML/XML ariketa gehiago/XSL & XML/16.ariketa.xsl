<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"></link>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
			<style>
				html body{
					background: linear-gradient(to right, #6600ff 0%, #ff99cc 100%);
				}
				
			</style>
		</head>
		<body>
			<div class=" mt-3 mb-3 ms-3 me-3">
				
				<table class="table rounded-table table-striped">
					
					<tr class="table table-dark ">
					<td >Izena</td>
					<td>Herria</td>
					<td>Telefona</td>
					<td>Emaila</td>
					</tr>
					
					<xsl:for-each select="//row[territoriohistorico='GIPUZKOA']">
					<tr >
					<td><xsl:value-of select="nombre"></xsl:value-of></td>
					<td><xsl:value-of select="municipio"></xsl:value-of></td>
					<td><xsl:value-of select="telefono"></xsl:value-of></td>
					<td><xsl:value-of select="email"></xsl:value-of></td>
					</tr>
					
					
					</xsl:for-each>
				
				
				
				
				
				
					
				</table>
			</div>
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>