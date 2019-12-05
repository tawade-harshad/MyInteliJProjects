(function () {
    var userName=document.getElementById("lUserName");
   /* var password=document.getElementById("lPassword");*/
    userName.addEventListener('focus',function () {
        var para=document.getElementById("msg");

        para.style.display='none';
    });
})();
