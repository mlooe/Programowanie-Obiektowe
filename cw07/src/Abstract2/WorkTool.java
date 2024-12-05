package Abstract2;

import java.time.Year;

public abstract class WorkTool {
    String name;
    int productionYear;

//    private WorkTool(){      prywatny konstuktor pusty
//    }

    public WorkTool(String name, int productionYear) {
        this.name = name;
        if(productionYear > Year.now().getValue()){
            this.productionYear = Year.now().getValue();
        }
        else{
            this.productionYear = productionYear;
        }
    }

    public abstract void use();
}


