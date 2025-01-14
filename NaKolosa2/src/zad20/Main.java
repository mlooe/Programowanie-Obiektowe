package zad20;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdzFormatDanych("aaa&gmail.com");
        }catch(NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException
    {
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException("Niepoprawny email!");
        }
        System.out.println("Poprawny email.");
    }


}

