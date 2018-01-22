<html>
<body>
	<h1>Congratulations!! the Engineering college has processed your Application form successfully</h1>
 <h2>${message}</h2>
	<h2>${headerMessage}</h2>
	
	
	<table>
	<tr>
	<td>Student Name:</td>
	<td> ${student1.studentName} </td>
	
	</tr>
		<tr>
	<td> Student Hobby: </td>
	<td> ${student1.studentHobby} </td>
	
	</tr>
	
	
		<tr>
	<td> Student's Mobile </td>
	<td> ${student1.studentMobile} </td>
	
	</tr>
	
	
		<tr>
	<td> Student's DOB: </td>
	<td> ${student1.studentDOB} </td>
	
	</tr>
	

		<tr>
	<td> Student's Subjects:</td>
	<td> ${student1.studentSubjcts} </td>
	
	</tr>
		<tr>
	<td> Student's HouseNo</td>
	<td> ${student1.studentAddress.houseNo} </td>
	
	</tr>
	
		<tr>
	<td> Student's StreetName:</td>
	<td> ${student1.studentAddress.streetName} </td>
	
	</tr>
		<tr>
	<td> Student's Suburb:</td>
	<td> ${student1.studentAddress.suburb} </td>
	
	</tr>
		<tr>
	<td> Student's Post Code:</td>
	<td> ${student1.studentAddress.postCode} </td>
	
	</tr>
	</table>
 
</body>
</html>