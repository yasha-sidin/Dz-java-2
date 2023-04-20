package Homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Task2 Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
public class Task2 {
    public static void main(String[] args) {
        checkFiles("C:\\Users\\yasha\\OneDrive\\Рабочий стол\\GB\\Специализация Программист\\Знакомство c Java\\Семинары\\Семинар 1\\java-project-2023-04-13");
    }

    private static void checkFiles(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < file.list().length; i++) {
            sb.append((i + 1) + " Расширение файла: " + getFileExtentions(file.list()[i]) + "\n");
        }
        System.out.println(sb);

    }
    private static String getFileExtentions(String name) {
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf);
    }

}
