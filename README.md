# jersey-demo

This demo demonstrates simple examples of Jersey with path parameters and JSON array objects.

*Instructions:*

`curl -v -X GET  "http://localhost:8080/jersey-demo/myserver/firstname/Leonardo%20Cristofari"`

`curl -v -X GET  "http://localhost:8080/jersey-demo/myserver/sum/14/7"`

`curl -v -X POST -H "Content-Type:application/json" -H "Accept:application/json" -d '{"number":[{"number1":2,"number2":7,"number3":5},{"number1":2,"number2":3,"number3":5}]}'  http://localhost:8080/jersey-demo/myserver/sumtriple`
