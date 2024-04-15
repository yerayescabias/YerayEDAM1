<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet"/>
			<script src="bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
			
		</head>
		<body class="container">
		
			<xsl:for-each select="//province">
				<xsl:if test="population &gt; 500000">
					<div class="border border-4 border-success rounded mb-4">
						<div class="container">
						<h1><span class="me-2"><xsl:value-of select="name"/></span>(<span><xsl:value-of select="area"/>km2)</span></h1>
						<xsl:for-each select="city">
						<xsl:if test="population &gt; 500000">
							<ul>
							<li><xsl:value-of select="name"></xsl:value-of></li>
							</ul>
						</xsl:if>
						</xsl:for-each>
						</div>
					
					</div>
				
				
				
				</xsl:if>
			</xsl:for-each>
		</body>
	
	</html>
	</xsl:template>
</xsl:stylesheet>