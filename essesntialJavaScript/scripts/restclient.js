var Client = require('node-rest-client').Client;

var myClient = new Client();

myClient.get("http://localhost:5050/customer", function (data,response) {
    console.log(JSON.stringify(data));
})