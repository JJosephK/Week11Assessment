<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item Editing</title>
<script type ="text/javascript">
function validateForm(form){
	if(form.type.value == ""){
		alert("error: field is empty");
		form.type.focus();
		return false;
	}
	
	var re = /^[\w ]+$/;
	
	if(!re.test(form.type.value)){
		alert("error: input contains invalid characters");
		form.type.focus();
		return false;
	}
	if(form.item.value == ""){
		alert("error: field is empty");
		form.item.focus();
		return false;
	}
	

	
	if(!re.test(form.item.value)){
		alert("error: input contains invalid characters");
		form.item.focus();
		return false;
	}
	
	//validation successful
	return true;
}



</script>

</head>
<body>
<form action = "editItemServlet" method = "post" onsubmit="return validateForm(this);">
Type: <input type = "text" name = "type" value = "${itemToEdit.type}">
Item: <input type = "text" name = "item" value = "${itemToEdit.item}">
<input type = "hidden" name = "id" value = "${itemToEdit.id}">
<input type = "submit" value = "Save Edited Item">
</form>
</body>
</html>