package zad1;

public record Book(String title, String author, int pages) {
    public Book{
        if(pages < 0){
            throw new IllegalArgumentException("Liczba stron nie może być ujemna");
        }
    }

    public boolean isLarge(){
        return pages >= 400;
    }
}
