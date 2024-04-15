<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	<html>
		<head>
			<meta name="viewport" content="width=device-width, initial-scale=1"/>
			<link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet"/>
			<script src="bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
			<style>
				.white{
					color:white;
				}
			
			</style>
		</head>
		<body class="container">
		<div class="mx-auto">
		<h1 class="h1"> Turismo ostatuak</h1>
			<xsl:for-each select="//row[territory='Gipuzkoa']">
				<div class=" mb-4">
				<div class="clearfix">
						<div class="float-start"><img src="izarra.png" width="25" height="25"/></div>
						<div class="float-start" ><u><xsl:value-of  select="documentName"></xsl:value-of></u></div>
						
				</div>
				<div class="row">
							<div class="col-lg-6 bg-info pb-4">
								<span class="white"><xsl:value-of select="documentDescription"></xsl:value-of></span>
							</div>
							<div class="col-lg-3 bg-warning pb-4">
								<span class="white"><xsl:value-of select="municipality"></xsl:value-of></span>
							</div>
							<div class="col-lg-3 bg-warning pb-4">
								<span class="white"><xsl:value-of select="territory"></xsl:value-of></span>
							</div>
							
							
							
						
						</div>
				</div>
				</xsl:for-each>
				<xsl:for-each select="//row[territory='Bizkaia']">
				<div class=" mb-4">
					<div class="clearfix">
						<div class="float-start"><img src="izarra.png" width="25" height="25"/></div>
						<div class="float-start" ><u><xsl:value-of  select="documentName"></xsl:value-of></u></div>
						
				</div>
				<div class="row">
							<div class="col-lg-6 bg-info pb-4">
								<span class="white"><xsl:value-of select="documentDescription"></xsl:value-of></span>
							</div>
							<div class="col-lg-3 bg-warning pb-4">
								<span class="white"><xsl:value-of select="municipality"></xsl:value-of></span>
							</div>
							<div class="col-lg-3 bg-warning pb-4">
								<span class="white"><xsl:value-of select="territory"></xsl:value-of></span>
							</div>
							
							
							
						
						</div>
				
				
				
				
				
				</div>
			</xsl:for-each>
		</div>
		</body>
	
	</html>
	</xsl:template>
</xsl:stylesheet>