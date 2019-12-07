"use strict";
exports.__esModule = true;
var OrderBook = /** @class */ (function () {
    function OrderBook(orderNo) {
        this.orderNo = orderNo;
    }
    OrderBook.prototype.showInvoice = function (invRef) {
        var info = this.orderNo + "," + invRef.customerName + "," + invRef.amount * 10;
        console.log(info);
    };
    return OrderBook;
}());
var ramOrder = new OrderBook(101);
var tv = { invoiceNumber: 201, customerName: "Ramesh", amount: 45000, gstCode: "H12345" };
ramOrder.showInvoice(tv);
