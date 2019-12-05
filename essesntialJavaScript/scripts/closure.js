function outer() {
    var name = "Hello World";

    return function (){
        return name;
    }
}

function displayName() {
    var funcRef = outer();

    // console.log(name);
    console.log(funcRef);

    var capturedPrived = funcRef();
    console.log(capturedPrived);
}

displayName();