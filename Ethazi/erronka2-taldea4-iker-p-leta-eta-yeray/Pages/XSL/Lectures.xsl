<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<!-- Root template -->
	<xsl:template match="/">
	<html>
	<head>
		<meta charset="utf-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"/>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
		<style>
		
		nav{
			background-color: #00A7C4;
		}
		span a{
			text-decoration:none;
			color:black;
			
		}
		li a:hover{
			background-color:#008299;
			font-size:17px;
		}
		a p{
			color:white;
		}
		footer{
		 background-color:#6600ff;
		}
		footer h5{
			text-align:center;
		}
		footer a p{
			font-size:14px;
			text-align:center;
			color:black;
			
		}
		footer p{
			text-align:center;
		}
		
	
		
		</style>
		
	</head>
	<body class="container-fluid">
		<header class="container-fluid w-100 ">
			<div class="container-fluid">
				<span class="float-sm-end"><a href="Lectures BilboardES.xml">ES|</a><a href="Lectures BilboardEUS.xml">EU|</a><a href="Lectures Bilboard.xml">EN</a></span>
				<br/>
				
			</div>
			<div class="container-fluid mt-2 clearfix">
				<nav class="navbar navbar-expand-lg ">
							<div class="container-fluid">
								<!-- Logo -->
								<a class="navbar-brand" href="../index.html">
									<img src="../images/logo.jpg" height="100" width="100" class="rounded-pill"/>
								</a>
								<!-- Toggle button for collapsed navbar -->
								<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
									<span class="navbar-toggler-icon"/>
								</button>
								<!-- Navigation links -->
								<div class="container-fluid collapse navbar-collapse justify-content-center" style="color:white" id="collapsibleNavbar">
									<ul class="navbar-nav">
										<li class="nav-item mx-4">
											<a class="nav-link active text-light" href="../index.html">Home page</a>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="Lectures Bilboard.xml">News</a>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="Employment_Exchange_EN.html">Employment Exchange</a>
										</li>
										<li class="nav-item dropdown mx-1">
											<a class="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown">Services</a>
											<ul class="dropdown-menu" style="background-color: #00A7C4">
												<li class="dropdown-item">
													<a class="nav-link text-light" href="Services_EN.html">Facilities</a>
												</li>
												<li class="dropdown-item">
													<a class="nav-link text-light" href="STAFF.xml">Staff</a>
												</li>
											</ul>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="Contact_US_EN.html">Contact Us</a>
										</li>
										<li class="nav-item mx-4">
											<a class="nav-link text-light" href="Login.html">Login</a>
										</li>
									</ul>
								</div>
							</div>
						</nav>
				 
			</div>
		</header>
		
		<section class="container-fluid"> 
		
		<br/>
		
		<h1 class="h1 ps-5 text-info">NEWS</h1>
		<hr class="w-75 mx-auto"/>
		<br/>
			<div id="demo" class="carousel slide py-3 " data-bs-ride="carousel">

 
				  <div class="carousel-indicators">
					<button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
					<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
					<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
				  </div>

				 
				  <div class="carousel-inner px-5 "  data-bs-interval="3000">
					<div class="carousel-item active">
						<img src="../images\AlkateEN.jpg"  class="d-block w-100 "/>
					  
					</div>
					<div class="carousel-item"  data-bs-interval="3000">
					  <img src="../images\teatroEN.png" class="d-block w-100 "/>
					</div>
					<div class="carousel-item"  data-bs-interval="3000">
					  <img src="../images\NewEN.jpg" class="d-block w-100 " />
					</div>
				  </div>

				  
				  <button  class="btn btn-success carousel-control-prev " type="button "  data-bs-target="#demo" data-bs-slide="prev">
					<span class=" btn  carousel-control-prev-icon"></span>
				  </button>
				  <button class="btn btn-success carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
					<span class=" btn  carousel-control-next-icon"></span>
				  </button>

		
		
		
		
		</div>
		<br/>
		<br/>
		
		<h1 class="h1 ps-5 text-info">LECTURES</h1>
		<br/>
	
		<hr class="w-75 mx-auto"/>
		<br/>
		
		
		
		
		<div class="container-fluid">
			<table class="table table-bordered table-hover">
				<tr class="table-danger">
					<th>Title</th>
					<th>Date</th>
					<th>Time</th>
					<th>Room</th>
					<th>Locutor</th>
				</tr>
				<xsl:for-each select="dataroot/Lectures_x0020_Bilboard">
				<xsl:choose>
					<xsl:when test="Place= 002">
					<tr class="table-info">
						<td><xsl:value-of select="Title"/></td>
						<td><xsl:value-of select="Date"/></td>
						<td><xsl:value-of select="Time"/></td>
						<td><xsl:value-of select="Place"/></td>
						<td><xsl:value-of select="Staff_Name"/> &#xA0; <xsl:value-of select="Surname"/></td>
					</tr>
					</xsl:when>
					<xsl:when test="Place= 004">
						<tr class="table-warning">
							<td><xsl:value-of select="Title"/></td>
							<td><xsl:value-of select="Date"/></td>
							<td><xsl:value-of select="Time"/></td>
							<td><xsl:value-of select="Place"/></td>
							<td><xsl:value-of select="Staff_Name"/> &#xA0; <xsl:value-of select="Surname"/></td>
							</tr>
						</xsl:when>
					<xsl:otherwise>
						<tr class="table-success">
							<td><xsl:value-of select="Title"/></td>
							<td><xsl:value-of select="Date"/></td>
							<td><xsl:value-of select="Time"/></td>
							<td><xsl:value-of select="Place"/></td>
							<td><xsl:value-of select="Staff_Name"/> &#xA0; <xsl:value-of select="Surname"/></td>
							</tr>
					
					
					</xsl:otherwise>
					
				</xsl:choose>
				</xsl:for-each>
			</table>
		
		
		
		
		</div>
		
		
		
		</section> 
		<footer class="container-fluid mt-3 me-5">
		<div class="container-fluid "> 
		<div class="row px-6">
			<div class=" container-fluid col-sm-3">
			<h5 class="py-2"> Social Media</h5>
			<div class="row ps-4">
					<div class="col-sm-4 mx-auto">
						<a href="https://www.instagram.com/" target="_blank"><img class="rounded-pill  mt-4 " src="../images\insta.jpg"  height="35" width="35"/></a>
					</div>
					
					<div class="col-sm-4 mx-auto">
						<a href="https://www.facebook.com/" target="_blank"><img class="rounded-pill  mt-4" src="../images\Facebook.png" height="35" width="35"/></a>
					</div>
					<div class="col-sm-4 mx-auto">
					<a href="https://twitter.com/" target="_blank"><img class="rounded-pill mt-4" src="../images\X-Logo.jpg" height="35" width="35"/></a>
					</div>
				
			</div>
			</div>
			<div class="col-sm-5 border-start  ">
					
					<h5 class="py-2" >Contact</h5>
					<div class="row">
						<div class="col pt-1">
							<h5 class="me-2" >Telf. number</h5 >
							<span><p> 685410548</p></span>
						</div>
						<div class="col pt-1 pe-5 me-3">
							<h5 >Email</h5>
							<span><a href="https://mail.google.com/" target="_blank"><p>Goizburu-Contact@goizburu.eus</p></a></span>
						</div>
					</div>
			</div>
			<div class="col-sm-4  border-start">
				<h5 class="py-2" >Location</h5>
				<iframe  height="100" width="400" class="container-fluid pb-3" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2909.187065492852!2d-2.4788704246877455!3d43.18458558261459!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd4e2a8a342e8ca1%3A0xf83892ecf0a5d70f!2sLegarre%20Kalea%2C%2013%2C%2020600%20Eibar%2C%20Gipuzkoa!5e0!3m2!1ses!2ses!4v1707902561370!5m2!1ses!2ses"  style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"/>
			</div>
		
		
		
		
		</div>
		</div>	
		</footer>
	</body>

</html>
</xsl:template>
</xsl:stylesheet>
