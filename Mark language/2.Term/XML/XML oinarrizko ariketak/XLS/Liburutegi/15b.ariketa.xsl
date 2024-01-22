<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<body>
				<h1>Liburuen zerrenda </h1>
				
				<table border="3">
					<tr bgcolor="blue">
						<th>Izenburua</th>
						<th>idazlea </th>
						<th>ISBN </th>
						<th>Orriak </th>
						
					</tr>
					<xsl:for-each select="liburutegia/liburua">
					
					<tr>
					<xsl:choose>
						<xsl:when test="orriak &lt; 500">
						<td bgcolor="grey"><xsl:value-of select="izenburua"/></td>
						<td bgcolor="grey"><xsl:value-of select="idazlea"/></td>
						<td bgcolor="grey"><xsl:value-of select="isbn"/></td>
						<td bgcolor="red"><xsl:value-of select="orriak"/></td>
						</xsl:when>
						<xsl:when test="orriak &gt; 1000">
						<td bgcolor="grey"><xsl:value-of select="izenburua"/></td>
						<td bgcolor="grey"><xsl:value-of select="idazlea"/></td>
						<td bgcolor="grey"><xsl:value-of select="isbn"/></td>
						<td bgcolor="green"><xsl:value-of select="orriak"/></td>
						</xsl:when>
						<xsl:otherwise>
						<td bgcolor="grey"><xsl:value-of select="izenburua"/></td>
						<td bgcolor="grey"><xsl:value-of select="idazlea"/></td>
						<td bgcolor="grey"><xsl:value-of select="isbn"/></td>
						<td bgcolor="grey"><xsl:value-of select="orriak"/></td>
						</xsl:otherwise>
					</xsl:choose>
					</tr>
					
					</xsl:for-each>
				</table>
				
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>