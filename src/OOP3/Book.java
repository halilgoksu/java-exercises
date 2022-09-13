package OOP3;

public class Book {
   private String title;
    private String author;
    private String publisher;
    private String copyright;

    //constructor
    public Book(String title,String author,String publisher,String copyright){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.copyright=copyright;
    }

    //getters
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getPublisher(){return  publisher;}
    public String getCopyright(){return copyright;}

    //setters
    public void setTitle(String title){this.title=title;}

    public void setAuthor(String author) {this.author = author;}

    public void setPublisher(String publisher) {this.publisher = publisher;}

    public void setCopyright(String copyright) {this.copyright = copyright;}

    public String toString(){
        return "\nTitle "+title +"\nAuthor "+author+ "\nPublisher "+publisher+ "\nCopyright "+copyright;
    }





}
