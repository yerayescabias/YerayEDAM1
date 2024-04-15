<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<body>
				<h1>Nire bankua </h1>
				<h3> kontu zki Saldoa</h3>
				<table border="3">
				<tr bgcolor="grey">
					<th>Kontu Zki</th>
					<th>saldoa </th>
					
				</tr>
				<tr>
					<td><xsl:value-of select="banco/cuenta/numero-cuenta"/></td>
					<td><xsl:value-of select="banco/cuenta/saldo"/></td>
				</tr>
				</table>
			
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>
	