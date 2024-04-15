<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet"/>
			<script src="bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
			<style>
				
			</style>
		</head>
		<body class="container">
		<div class="mx-auto">
		<h1 class="h1"> Dendatxoa</h1>
			<xsl:for-each select="tienda">
				<span class="me-2"><xsl:value-of select="nombre"></xsl:value-of></span><span><xsl:value-of select="telefono"/></span>
			</xsl:for-each>
			<br/>
			<p>Produktuak</p>
				
					<table class="table table-bordered">
						<tr >
							<td class="bg-success"><b>Kodigoa</b> </td>
							<td class="bg-success"> <b>Artikulua</b></td>
							<td class="bg-success"> <b>Ezaugarriak</b></td>
							<td class="bg-success"> <b>Prezioa</b></td>	
						</tr>
						<xsl:for-each select="//producto">
						<tr>
						
							<td><xsl:value-of select="codigo"></xsl:value-of></td>
							<td><xsl:value-of select="articulo"></xsl:value-of></td>
							<td>
								<ul>
									<xsl:for-each select="caracteristicas/linea">
									<li>
									<xsl:value-of select="."/>
									<br/>
									</li>
									</xsl:for-each>
								</ul>
							</td>
							<td><xsl:value-of select="precio"></xsl:value-of></td>
							
						
						
						</tr>
					
						</xsl:for-each>
					</table>
				
				
				
				
				
			
				
		</div>
		</body>
	
	</html>
	</xsl:template>
</xsl:stylesheet>