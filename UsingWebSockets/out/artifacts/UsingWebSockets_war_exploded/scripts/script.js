(function(){
    // var websocket = new WebSocket("ws://localhost:8888/UsingWebSockets_war_exploded/wserver/Mumbai");
    var websocket = new WebSocket("ws://localhost:8888/UsingWebSockets_war_exploded/wserver/");
    var btnSend = document.getElementById("submit");
    var txtFieldMessage = document.getElementById("textMessage");
    var txtAreaResponse = document.getElementById("response");
    var btnEnd = document.getElementById("end");

    function handleClick() {
        var message = txtFieldMessage.value;

        // websocket.send(message);

        var obj = {
            "partnerCode":101,
            "partnerName":"Harshad",
            "mobileNumber":4505676543
        }
        websocket.send(JSON.stringify(obj));

        if(txtAreaResponse.value === "Hi, We are connected now. Start your Chat"){
            txtAreaResponse.value='';
        }
        txtFieldMessage.value='';
    }

    function displayMessage(message){
        var existingValue = txtAreaResponse.value;
        if(existingValue === "undefined"){
            txtAreaResponse.value = message.data;
        }else{
            txtAreaResponse.value = existingValue.concat(message.data) ;
        }

    }

    btnSend.addEventListener("click",handleClick);

    btnEnd.addEventListener("click",function () {
            websocket.close();
    })

    websocket.onmessage =  function (message) {
        displayMessage(message);
    }

    websocket.onopen = function (message) {
            displayMessage(message);
        }

            websocket.onclose= function (message) {
               txtAreaResponse.value= "Thank You for Chatting ! Session Closed.";
            }
})();