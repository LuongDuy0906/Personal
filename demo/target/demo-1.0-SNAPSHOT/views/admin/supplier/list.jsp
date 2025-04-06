<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-supplier"/>
<c:url var="Supplierurl" value="/admin-supplier"/>

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
                    <h1 class="mt-4">Danh sách</h1>
                    <ol class="breadcrumb mb-4">
                        <li class="breadcrumb-item"><a href="<c:url value='/admin-supplier?type=list&page=1&maxPageItem=5&sortName=tenNCC&sortBy=DESC'/>">Quản lý</a></li>
                        <li class="breadcrumb-item active">Danh sách</li>
                    </ol>
                    <c:if test="${not empty messageRespone}">
                        <div class="alert alert-${alert}">
                            ${messageRespone}
                        </div>
                    </c:if>
                    <div class="card mb-4">
                        <div class="card-body">
                            <a href="<c:url value='/admin-supplier?type=edit'/>" class="btn btn-primary" data-toggle="tooltip" title="Thêm ncc">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle" viewBox="0 0 16 16">
                                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                                        <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                                    </svg>
                            </a>
                            <button id="btnDelete" data-toggle="tooltip" title="Xóa ncc" type="button" href="#" class="btn btn-danger">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                    <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0z"/>
                                    <path d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4zM2.5 3h11V2h-11z"/>
                                </svg> 
                            </button>
                        </div>
                    </div>
                    <form action="<c:url value='/admin-supplier'/>" id="formSubmit" method="GET">
                        <div class="card mb-4">
                            <div class="card-body">
                                <table class="table">
                                    <thead class="table-light">
                                        <tr>
                                            <th><input type="Checkbox" id="checkAll"></th>
                                            <th>Tên nhà cung cấp</th>
                                            <th>Địa chỉ</th>
                                            <th>Người liên hệ</th>
                                            <th>Email</th>
                                            <th>Số điện thoại</th>
                                            <th>Thao tác</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="item" items="${model.listResult}">
                                            <tr>
                                                <td><input type="Checkbox" id="checkbox_${item.ID}" value="${item.ID}"></td>
                                                <td>${item.tenNCC}</td>
                                                <td>${item.diaChi}</td>
                                                <td>${item.tenLH}</td>
                                                <td>${item.email}</td>
                                                <td>${item.sdt}</td>
                                                <td>
                                                    <c:url var="editURL" value="/admin-supplier">
                                                        <c:param name="type" value="edit"/>
                                                        <c:param name="ID" value="${item.ID}"/>
                                                    </c:url>
                                                    <a data-toggle="tooltip" title="Sửa thông tin" type="button" href="${editURL}" class="btn btn-infor">
                                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                                                            <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                                                            <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5z"/>
                                                        </svg>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <ul class="pagination justify-content-end" id="pagination"></ul>
                                <input type="hidden" value="" id="page" name="page"/>
                                <input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>
                                <input type="hidden" value="" id="sortName" name="sortName"/>
                                <input type="hidden" value="" id="sortBy" name="sortBy"/>
                                <input type="hidden" value="list" id="type" name="type"/>
                            </div>
                        </div>
                    </form>
                </div>
            </main>
    <script type="text/javascript">
        var totalPages = ${model.totalPage} 
        var currentPage = ${model.page};
        var visiblePages = ${model.maxPageItem} ;
        var limit = 5;
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
                        $('#sortName').val('tenNCC');
                        $('#sortBy').val('DESC');
                        $('#type').val('list')
                        $('#formSubmit').submit();
                    }
                }
            });/*.on('page', function (event, page) {
                console.info(page + ' (from event listening)');
            });*/
        });

        $("#btnDelete").click(function() {
            var data = {};
            var ids = $('tbody input[type=checkbox]:checked').map(function() {
                return $(this).val();
            }).get();
            data['ids'] = ids;
            deleteNew(data);
        });

        function deleteNew(data){
            $.ajax({
                url: '${APIurl}',
                type: 'DELETE',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function(result){
                    window.location.href = "${Supplierurl}?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESC&message=Xoa_Thanh_Cong";
                },
                error: function(error){
                    window.location.href = "${Supplierurl}?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESCmessage=Loi";
                }
            });
        }
    </script>
</body>
</html>