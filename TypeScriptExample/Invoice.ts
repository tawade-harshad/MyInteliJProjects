export default interface Invoice{
    invoiceNumber:number,
    customerName:string,
    amount:number,
    gstCode?:string
};