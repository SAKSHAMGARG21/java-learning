File handling in Java involves reading from and writing to files, which is essential for many applications. Java provides several classes and methods to handle files, primarily through the `java.io` package. Here are some key concepts and examples:

### Creating and Writing to a File
You can create and write to a file using the `FileWriter` and `BufferedWriter` classes.

#### Example:
```java
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
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
    }
}
```

### Reading from a File
You can read from a file using the `FileReader` and `BufferedReader` classes.

#### Example:
```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Checking if a File Exists
You can check if a file exists using the `File` class.

#### Example:
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
```

### Deleting a File
You can delete a file using the `File` class.

#### Example:
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
```

### Summary
- **Creating and Writing**: Use `FileWriter` and `BufferedWriter`.
- **Reading**: Use `FileReader` and `BufferedReader`.
- **Checking Existence**: Use the `exists()` method of the `File` class.
- **Deleting**: Use the `delete()` method of the `File` class.

These examples cover the basics of file handling in Java. For more detailed information, you can refer to resources like GeeksforGeeks¹ and W3Schools².

Let me know if you have any specific questions or need further assistance!

Source: Conversation with Copilot, 27/9/2024
(1) File Handling in Java - GeeksforGeeks. https://www.geeksforgeeks.org/file-handling-in-java/.
(2) Java Files - W3Schools. https://www.w3schools.com/java/java_files.asp.
(3) What is File Handling in Java? | Working with Java Files and I/O - Edureka. https://www.edureka.co/blog/file-handling-in-java/.
(4) Java File Class: Handling Files and Directories with Ease. https://ioflood.com/blog/java-file-class/.
(5) File Handling in Java - Scaler Topics. https://www.scaler.com/topics/file-handling-in-java/.
(6) github.com. https://github.com/cosmohsueh/JavaSE/tree/38ae3af5e12e4e41cd8374edacc1d27ad29bf0ea/FileIO%2Fsrc%2Fcom%2Fcosmo%2Fio%2FTextFileReadingExample3.java.
(7) Getty Images. https://www.gettyimages.com/detail/photo/java-programming-concept-virtual-machine-on-server-royalty-free-image/1131109259.