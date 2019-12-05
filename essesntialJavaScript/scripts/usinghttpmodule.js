var http = require('http');

var server = http.createServer(function (request, response) {
    if (request.url === '/welcome') {
        response.setHeader("content-Type", "text/plain");
        response.status = 200;
        response.end("Hello World from Node JS");
    }
    if (request.url === '/info') {
        response.setHeader("content-Type", "application/json");
        response.status = 200;
        response.end(JSON.stringify({"bookName:":"Mastering Book"}));
    }
});

server.listen(3000, function () {
    console.log("Server Running in Port No 3000");
})
