var fs = require("fs");
var app = {};

app.write = function (text) {
    fs.appendFile("Sample.txt", text, (err) => {
        if (err) {
            console.log(err);
        } else {
            console.log('File Writing Done')
        }
        fs.close(1,function () {
            
        });
    });

}

app.read = function () {
    fs.readFile("Sample.txt",'UTF-8',(data,err)=>{
       if(err){
           console.log(err);
       }else{
           console.log(data);
       }
        fs.close(1,function () {
            console.log("File Closed.")
        });
    });
}
app.read();
//app.write("This is Line 3. \n");

