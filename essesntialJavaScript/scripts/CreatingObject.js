var app = (function(){
    var Product={};
    var Invoice={};

    Invoice.customer="Ramesh";
    Product.id = 101;
    Product.name = "Sony TV";
    Product.toString = function () {
        return this.id + "::" + this.name;
    }
    // console.log(Product.toString());
    return {
        prod: Product,
        inv:Invoice
    }

})();

function display() {
    console.log(app.prod.toString());
    console.log(app.inv.customer);
}

display();