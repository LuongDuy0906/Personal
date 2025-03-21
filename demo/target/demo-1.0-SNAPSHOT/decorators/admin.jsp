<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Tables - SB Admin</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
    <link href="<c:url value='template/admin/css/styles.css'/>" rel="stylesheet" />
    <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="<c:url value='template/admin/js/scripts.js'/>"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
    <script src="<c:url value='template/paging/jquery.twbsPagination.js'/>"></script>
</head>
<body class="sb-nav-fixed">
	<!-- header -->
    <%@ include file="/common/admin/header.jsp" %>
    <!-- header -->
	
	<div id="layoutSidenav">
		<!-- header -->
    	<%@ include file="/common/admin/menu.jsp" %>
    	<!-- header -->
		
		<dec:body/>

        <%@ include file="/common/admin/footer.jsp" %>
	</div>
</body>
</html>