var converter = {};

converter.currencyConverter = function(dlrAmount){
    return dlrAmount * 60.00;
}

converter.farenToCel = function(farenTemp){
    return ( (5/9) * (farenTemp-32) )
}
module.exports = converter;