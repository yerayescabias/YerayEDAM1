<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<!-- Root template -->
	<xsl:template match="/">
		<html>
			<head>
				<meta charset="utf-8"/>
				<meta name="viewport" content="width=device-width, initial-scale=1"/>
				<title>Staff Information</title>
				<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"/>
				<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"/>
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
						background-color:#00A7C4;
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
		
					.myCard {
    					background-color: transparent;
    					width: 190px;
    					height: 254px;
    					perspective: 1000px;
    					margin:auto;
					}

					.cardtitle {
    					font-size: 1.5em;
    					font-weight: 900;
    					text-align: center;
    					margin: 0;
					}

					.innerCard {
    					position: relative;
    					width: 100%;
    					height: 100%;
    					text-align: center;
    					transition: transform 0.8s;
    					transform-style: preserve-3d;
    					cursor: pointer;
					}

					.myCard:hover .innerCard {
    					transform: rotateY(180deg);
					}

					.frontSide,
					.backSide {
    					position: absolute;
    					display: flex;
    					flex-direction: column;
    					align-items: center;
    					justify-content: space-evenly;
    					width: 100%;
    					height: 100%;
    					-webkit-backface-visibility: hidden;
    					backface-visibility: hidden;
    					border: 1px solid rgba(255, 255, 255, 0.8);
    					border-radius: 1rem;
    					color: white;
    					box-shadow: 0 0 0.3em rgba(255, 255, 255, 0.5);
    					font-weight: 700;
    				}

					.frontSide,
					.frontSide::before {
    					background: linear-gradient(43deg, rgb(65, 88, 208) 0%, rgb(200, 80, 192) 46%, rgb(255, 204, 112) 100%);
					}

					.backSide,
					.backSide::before {
    					background-image: linear-gradient(160deg, #0093E9 0%, #80D0C7 100%);
					}

					.backSide {
    					transform: rotateY(180deg);
					}

					.frontSide::before,
					.backSide::before {
    					top: 50%;
    					left: 50%;
    					transform: translate(-50%, -50%);
    					content: '';
    					width: 110%;
    					height: 110%;
    					position: absolute;
    					z-index: -1;
    					border-radius: 1em;
    					filter: blur(20px);
    					animation: animate 5s linear infinite;
					}

					@keyframes animate {
						0% {
    					opacity: 0.3;
						}

						80% {
    					opacity: 1;
						}

						100% {
    					opacity: 0.3;
						}
					}

					.content{
    					margin: auto;
    					background-color: pink;
					}
                </style>
			</head>
			<body class="container-fluid">
				<!-- Header section -->
				<header class="m-auto w-100 ">
					<!-- Language options -->
					<div class="container-fluid">
						<span class="float-sm-end">
							<a href="../PAGES/STAFF_ES.xml">ES|</a>
							<a href="../PAGES/STAFF_EU.xml">EU|</a>
							<a href="../PAGES/STAFF.xml">EN</a>
						</span>
						<br/>
					</div>
					<!-- Navigation bar -->
					<div class="container-fluid mt-2 clearfix">
						<nav class="navbar navbar-expand-lg ">
							<div class="container-fluid">
								<!-- Logo -->
								<a class="navbar-brand" href="../PAGES/indexEUS.html">
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
											<a class="nav-link active text-light" href="../PAGES/indexEUS.html">Hasiera</a>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="../PAGES/Lectures BilboardEUS.xml">Berriak</a>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="../PAGES/Employment_Exchange_EU.html">Enplegu Poltsa</a>
										</li>
										<li class="nav-item dropdown mx-1">
											<a class="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown">Zerbitzuak</a>
											<ul class="dropdown-menu" style="background-color: #00A7C4">
												<li class="dropdown-item">
													<a class="nav-link text-light" href="../PAGES/Services_EU.html">Azpiegiturak</a>
												</li>
												<li class="dropdown-item">
													<a class="nav-link text-light" href="../PAGES/STAFF_EU.xml">Lantaldea</a>
												</li>
											</ul>
										</li>
										<li class="nav-item mx-3">
											<a class="nav-link text-light" href="../PAGES/Contact_US_EU.html">Kontaktua</a>
										</li>
										<li class="nav-item mx-4">
											<a class="nav-link text-light" href="../PAGES/Login_EU.html">Hasi saioa</a>
										</li>
									</ul>
								</div>
							</div>
						</nav>
					</div>
				</header>
				<!-- Staff information section -->
				<section>
                <div class="container">
                    <!-- Loop through staff members -->
                    <xsl:for-each select="dataroot/STAFF[position() mod 4 = 1]">
					<br></br>
                        <div class="row">
                            <!-- Loop through columns -->
                            <xsl:for-each select=". | following-sibling::STAFF[position() &lt; 4]">
                                <div class="col-sm-3">
                                    <div class="myCard">
                                        <div class="innerCard">
                                            <div class="frontSide">
                                                <p class="title">
                                                    <xsl:value-of select="Staff_Name"/>
													<br></br>
													<xsl:value-of select="Surname"/>
													<br></br>
													<br></br>
                                                    <img src="{Image}" style="width:110px;height:120px;"/>
                                                </p>
                                                <p>
                                                    <xsl:value-of select="Type"/>
                                                </p>
                                            </div>
                                            <div class="backSide">
                                                <p class="title">INFORMAZIOA</p>
                                                <p>
                                                    <xsl:value-of select="Text"/>
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </xsl:for-each>
							
                        </div>
                    </xsl:for-each>
                </div>
            </section>
			<br></br>
				<footer class="ms-3 me-2">
					<div class="container-fluid">
						<div class="row px-6">
							<div class="container-fluid col-sm-3">
								<p class="py-2"> Sare sozialak</p>
								<div class="row ps-4">
									<div class="col-sm-4 mx-auto">
										<a href="https://www.instagram.com/" target="_blank">
											<img class="rounded-pill mt-4" src="../images\insta.jpg" height="35" width="35"/>
										</a>
									</div>
									<div class="col-sm-4 mx-auto">
										<a href="https://www.facebook.com/" target="_blank">
											<img class="rounded-pill mt-4" src="../images\Facebook.png" height="35" width="35"/>
										</a>
									</div>
									<div class="col-sm-4 mx-auto">
										<a href="https://twitter.com/" target="_blank">
											<img class="rounded-pill mt-4" src="../images\X-Logo.jpg" height="35" width="35"/>
										</a>
									</div>
								</div>
							</div>
							<div class="col-sm-5 border-start">
								<p class="py-2">Kontaktua</p>
								<div class="row">
									<div class="col pt-1">
										<p class="me-2">Telefono zenbakia</p>
										<span><p> 685410548</p></span>
									</div>
									<div class="col pt-1 pe-5 me-3">
										<h5>Emaila</h5>
										<span><a href="https://mail.google.com/"><p>Goizburu-Contact@goizburu.eus</p></a></span>
									</div>
								</div>
							</div>
							<div class="col-sm-4 border-start">
								<h5 class="py-2">Kokapena</h5>
							
								<iframe width="400" height="100" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2909.187065492852!2d-2.4788704246877455!3d43.18458558261459!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd4e2a8a342e8ca1%3A0xf83892ecf0a5d70f!2sLegarre%20Kalea%2C%2013%2C%2020600%20Eibar%2C%20Gipuzkoa!5e0!3m2!1ses!2ses!4v1707902561370!5m2!1ses!2ses"></iframe> 
								
				
							</div>
						</div>
					</div>
				</footer>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
