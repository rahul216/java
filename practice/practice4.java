class book{
    static int totalBooks;

     String author;
     String title;
     String isbn;
     boolean isBorrowed;

// creating a static code block to initialize total books to zero 
static {
    totalBooks = 0;
}
// object code block 
{
    totalBooks++;
}
// constructor to initialize book details
book(String title, String isbn ,  String author){

    this.author = author;
    this.title = title;
    this.isbn = isbn;
}

book(String isbn){
    this("unknown", isbn,"unknown");
}
static int getTotalBooks(){
    return totalBooks;
}

void borrow(){
    if(isBorrowed){
        System.out.println("Book is already borrowed");
    }else{
        this.isBorrowed = true;
        System.out.println("Book borrowed successfully");
    }
}

void returnBook(){
    if(isBorrowed){
        this.isBorrowed = false;
        System.out.println("Book returned successfully");
    } else{ System.out.println("This book is already returned.");
}
}

}
public class practice4 {
    public static void main(String[] args) {
        book b1 = new book("the unknown book", "341245","rahul bachheti");
        System.out.println(book.getTotalBooks());
        b1.borrow();
        System.out.println(book.getTotalBooks());
        b1.returnBook();
        
    }
}
