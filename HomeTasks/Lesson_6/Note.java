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
        return "Фирма-производитель: " + name + ", Объем ОП: " + ram + ", Объем памяти ЖД: " + hdMemory
        + ", Операционная система: " + operatSys + ", цвет: " + color + ", наличие на складе: " + stockQty;
                
    }
    
}
    

