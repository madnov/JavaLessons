package HomeWork_6;

//  * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
//  * методы. Реализовать в java.
//  * Создать множество ноутбуков.
//  * Написать метод, который будет запрашивать у пользователя критерий фильтрации
//  * и выведет ноутбуки, отвечающие фильтру.

public class Laptop {
    private String brand;
    private String model;
    private String OS;
    private int ram;
    private int storage;



    /**Конструктор */ 
    public Laptop(String brand, String model, String OS, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.ram = ram;
        this.storage = storage;
    }

    /**Геттеры и сеттеры для полей */ 

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**Переопределение метода toString() для удобного вывода информации о ноутбуке */ 
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", OS=" + OS +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}


