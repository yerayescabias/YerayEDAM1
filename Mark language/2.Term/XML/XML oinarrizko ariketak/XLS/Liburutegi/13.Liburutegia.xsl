<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<body>
				<h1>Liburuen zerrenda </h1>
				
				<table border="3">
					<tr bgcolor="grey">
						<th>Izenburua</th>
						<th>idazlea </th>
						<th>ISBN </th>
						<th>Orriak </th>
						
					</tr>
					<xsl:for-each select="liburutegia/liburua[idazlea!='Ken Follett']">
					<xsl:sort select="orriak"/>
					<tr>
						<td><xsl:value-of select="izenburua"/></td>
						<td><xsl:value-of select="idazlea"/></td>
						<td><xsl:value-of select="isbn"/></td>
						<td><xsl:value-of select="orriak"/></td>
					</tr>
					</xsl:for-each>
				</table>
				
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>