<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-employee"/>
<c:url var="Employeeurl" value="/admin-employee"/>

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
                            <h1 class="mt-4">Quản lý nhà cung cấp</h1>
                            <ol class="breadcrumb mb-4">
                                <li class="breadcrumb-item"><a href="<c:url value='/admin-employee?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESC'/>">Quản lý</a></li>
                                <li class="breadcrumb-item active">Form nhà cung cấp</li>
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
                                                        <input class="form-control" id="hoTen" name="hoTen" type="text" value="${model.hoTen}" />
                                                        <label for="tenNCC">Họ tên nhân viên</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating">
                                                        <input class="form-control" id="diaChi" name="diaChi" type="text" value="${model.diaChi}"/>
                                                        <label for="diaChi">Địa chỉ</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="sdt" name="sdt" type="text" value="${model.sdt}" />
                                                        <label for="sdt">Số điện thoại</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="mt-4 mb-0">
                                                <c:if test="${not empty model.ID}">
                                                    <div class="d-grid"><input type="button" class="btn btn-primary btn-block" value="Cập nhật" id="btnAddOrUpdate"></div>
                                                </c:if>
                                                <c:if test="${empty model.ID}">
                                                    <div class="d-grid"><input type=button class="btn btn-primary btn-block" value="Thêm mới" id="btnAddOrUpdate"></div>
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
                                window.location.href = "${Employeeurl}?type=edit&ID=" + result.id + "&message=Them_Thanh_Cong";
                            },
                            error: function(error){
                                window.location.href = "${Employeeurl}?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESCmessage=Loi";
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
                                window.location.href = "${Employeeurl}?type=edit&ID=" + result.id + "&message=Sua_Thanh_Cong";
                            },
                            error: function(error){
                                window.location.href = "${Employeeurl}?type=list&page=1&maxPageItem=5&sortName=ID&sortBy=DESCmessage=Loi";
                            }
                        });
                    }
                </script>
