package singleton_pattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Singleton singletonObject = Singleton.getInstance();
        singletonObject.simpleMethod();

        Singleton singletonObject2 = Singleton.getInstance();
        singletonObject2.simpleMethod();

        try{
            File file = new File("C:\\Users\\mustafabeylimm\\filename.txt");
            //if (file.createNewFile()){
            //    System.out.println("Created" + file.getName());
           // }else{
           //     System.out.println("File already exists");
           // }

            //FileWriter writer = new FileWriter("C:\\Users\\mustafabeylimm\\filename.txt");
            //writer.write("Write function is okay");
            //writer.write("Write function is okay2");
            //writer.close();
            //System.out.println("Successfully wrote to the file");

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.length());
            }
            scanner.close();
        }
        catch(IOException ex){
            System.out.println("AN error occurred");
            ex.printStackTrace();
        }

    }
}
