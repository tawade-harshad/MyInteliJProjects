var module = (function(){
    var app={};
    var baseSize=12;

    app.changeFont = function(){
        var heading = document.getElementById("pgheading");
        heading.style.fontSize=baseSize+"px";
        baseSize=baseSize+2;
    }

    app.init = function () {
        var increaseImage = document.getElementById("increaseFont");
        console.log("init function called")
        increaseImage.addEventListener("click",app.changeFont);
    }

    app.init();
})();