/*
import java.util.*;

class NoteBook {
    private String model;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;
    
    // Конструктор класса
    public NoteBook(String model, int ram, int storage, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    
    // Метод для получения модели ноутбука
    public String getModel() {
        return model;
    }
    
    // Метод для получения объема оперативной памяти
    public int getRAM() {
        return ram;
    }
    
    // Метод для получения объема жесткого диска
    public int getStorage() {
        return storage;
    }
    
    // Метод для получения операционной системы
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    // Метод для получения цвета ноутбука
    public String getColor() {
        return color;
    }
}

public class LaptopStore {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = createNotebooks(); // Создаем множество ноутбуков
        
        // Запрашиваем критерий фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int criterion = scanner.nextInt();
        
        // Запрашиваем минимальное значение для указанного критерия
        System.out.println("Введите минимальное значение для выбранного критерия:");
        int minValue = scanner.nextInt();
        
        // Фильтруем ноутбуки и выводим результат
        Set<NoteBook> filteredNotebooks = filterNotebooks(notebooks, criterion, minValue);
        System.out.println("Результаты фильтрации:");
        printNotebooks(filteredNotebooks);
    }
    
    // Создаем множество ноутбуков
    public static Set<NoteBook> createNotebooks() {
        Set<NoteBook> notebooks = new HashSet<>();
        
        NoteBook notebook1 = new NoteBook("Model 1", 8, 512, "Windows 10", "Silver");
        NoteBook notebook2 = new NoteBook("Model 2", 16, 1024, "MacOS", "Space Gray");
        NoteBook notebook3 = new NoteBook("Model 3", 4, 256, "Windows 10", "Black");
        NoteBook notebook4 = new NoteBook("Model 4", 8, 512, "Linux", "White");
        NoteBook notebook5 = new NoteBook("Model 5", 16, 1024, "Windows 10", "Silver");
        
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        
        return notebooks;
    }
    
    // Фильтруем ноутбуки по заданному критерию и минимальному значению
    public static Set<NoteBook> filterNotebooks(Set<NoteBook> notebooks, int criterion, int minValue) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        
        for (NoteBook notebook : notebooks) {
            boolean isMatching = false;
            
            switch (criterion) {
                case 1:
                    if (notebook.getRAM() >= minValue) {
                        isMatching = true;
                    }
                    break;
                case 2:
                    if (notebook.getStorage() >= minValue) {
                        isMatching = true;
                    }
                    break;
                case 3:
                    if (notebook.getOperatingSystem().equals(String.valueOf(minValue))) {
                        isMatching = true;
                    }
                    break;
                case 4:
                    if (notebook.getColor().equals(String.valueOf(minValue))) {
                        isMatching = true;
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий фильтрации.");
                    return filteredNotebooks;
            }
            
            if (isMatching) {
                filteredNotebooks.add(notebook);
            }
        }
        
        return filteredNotebooks;
    }
    
    // Выводим информацию о ноутбуках
    public static void printNotebooks(Set<NoteBook> notebooks) {
        for (NoteBook notebook : notebooks) {
            System.out.println("Модель: " + notebook.getModel());
            System.out.println("ОЗУ: " + notebook.getRAM());
            System.out.println("Объем ЖД: " + notebook.getStorage());
            System.out.println("Операционная система: " + notebook.getOperatingSystem());
            System.out.println("Цвет: " + notebook.getColor());
            System.out.println("--------------------");
        }
    }
}


 */