import java.io.*;

public class FileIOExample {

    public static void main(String[] args) {
        // File class
        File file = new File("example.txt");
        
        // Writing to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(file)) {
            String data = "Hello, world!";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to file using FileOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            System.out.print("Data read from file using FileInputStream: ");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Writing to a file using FileWriter
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello, FileWriter!");
            System.out.println("Data written to file using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading from a file using FileReader
        try (FileReader fr = new FileReader(file)) {
            int content;
            System.out.print("Data read from file using FileReader: ");
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
