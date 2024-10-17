package Zad1;

public class Book {
    public String title;
    protected String author;
    private int publicationYear;

    public Book(){
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

}




