<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="css" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
<div class="clear"></div>
<div id="page-content">
	<div class="container">
		<div class="row">
			<section class="col-sm-5 col-md-6 col-lg-6"
				style="padding-top: 100px">
				<div class="get-quote-form">
					<h2>Login</h2>
					<form id="get-quote">
						<div>
							<input type="text" name="email" placeholder="Email" />
						</div>
						<div>
							<input type="text" name="password" placeholder="Password" />
						</div>
						<div class="text-center">
							<input type="submit" class="btn-default" value="Submit" />
						</div>
					</form>
				</div>
			</section>
			<section class="col-sm-5 col-md-6 col-lg-6"
				style="padding-top: 100px">
				<div class="get-quote-form">
					<h2>Register</h2>
					<form id="get-quote">
						<div>
							<input type="text" name="name" placeholder="Your Name" />
						</div>
						<div>
							<input type="text" name="email" placeholder="Email" />
						</div>
						<div>
							<input type="text" name="ph-no" placeholder="Phone no" />
						</div>
						<div class="form-select">
							<span></span> <select>
								<option>Product</option>
							</select>
						</div>
						<div>
							<textarea rows="1" cols="1" placeholder="Message"></textarea>
						</div>
						<div class="text-center">
							<input type="submit" class="btn-default" value="Submit" />
						</div>
					</form>
				</div>
			</section>
		</div>
	</div>

</div>
<div class="clear"></div>
<jsp:include page="footer.jsp"></jsp:include>