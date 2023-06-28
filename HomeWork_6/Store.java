package HomeWork_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Store {
    private Set<Laptop> laptops;

    /** Конструктор */
    public Store() {
        laptops = new HashSet<>();
    }

    /** Метод для добавления ноутбука в магазин */
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    /** Метод для фильтрации и вывода ноутбуков по заданному критерию */
    public void filterLaptops() {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println(
                "Введите критерий фильтрации (бренд, модель(процессора), ос(операционная система), оп(оперативная память), объем(памяти)):");
        String filter = sc.nextLine();

        if (filter.equals("бренд")) {
            System.out.print("Введите название бренда: ");
            String brandName = sc.nextLine();
            for (Laptop laptop : laptops) {
                if (laptop.getBrand().equalsIgnoreCase(brandName)) {
                    System.out
                            .println("бренд - " + laptop.getBrand() + "; " + "модель процессора - " + laptop.getModel()
                                    + "; " + "операционная система - " + laptop.getOS() + "; " + "оперативная память - "
                                    + laptop.getRam() + "; "
                                    + "объём памяти - " + laptop.getStorage());
                }
            }
        } else if (filter.equals("модель")) {
            System.out.print("Введите название модели процессора: ");
            String modelName = sc.nextLine();
            for (Laptop laptop : laptops) {
                if (laptop.getModel().equalsIgnoreCase(modelName)) {
                    System.out
                            .println("бренд - " + laptop.getBrand() + "; " + "модель процессора - " + laptop.getModel()
                                    + "; " + "операционная система - " + laptop.getOS() + "; " + "оперативная память - "
                                    + laptop.getRam() + "; "
                                    + "объём памяти - " + laptop.getStorage());
                }
            }
        } else if (filter.equals("ос")) {
            System.out.print("Введите название операционной системы: ");
            String OSName = sc.nextLine();
            for (Laptop laptop : laptops) {
                if (laptop.getOS().equalsIgnoreCase(OSName)) {
                    System.out
                            .println("бренд - " + laptop.getBrand() + "; " + "модель процессора - " + laptop.getModel()
                                    + "; " + "операционная система - " + laptop.getOS() + "; " + "оперативная память - "
                                    + laptop.getRam() + "; "
                                    + "объём памяти - " + laptop.getStorage());
                }
            }
        } else if (filter.equals("оп")) {
            System.out.print("Введите количество оперативной памяти: ");
            int ram = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getRam() == ram) {
                    System.out
                            .println("бренд - " + laptop.getBrand() + "; " + "модель процессора - " + laptop.getModel()
                                    + "; " + "операционная система - " + laptop.getOS() + "; " + "оперативная память - "
                                    + laptop.getRam() + "; "
                                    + "объём памяти - " + laptop.getStorage());
                }
            }
        } else if (filter.equals("оп")) {
            System.out.print("Введите объем жесткого диска: ");
            int storage = sc.nextInt();
            for (Laptop laptop : laptops) {
                if (laptop.getStorage() == storage) {
                    System.out
                            .println("бренд - " + laptop.getBrand() + "; " + "модель процессора - " + laptop.getModel()
                                    + "; " + "операционная система - " + laptop.getOS() + "; " + "оперативная память - "
                                    + laptop.getRam() + "; "
                                    + "объём памяти - " + laptop.getStorage());
                }

            }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        Laptop laptop1 = new Laptop("HP", "Intel", "Windows", 8, 512);
        Laptop laptop2 = new Laptop("MacBook", "Apple", "macOS", 16, 1024);
        Laptop laptop3 = new Laptop("Lenovo", "Intel", "Windows", 32, 512);
        Laptop laptop4 = new Laptop("Asus", "AMD", "Windows", 16, 512);
        Laptop laptop5 = new Laptop("Lenovo", "Intel", "Linux", 8, 256);

        store.addLaptop(laptop1);
        store.addLaptop(laptop2);
        store.addLaptop(laptop3);
        store.addLaptop(laptop4);
        store.addLaptop(laptop5);

        store.filterLaptops();
    }
}

