import java.io.*;

public class TwoTask {
    public static void main(String[] args) {

        String str_2 = fillingFile();
        System.out.println(str_2);

        fileCreate(str_2);
    }
    public static String fillingFile() {
        String word = "TEST";
        StringBuilder str = new StringBuilder(100);
        for (int i = 0; i < 100; i++) {
            str.append(word);
        }
        String secondStr = str.toString();
        return secondStr;
    }

    public static void fileCreate(String text) {
        try (FileWriter writer = new FileWriter("test.txt", false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
        }
    }
}