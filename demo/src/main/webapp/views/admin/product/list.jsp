<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Danh sách sản phẩm</title>
</head>

<body>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">Tables</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                    <li class="breadcrumb-item active">Tables</li>
                </ol>
                <div class="card mb-4">
                    <div class="card-body">
                        DataTables is a third party plugin that is used to generate the demo table below. For more
                        information about DataTables, please visit the
                        <a target="_blank" href="https://datatables.net/">official DataTables documentation</a>
                        .
                    </div>
                </div>
                <div class="card mb-4">
                    <div class="card-body">
                        <table class="table">
                            <thead class="table-light">
                                <tr>
                                    <th>Mã sản phẩm</th>
                                    <th>Tên sản phẩm</th>
                                    <th>Loại sản phẩm</th>
                                    <th>Số lượng</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="item" items="${model.listResult}">
                                    <tr>
                                        <td>${item.SPID}</td>
                                        <td>${item.tenSP}</td>
                                        <td>${item.loaiSP}</td>
                                        <td>${item.soLuong}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <ul class="pagination justify-content-end" id="pagination"></ul>
                    </div>
                </div>
            </div>
        </main>
    <script type="text/javascript">
        $(function () {
            window.pagObj = $('#pagination').twbsPagination({
                totalPages: 10,
                visiblePages: 5,
                startPage: 2,
                onPageClick: function (event, page) {
                    console.info(page + ' (from options)');
                }
            }).on('page', function (event, page) {
                console.info(page + ' (from event listening)');
            });
        });
    </script>
</body>
</html>