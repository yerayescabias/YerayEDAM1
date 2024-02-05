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
				<div class="align-items-center">
					<h1 class="align-center">Nire bankua </h1>
					<h3 class="align-center"> kontu zki Saldoa</h3>
				</div>
				
				<table class="table table-hover table-striped table-sm w-50 m-auto shadow-lg " >
					<tr bgcolor="grey">
						<th class="table-primary">Kontu Zki</th>
						<th class="table-primary">saldoa </th>
						
					</tr>
					<xsl:for-each select="banco/cuenta">
					<tr>
						<td class="table-dark"><xsl:value-of select="numero-cuenta"/></td>
						<td class="table-dark"><xsl:value-of select="saldo"/></td>
					</tr>
					</xsl:for-each>
				</table>
				
		</body>
		
		
  </html>
</xsl:template>
</xsl:stylesheet>