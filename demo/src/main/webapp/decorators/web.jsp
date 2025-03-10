<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><dec:title default="Trang chủ" /></title>

    <!-- css -->
    <link rel="preconnect" href="<c:url value='https://fonts.gstatic.com'/>"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet"/>  

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet"/>

    <!-- Libraries Stylesheet -->
    <link href="<c:url value='/template/web/lib/animate/animate.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/template/web/lib/owlcarousel/assets/owl.carousel.min.css'/>" rel="stylesheet"/>

    <!-- Customized Bootstrap Stylesheet -->
    <link href="<c:url value='/template/web/css/style.css'/>" rel="stylesheet"/>
<body>
    <!-- header -->
    <%@ include file="/common/web/header.jsp"%>
    <!-- header -->

    <div class="container-fluid mb-3">
        <dec:body/>
    </div>

    <!-- footer -->
    <%@ include file="/common/web/footer.jsp"%>
    <!-- footer -->

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="<c:url value='/template/web/lib/easing/easing.min.js'/>"></script>
    <script src="<c:url value='/template/web/lib/owlcarousel/owl.carousel.min.js'/>"></script>

    <!-- Contact Javascript File -->
    <script src="<c:url value='/template/web/mail/jqBootstrapValidation.min.js'/>"></script>
    <script src="<c:url value='/template/web/mail/contact.js'/>"></script>

    <!-- Template Javascript -->
    <script src="<c:url value='/template/web/js/main.js'/>"></script>

</body>