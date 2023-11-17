package HomeTasks.Lesson_6;

public class Note {
    String name;
    int ram;
    int hdMemory;
    String operatSys;
    String color;
    String search;
    int stockQty;

    @Override
    public String toString() {
        return "name: " + name + ", ram: " + ram + ", hdMemory: " + hdMemory
        + ", operatSys: " + operatSys + ", color: " + color + ", on stock: " + stockQty;
                
    }
}
    

