var add = (function(){
    var count=1;
    return function(){
        return count = count+1;
    }
})();

console.log(add());
console.log(add());
console.log(add());