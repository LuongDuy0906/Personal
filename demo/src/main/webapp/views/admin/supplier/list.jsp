<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Danh sách sản phẩm</title>
</head>

<body>
    <form action="<c:url value='/admin-supplier'/>" id="formSubmit" method="GET">
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
                                        <th>Tên nhà cung cấp</th>
                                        <th>Địa chỉ</th>
                                        <th>Người liên hệ</th>
                                        <th>Email</th>
                                        <th>Số điện thoại</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${model.listResult}">
                                        <tr>
                                            <td>${item.ID}</td>
                                            <td>${item.tenNCC}</td>
                                            <td>${item.diaChi}</td>
                                            <td>${item.tenLH}</td>
                                            <td>${item.email}</td>
                                            <td>${item.sdt}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <ul class="pagination justify-content-end" id="pagination"></ul>
                            <input type="hidden" value="" id="page" name="page"/>
                            <input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>
                            <input type="hidden" value="" id="sortName" name="sortName"/>
                            <input type="hidden" value="" id="sortBy" name="sortBy"/>
                        </div>
                    </div>
                </div>
            </main>
    </form>
    <script type="text/javascript">
        var totalPages = ${model.totalPage} 
        var currentPage = ${model.page};
        var visiblePages = ${model.maxPageItem} ;
        var limit = 2;
        $(function () {
            window.pagObj = $('#pagination').twbsPagination({
                totalPages: totalPages,
                visiblePages: 10,
                startPage: currentPage,
                onPageClick: function (event, page) {
                    //console.info(page + ' (from options)');
                    if(currentPage != page){
                        $('#maxPageItem').val(limit);
                        $('#page').val(page);
                        $('#sortName').val('TenSP');
                        $('#sortBy').val('DESC');
                        $('#formSubmit').submit();
                    }
                }
            });/*.on('page', function (event, page) {
                console.info(page + ' (from event listening)');
            });*/
        });
    </script>
</body>
</html>