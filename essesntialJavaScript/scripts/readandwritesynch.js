let fs = require("fs");
let  app = {};

app.write = function () {
    fs.writeFileSync("Sample2.txt", 'New File Data - 3');
    console.log("File Write - Done");
}

app.read = function () {
    console.log("File Read - Start");
    var data = fs.readFileSync("Sample2.txt",'UTF-8');
    console.log(data)
}
app.read();
//app.write();