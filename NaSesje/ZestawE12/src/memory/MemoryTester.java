package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager ram = new RAMManager();
        DiskManager disk = new DiskManager();

        ram.allocateMemory(5);
        ram.freeMemory();

        disk.allocateMemory(40);
        disk.freeMemory();

        System.out.println(MemoryManager.getMemoryType());
    }
}
