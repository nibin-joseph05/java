public class Book{
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int quantityInStock;

    public Book(){
        quantityInStock = 0;
    }
    public Book(String title, String author, String isbn, double price, int quantityInStock){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantityInStock(){
        return quantityInStock;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }
    public void setQuantityInStock(int newQuantity){
        
        if(newQuantity < 0){
            System.out.println("Quantity can't be negative!")
        }
        else{
            quantityInStock = newQuantity;
        }
    }

    public void displayBookDetails(){
        System.out.println("The Title of the book is : " + title);
        System.out.println("The author of the book is : " + author);
        System.out.println("The isbn of the book is : " + isbn);
        System.out.printf("The price of the book is %.2f : " , price);
        System.out.println("The quantity of the book is : " + quantityInStock);
    }

}