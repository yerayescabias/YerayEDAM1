<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<body>
				<h1>Nire bankua </h1>
				<h3> kontu zki Saldoa</h3>
				<xsl:value-of select="banco/cuenta/numero-cuenta"/>
				<xsl:value-of select="banco/cuenta/saldo"/>
			
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>
	