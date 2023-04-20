import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task5 {
    public static void main(String[] args) {
       ex5("C:\\Users\\yasha\\OneDrive\\Рабочий стол\\GB\\Специализация Программист\\Знакомство c Java\\Семинары\\Семинар 2");
    }

    private static void ex5(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()) {
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);

        try (PrintWriter pw = new PrintWriter("src/main/resources/filesNames.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
