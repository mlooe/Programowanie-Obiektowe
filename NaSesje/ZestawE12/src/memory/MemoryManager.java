package memory;

public interface MemoryManager {
    abstract void allocateMemory(int size);
    default void freeMemory(){
        System.out.println("Memory freed");
    }

    static String getMemoryType(){
        return "Memory type";
    }
}
