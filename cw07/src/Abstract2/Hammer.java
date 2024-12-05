package Abstract2;

public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

//    public Hammer(){             nie mozna wywołac bo jest prywatny konstruktor pusty WorkTool()
//        super();
//    }

    @Override
    public void use() {
        System.out.println("Młotek użyty do wbicia gwoździa");
    }
}

