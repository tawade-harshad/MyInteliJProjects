var converterRef = require("./Converter");
var interestCal = require("./simpleinterest");
var areaOfCircle = require("./areaofcircle").circlarea(5);

console.log("Currency Conversion >>  $ 200 to INR is >> " + converterRef.currencyConverter(200));

console.log("Temperature Conversion >>  33 Fahrenheit is : " +converterRef.farenToCel(33) + " Celsius");

console.log("Simple Interest : " + interestCal.simpleInterest(5000,2,8.5));

console.log("Area of Circle is : " + areaOfCircle);