<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></head>
<body>
<input type="text" />
<button>上传</button>
<form id="file_form" action="fileUpload2" enctype="multipart/form-data"
      method="post">
    <input type="file" name="file" id="file_input" />
    <input type="submit" value="文件上传" id='upFile-btn'>
</form>
${upload}
</body>
</html>
