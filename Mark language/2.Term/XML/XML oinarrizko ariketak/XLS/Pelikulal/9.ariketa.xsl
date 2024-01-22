<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<body>
				<h1>Pelikulen zerrenda </h1>
				
				<table border="3">
					<tr bgcolor="grey">
						<th>Izenburua</th>
						<th>komentarioa </th>
						
					</tr>
					<xsl:for-each select="peliculas/pelicula">
					<xsl:sort select="titulo"/>
					<tr>
						<td><xsl:value-of select="titulo"/></td>
						<td><xsl:value-of select="comentario"/></td>
					</tr>
					</xsl:for-each>
				</table>
				
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>