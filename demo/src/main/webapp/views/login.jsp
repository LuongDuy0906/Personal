<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang chủ</title>
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
</head>
<body>
    <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Đăng nhập</h3></div>
                                    <div class="card-body">
                                        <form action="<c:url value='/dang-nhap'/>" id="formSubmit" method="POST">
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="tenND" name="tenND" placeholder="Tên đăng nhập">
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" type="password" id="matKhau" name="matKhau" placeholder="Mật khẩu">
                                            </div>
                                            <input type="hidden" value="login" name="action">
                                            <button class="btn btn-primary" type="submit">Đăng nhập</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
</body>