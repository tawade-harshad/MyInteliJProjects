class Book{
    private bookNo:number;
    private bookName:string;
    private price:number;

    constructor(bookNo: number, bookName: string, price: number) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.price = price;
    }

    toString():string{
        return `${this.bookNo},${this.bookName},${this.price}`
    }
}