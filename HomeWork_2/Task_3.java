package HomeWork_2;

import java.io.FileReader;

//  Дана строка (сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task_3 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("HomeWork_2\\task_3.txt");

            char[] arr = new char[500];
            fileReader.read(arr);
            String str = "";
            for (char c : arr) {
                str += c;
            }
            fileReader.close();
            System.out.println(stringParse(str));
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static String stringParse(String str) {

        str = str.replace("]", "");
        str = str.replace("[", "");
        str = str.replaceAll("[{}\":]", "");
        str = str.replaceAll("фамилия", " Cтудент ");
        str = str.replaceAll("оценка", " получил(a) ");
        str = str.replaceAll("предмет", " по предмету ");

        String[] splitString = str.split(",");

        StringBuilder students = new StringBuilder();
        int count = 0;
        for (int i = 0; i < splitString.length / 3; i++) {
            students.append(splitString[count]).append(splitString[count + 1]).append(splitString[count + 2])
                    .append("\n");
            count += 3;
        }
        return students.toString();

    }

}
