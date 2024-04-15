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
				<h1>Pelikulen zerrenda </h1>
				
				<table class="table table-hover table-striped table-sm w-50 m-auto shadow-lg " >
					<tr bgcolor="grey">
						<th>Izenburua</th>
						<th>1.autor</th>
						<th>komentarioa </th>
						
					</tr>
					<xsl:for-each select="peliculas/pelicula">
					<tr>
						<td>
							<xsl:value-of select="titulo"/>
						</td>
						<td>
							<ul>
									
										<xsl:for-each select="autor" >
											<li>
												<xsl:value-of select="."/>
												<br/>
											</li>
										</xsl:for-each>
									
							</ul>
						</td>
						<td>
							<xsl:value-of select="comentario"/>
						</td>
						
					</tr>
					
					</xsl:for-each>
				</table>
				
		</body>
  </html>
</xsl:template>
</xsl:stylesheet>