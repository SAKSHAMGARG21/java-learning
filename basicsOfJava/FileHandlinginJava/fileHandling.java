import java.io.*;

public class fileHandling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a file handling example.");

            bufferedWriter.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try {
        //     FileReader reader = new FileReader("example.txt");
        //     BufferedReader bufferedReader = new BufferedReader(reader);

        //     String line;
        //     while ((line = bufferedReader.readLine()) != null) {
        //         System.out.println(line);
        //     }

        //     bufferedReader.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // File file = new File("example.txt");

        // if (file.exists()) {
        //     System.out.println("File exists.");
        // } else {
        //     System.out.println("File does not exist.");
        // }

        // File file = new File("example.txt");

        // if (file.delete()) {
        //     System.out.println("File deleted successfully.");
        // } else {
        //     System.out.println("Failed to delete the file.");
        // }
    }
}