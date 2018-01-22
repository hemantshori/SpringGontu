
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>

	<h1> ${headerMessage}</h1>
	<h1> ${headerMessage2}</h1>

	<h2> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h2>
	
	<form:errors path= "student1.*"/>

	<form action="/Gontu/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="studentName" />
		</p>
		<p>
			Student's Hobby : <input type="text" name="studentHobby" />
		</p>
		
			<p>
			Student's Mobile : <input type="text" name="studentMobile" />
		</p>
		<p>
			Student's DOB: <input type="Date" name="studentDOB" />
		</p>
		
		
	
			Student's Subjects: <select name ="studentSubjects" multiple>
			<option value = "Math 1"> Math 1" </option>
			<option value = "Modern Physics"> Modern Physics" </option>
			<option value = "Thermodynamics"> Thermodynamics </option>
			<option value = "Fluid Dynamics"> Fluid Dynamics</option>
			<option value = "Engineering Drying 1"> Engineering Drawing 1</option>
			</select>

<table>
<tr>
<td> Student's Address : </td></tr>
<tr>
<td> House Number:<input type="text" name="studentAddress.houseNo" /> </td>
<td> Street Name:<input type="text" name="studentAddress.streetName" /> </td>
<td> Suburb:<input type="text" name="studentAddress.suburb" /> </td>
<td> Post Code:<input type="text" name="studentAddress.postCode" /> </td>

</tr>
</table>
		
		<input type="submit" value="Submit this form by clicking here" />
	</form>
 
</body>
</html>

