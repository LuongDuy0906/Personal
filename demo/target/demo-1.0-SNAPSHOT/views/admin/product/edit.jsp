<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-product"/>
<c:url var="Producturl" value="/admin-product"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Chỉnh sửa thông tin</title>
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
</head>

    <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                            <h1 class="mt-4">Quản lý sản phẩm</h1>
                            <ol class="breadcrumb mb-4">
                                <li class="breadcrumb-item"><a href="<c:url value='/admin-product?type=list&page=1&maxPageItem=5&sortName=tenSP&sortBy=DESC'/>">Quản lý</a></li>
                                <li class="breadcrumb-item active">Form sản phẩm</li>
                            </ol>
                             <div class="card mb-4">
                                    <div class="card-body">
                                        <c:if test="${not empty messageRespone}">
                                            <div class="alert alert-${alert}">
                                                ${messageRespone}
                                            </div>
                                        </c:if>
                                        <form id="formSubmit">
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="tenSP" name="tenSP" type="text" value="${model.tenSP}" />
                                                        <label for="moTa">Tên sản phẩm</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating">
                                                        <input class="form-control" id="moTa" name="moTa" type="text" value="${model.moTa}"/>
                                                        <label for="moTa">Mô tả</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="soLuong" name=soLuong type="text" value="${model.soLuong}" />
                                                <label for="soLuong">Số lượng</label>
                                            </div>
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3">
                                                        <select class="form-select" id="code" name="code">
                                                            <c:if test="${empty model.code}">
                                                                <option value="">Loại sản phẩm</option>
                                                                <c:forEach var="item" items="${categories}">
                                                                    <option value="${item.code}">${item.loai}</option>
                                                                </c:forEach>
                                                            </c:if>
                                                            <c:if test="${not empty model.code}">
                                                                <c:forEach var="item" items="${categories}">
                                                                    <c:if test="${item.code == model.code}">
                                                                        <option value="${item.code}" selected="selected">
                                                                            ${item.loai}
                                                                        </option>
                                                                    </c:if>
                                                                </c:forEach>
                                                            </c:if>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="idkm" name="idkm" type="text" value="${model.IDKM}" />
                                                        <label for="IDKM">Loại khuyến mãi</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="gia" name="gia" type="text" value="${model.gia}"/>
                                                        <label for="gia">Giá</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="giaKM" name="giaKM" type="text" value="${model.giaKM}"/>
                                                        <label for="giaKM">Giá khuyến mãi</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="mt-4 mb-0">
                                                <c:if test="${not empty model.ID}">
                                                    <div class="d-grid"><input type="button" class="btn btn-primary btn-block" value="Cập nhật" id="btnAddOrUpdate"></div>
                                                </c:if>
                                                <c:if test="${empty model.ID}">
                                                    <div class="d-grid"><input type=button class="btn btn-primary btn-block" value="Thêm mới" id="btnAddOrUpdate">Thêm mới</div>
                                                </c:if>
                                            </div>
                                            <input type="hidden" value="${model.ID}" id="id" name="id">
                                        </form>
                                    </div>
                                </div>
                    </div>
                </main>
                <script>
                    $("#btnAddOrUpdate").click(function(e){
                        e.preventDefault();

                        var formData = $('#formSubmit').serializeArray();
                        var data = {};

                        $.each(formData, function (i , v){
                            data[""+v.name+""] = v.value;
                        });
                        var id = $('#id').val();
                        if(id == ""){
                            addNew(data);
                        }else{
                            updateNew(data);
                        }
                    });

                    function addNew(data){
                        $.ajax({
                            url: '${APIurl}',
                            type: 'POST',
                            contentType: 'application/json',
                            data: JSON.stringify(data),
                            dataType: 'json',
                            success: function(result){
                                window.location.href = "${Producturl}?type=edit&ID=" + result.id + "&message=Them_Thanh_Cong";
                            },
                            error: function(error){
                                window.location.href = "${Producturl}?type=edit&page=1&maxPageItem=5&sortName=ID&sortBy=DESC&message=Loi";
                            }
                        });
                    }

                    function updateNew(data){
                        $.ajax({
                            url: '${APIurl}',
                            type: 'PUT',
                            contentType: 'application/json',
                            data: JSON.stringify(data),
                            dataType: 'json',
                            success: function(result){
                                window.location.href = "${Producturl}?type=edit&ID=" + result.id + "&message=Sua_Thanh_Cong";
                            },
                            error: function(error){
                                window.location.href = "${Producturl}?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESCmessage=Loi";
                            }
                        });
                    }
                </script>
