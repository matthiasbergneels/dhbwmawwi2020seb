package lecture;

import java.io.File;

public class FileSystemExample {

    public static void main(String[] args) {

        File[] rootList = File.listRoots();

        for(File root : rootList){
            System.out.println("Pfad: " + root.getPath());
            System.out.println("- existiert: " + root.exists());
            System.out.println("- Lesezugriff: " + root.canRead());
            System.out.println("- Schreibzugriff: " + root.canWrite());

            System.out.println("- ist Verzeichnis: " + root.isDirectory());
        }





    }
}
