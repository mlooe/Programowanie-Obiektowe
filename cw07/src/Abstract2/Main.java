package Abstract2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WorkTool> workTools = new ArrayList<>();
        workTools.add(new Hammer("młotek", 2024));
        workTools.add(new Screwdriver("krzyzak", 2024));
        workTools.add(new Screwdriver("plaski", 2024));
        workTools.add(new Saw("do drewna", 2024));
        workTools.add(new Saw("do metalu", 2024));

        for(WorkTool wt:workTools){
            wt.use();
        }

        WorkTool mlotek = new Hammer("młot", 2020);
        WorkTool lyzka = new WorkTool("łyżka", 1901) {
            @Override
            public void use() {
                System.out.println("Nałożono zupe na łyżke");
            }
        };
        System.out.println(lyzka);

    }
}
