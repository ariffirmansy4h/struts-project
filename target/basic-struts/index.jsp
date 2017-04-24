<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html>
<head>
    <sj:head/>
    <sb:head/>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    <div class="container">
        <div class="row">
            <div class="Absolute-Center is-Responsive">
                <div class="col-sm-12 col-md-10 col-md-offset-1">
                <s:form action="Home" theme="bootstrap">
                    <div class="form-group input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <s:textfield name="username"/>
                    </div>
                    <div class="form-group input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <s:password name="password"/>
                    </div>
                    <div class="form-group">
                        <s:submit value="Login" cssClass="btn btn-def btn-block" validate="true"/>
                    </div>
                </s:form>

                </div>
            </div>
        </div>
    </div>

</body>
</html>