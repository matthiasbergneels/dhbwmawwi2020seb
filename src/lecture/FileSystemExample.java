package lecture;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class FileSystemExample {

    public static void main(String[] args) {

        System.out.println("Liste von Laufwerken / root Verzeichnis: ");
        System.out.println("=========================================");
        File[] rootList = File.listRoots();

        for(File root : rootList){
            System.out.println("Pfad: " + root.getPath());
            System.out.println("- existiert: " + root.exists());
            System.out.println("- Lesezugriff: " + root.canRead());
            System.out.println("- Schreibzugriff: " + root.canWrite());
            System.out.println("- ist Verzeichnis: " + root.isDirectory());
        }


        System.out.println("System Properties in Java: ");
        System.out.println("=========================================");
        Properties systemProperties = System.getProperties();

        Set systemPropertiesKeys = systemProperties.keySet();
        for(Object key : systemPropertiesKeys){
            System.out.println(key + ": " + systemProperties.get(key));
        }


        System.out.println("Ausgabe von allen Inhalten aus user.dir: ");
        System.out.println("=========================================");


        File userDir = new File(System.getProperty("user.dir"));

        System.out.println("Name: " + userDir.getName());
        System.out.println("Pfad: " + userDir.getPath());
        System.out.println("Existiert: " + userDir.exists());
        System.out.println("Ist Verzechnis: " + userDir.isDirectory());
        System.out.println("Ist Datei: " + userDir.isFile());
        System.out.println("Berechtigungen:  " + (userDir.canRead() ? "r" : "-") + " / " + (userDir.canWrite() ? "w" : "-"));

        System.out.println("Inhalt von " + userDir.getName() + ":");
        System.out.println("=====================================");
        listDirectoryAndContent(userDir, 0);


        System.out.println("Umgang mit Verzeichnissen und Dateien");
        System.out.println("=====================================");

        File myDirectory = new File(System.getProperty("user.dir") + File.separator + "myDirectory");
        File myRenamedDirectory = new File(System.getProperty("user.dir") + File.separator + "myRenamedDirectory");

        System.out.println("myDirectory existiert? " + myDirectory.exists());

        // Verzeichnis anlegen
        if(!myDirectory.exists()){
            System.out.println("Verzeichnis anlegen");
            myDirectory.mkdir();
            System.out.println("Verzeichnis " + myDirectory.getPath() + " angelegt.");
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }

        // Verzeichnis umbenennen
        if(myDirectory.exists() && !myRenamedDirectory.exists()){
            System.out.println("Verzeichnis umbenennen");
            myDirectory.renameTo(myRenamedDirectory);
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }


        File myFile = new File(myRenamedDirectory.getPath() + File.separator + "myFile.txt");
        File myRenamedFile = new File(myRenamedDirectory.getPath() + File.separator + "myRenamedFile.txt");

        // Datei anlegen
        if(!myFile.exists()){
            System.out.println("Datei anlegen");
            try {
                myFile.createNewFile();
                System.out.println(myFile.getPath() + ": " + myFile.exists());
                System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
            }catch (IOException e){
                System.out.println("Datei anlegen hat nicht funktioniert.");
            }
        }

        // Datei umbenennen
        if(myFile.exists() && !myRenamedFile.exists()){
            System.out.println("Datei umbenennen");
            myFile.renameTo(myRenamedFile);
            System.out.println(myFile.getPath() + ": " + myFile.exists());
            System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
        }

        // Datei löschen
        if(myRenamedFile.exists()){
            System.out.println("Datei löschen");
            myRenamedFile.delete();
            System.out.println(myFile.getPath() + ": " + myFile.exists());
            System.out.println(myRenamedFile.getPath() + ": " + myRenamedFile.exists());
        }

        // Verzeichnis löschen
        if(myRenamedDirectory.exists()){
            System.out.println("Verzeichnis löschen");
            myRenamedDirectory.delete();
            System.out.println(myDirectory.getPath() + ": " + myDirectory.exists());
            System.out.println(myRenamedDirectory.getPath() + ": " + myRenamedDirectory.exists());
        }
    }


    private static void listDirectoryAndContent(File currentDirectory, int indentation){
        printlnWithIndentation("+" + currentDirectory.getName() +" - "
                + (currentDirectory.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                +(currentDirectory.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff"), indentation );

        File[] currentDirectoryContent = currentDirectory.listFiles();
        for(File currentFile : currentDirectoryContent){
            if(currentFile.isDirectory()){
                listDirectoryAndContent(currentFile, indentation+1);
            }else if(currentFile.isFile()){
                printlnWithIndentation("-" + currentFile.getName()
                        + " - "+ (currentFile.canRead() ? "Lesezugriff" : "Kein Lesezugriff") + "; "
                        +(currentFile.canWrite() ? "Schreibzugriff" : "Kein Schreibzugriff") + "; "
                        + currentFile.length() + " Byte", indentation+1 );
            }
        }

    }

    private static void printlnWithIndentation(String txt, int indentation){
        String indentationText = "";
        for(int i = 0; i < indentation; i++){
            indentationText += "\t";
        }

        System.out.println(indentationText + txt);
    }
}
