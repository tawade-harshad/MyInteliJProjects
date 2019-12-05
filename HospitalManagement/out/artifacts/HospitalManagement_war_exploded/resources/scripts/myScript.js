(function(){
    var txtField = document.getElementById("code");
    console.log("In script");
    txtField.addEventListener("focus", function () {

        var para = document.getElementById("msg");
        para.style.display="none";
    });
})();
