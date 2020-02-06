<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>CD's Home Page</title>
</head>
<body>
<table border="1">
 <tr>
<td><h2>CD's Page : Add A New Cd</h2></td>
 </tr>
</table>

 
 <form action="processForm" method="post">
  <div class="form-group">
    <label >CD Name</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>List of Cd</label>
    <select class="form-control" name="season">
      <option value="Unknown">Select...</option>
      <option value="Summer">Cd1</option>
      <option value="Winter">Cd2</option>
      <option value="Autumn">Cd3</option>
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Manufacture Year</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="year" name="year">
  </div>
 <input type="submit"/>  
 <input type="reset"/> 
</form>
 
</body>
</html>