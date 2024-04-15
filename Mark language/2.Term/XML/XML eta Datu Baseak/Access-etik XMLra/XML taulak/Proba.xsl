
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	
<html>
	<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"></link>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	<h1> Nire etxebizitzak</h1>
		<table>
		<tr>
		<thead>ID</thead>
		<thead>Mota</thead>
		<thead>herria</thead>
		<thead>helbidea</thead>
		<thead>Probintzia</thead>
		</tr>
		<xsl:for-each select="/Etxebizitzak">
		<td><xsl:value-of select="EtxebizitzaID"></xsl:value-of></td>
		<td><xsl:value-of select="Mota"></xsl:value-of></td>
		<td><xsl:value-of select="EtxebizitzaID"></xsl:value-of></td>
		<td><xsl:value-of select="EtxebizitzaID"></xsl:value-of></td>
		
		</xsl:for-each>
		
		
		
		
		
		
		
		
		
		</table>
	
	
	
	</body>
</html>
