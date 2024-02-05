<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <head>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <style>
                    table {
                        border-collapse: collapse;
                        width: 100%;
                        border: 1px solid red;
                    }
                    th, td {
                        border: 1px solid green;
                        padding: 8px;   
                        text-align: left;
                    }
                    th, td {
                        color: MediumSeaGreen;
                    }
                    
                </style>
            </head>
            <body>
                <h1>Pelikulen Zerrenda:</h1>
                <table>
                    <tr style="background-color: grey;">
                        <th>Izenburua</th>
                        <th>Egilea</th>
                        <th>Komentarioa</th>
                        <th>Interpretea</th>
                    </tr>
                    <xsl:for-each select="peliculas/pelicula">
                        <xsl:sort select="titulo" />

                        <tr>
                            <td>
                                <xsl:value-of select="titulo" />
                            </td>
                            <td>
                                <ul>
                                    <xsl:for-each select="autor">
                                        <li>
                                            <xsl:value-of select="." />
                                        </li>
                                    </xsl:for-each>
                                </ul>
                            </td>
                            <td>
                                <xsl:value-of select="comentario" />
                            </td>
                            <td>
                                <ul>
                                    <xsl:for-each select="interprete">
                                        <li>
                                            <xsl:value-of select="." />
                                        </li>
                                    </xsl:for-each>
                                </ul>
                            </td>
                        </tr>

                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
    