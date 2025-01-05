The `StringBuilder` class in Java is part of the `java.lang` package and provides a mutable sequence of characters. It is designed for use in single-threaded contexts where you need to perform many modifications to a string without creating new objects, which makes it more efficient than using the `String` class.

### Key Methods of `StringBuilder`:

1. **append()**: Adds the specified data to the end of the `StringBuilder`.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb); // Output: Hello World
    ```

2. **insert()**: Inserts the specified data at the specified position.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.insert(5, " World");
    System.out.println(sb); // Output: Hello World
    ```

3. **delete()**: Removes characters from the specified start index to the end index.
    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.delete(5, 11);
    System.out.println(sb); // Output: Hello
    ```

4. **replace()**: Replaces characters from the start index to the end index with the specified string.
    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.replace(6, 11, "Java");
    System.out.println(sb); // Output: Hello Java
    ```

5. **reverse()**: Reverses the sequence of characters.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.reverse();
    System.out.println(sb); // Output: olleH
    ```

6. **toString()**: Converts the `StringBuilder` to a `String`.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    String str = sb.toString();
    System.out.println(str); // Output: Hello
    ```

7. **capacity()**: Returns the current capacity of the `StringBuilder`.
    ```java
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity()); // Default capacity is 16
    ```

8. **ensureCapacity()**: Ensures that the capacity is at least equal to the specified minimum.
    ```java
    StringBuilder sb = new StringBuilder();
    sb.ensureCapacity(50);
    System.out.println(sb.capacity()); // Output: 50
    ```

9. **length()**: Returns the length (number of characters) of the `StringBuilder`.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb.length()); // Output: 5
    ```

10. **setLength()**: Sets the length of the `StringBuilder`. If the new length is greater than the current length, null characters (`\0`) are added.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.setLength(10);
    System.out.println(sb.length()); // Output: 10
    ```

11. **charAt()**: Returns the character at the specified index.
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb.charAt(1)); // Output: e
    ```

12. **substring()**: Returns a new `String` that contains a subsequence of characters currently contained in the `StringBuilder`.
    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    String sub = sb.substring(6, 11);
    System.out.println(sub); // Output: World
    ```

### Example Usage:
```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.delete(5, 6);
        sb.reverse();
        System.out.println(sb.toString()); // Output: avaJ olleH
    }
}
```

This example demonstrates the use of several `StringBuilder` methods to manipulate a string efficiently.

Do you have any specific questions or scenarios you'd like to explore further with `StringBuilder`?¹²³

Source: Conversation with Copilot, 20/9/2024
(1) StringBuilder (Java Platform SE 8 ) - Oracle. https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html.
(2) Java StringBuilder: Basics, Methods, Examples, Performance Tips. https://www.javaguides.net/2018/08/java-stringbuilder-class-api-guide.html.
(3) Using the StringBuilder Class in .NET - .NET | Microsoft Learn. https://learn.microsoft.com/en-us/dotnet/standard/base-types/stringbuilder.
(4) StringBuilder (Java Platform SE 8 ) - Oracle. https://docs.oracle.com/javase/8/docs/api/?java/lang/StringBuilder.html.
(5) Java StringBuilder Class - Javatpoint. https://www.javatpoint.com/StringBuilder-class.
(6) Stringbuilder in Java: Constructors, Methods, and Examples - Simplilearn. https://www.simplilearn.com/tutorials/java-tutorial/stringbuilder-in-java.
(7) Java | StringBuilder - Codecademy. https://www.codecademy.com/resources/docs/java/stringbuilder.