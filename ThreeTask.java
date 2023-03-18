import java.io.*;

public class ThreeTask {
    public static void main(String[] args) {
        String str = ".";
        String temp = "";
        String currPathname = System.getProperty("user.dir");
        File currDir = new File(currPathname);
        File[] files = currDir.listFiles();
        String[] extensions = new String[files.length];
        for (int i = 0; i < 2; i++) {
            temp = files[i].toString();
            extensions[i] = temp.substring(temp.indexOf(str));
            System.out.println(i + 1 + ". " + "Расширение файла:" + "'" + extensions[i] + "'");
        }
    }
}