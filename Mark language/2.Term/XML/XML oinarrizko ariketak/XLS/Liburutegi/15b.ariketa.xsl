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
					
					
					<xsl:choose>
						<xsl:when test="orriak &lt; 500">
						<tr bgcolor="red">
						<td><xsl:value-of select="izenburua"/></td>
						<td><xsl:value-of select="idazlea"/></td>
						<td><xsl:value-of select="isbn"/></td>
						<td><xsl:value-of select="orriak"/></td>
						</tr>
						</xsl:when>
						<xsl:when test="orriak &gt; 1000">
						<tr bgcolor="green">
						<td ><xsl:value-of select="izenburua"/></td>
						<td ><xsl:value-of select="idazlea"/></td>
						<td ><xsl:value-of select="isbn"/></td>
						<td ><xsl:value-of select="orriak"/></td>
						</tr>
						</xsl:when>
						<xsl:otherwise>
						<tr bgcolor="grey" >
						<td ><xsl:value-of select="izenburua"/></td>
						<td ><xsl:value-of select="idazlea"/></td>
						<td ><xsl:value-of select="isbn"/></td>
						<td ><xsl:value-of select="orriak"/></td>
						</tr>
						</xsl:otherwise>
					</xsl:choose>
					
					
					</xsl:for-each>
				</table>
				
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>