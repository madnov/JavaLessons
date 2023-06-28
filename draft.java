import HomeWork_6.NoteBook;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет ноутбуки, отвечающие фильтру.
 * NoteBook notebook1 = new NoteBook
 * NoteBook notebook2 = new NoteBook
 * NoteBook notebook3 = new NoteBook
 * NoteBook notebook4 = new NoteBook
 * NoteBook notebook5 = new NoteBook
 * 
 * Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД hd hdd
 * 3 - Операционная система
 * 4 - Цвет
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * 
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 * 
 * Класс сделать в отдельном файле
 * 
 * приветствие
 * Выбор параметра
 * выбор конкретнее
 * вывод подходящих
 */
public class draft {
    int RAM;
    int HDD;
    String OS;
    String color;

    public String getColor() {
        return color;
    }

    public int getHDD() {
        return HDD;
    }

    public String getOS() {
        return OS;
    }

    public int getRAM() {
        return RAM;
    }

    @Override
    public String toString() {
        String res = String.format("RAM: %d HDD: %d OS: %s Color: %s", RAM, HDD, OS, color);
        return res;
    }
}
