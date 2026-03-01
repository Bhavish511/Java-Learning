<%@page language="java" %>

<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Result is: <%=  session.getAttribute("result") %> </h2>
        <h2>Result is: ${result} </h2>

    </div>
</body>
</html>