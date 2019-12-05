<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="" id="frm">
    <div>
        <label>Medicine Code : </label>
        <input type="text" id="medicineCode"/>
    </div>
    <div>
        <label>Medicine Name : </label>
        <input type="text" id="medicineName"/>
    </div>
    <div>
        <label>Medicine Type : </label>
        <input type="text" id="medType"/>
    </div>
    <div>
        <label>Rate per unit : </label>
        <input type="text" id="ratePerUnit"/>
    </div>
    <div id="msg"></div>
    <button id="getButton">Add Medicine</button>
</form>

<script>
    var getButton = document.getElementById("getButton");
    var msgDiv = document.getElementById("msg");
    $(function (){
        $("#getButton").on('click',function (event) {
            event.preventDefault();
            var medicineCode = $("#medicineCode").val();
            var medicineName = $("#medicineName").val();
            var medicineType = $("#medType").val();
            var ratePerUnit = $("#ratePerUnit").val();

            // var data = '{"code":'+medicineCode+',"medicineName":'+medicineName+',"type":'+medicineType+',"ratePerUnit":'+ratePerUnit+'}'
               var data = {"codeNumber": medicineCode,"medicineName": medicineName,"type": medicineType,"ratePerUnit": ratePerUnit};

                var jsonData = JSON.stringify(data);

            // Serialize is prefered.
            // var jsonData = JSON.stringify($("#frm").serialize());

            console.log(data)
            $.ajax({
                type:"POST",
                url:"http://localhost:8888/DoctorManagement_war_exploded/webapi/medicine",
                contentType:"application/json",
                dataType:'json',
                data:jsonData,
                success:function(resp){
                    $("#msg").html(resp);
                }
                //($("#frm").serialize())
            });
        });
    });
</script>
</body>
</html>
