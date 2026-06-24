In Java, `String.split()` takes a **regular expression (regex)** as its argument, so depending on your input format, you can use different regex patterns to split a string into parts.

Here’s a list of **common split regex patterns** with examples:

---

### **1. Split by spaces**

```java
String s = "2 3 1 1 4";
String[] parts = s.split(" "); // single space
// or split("\\s+") for one or more spaces
```

**Regex:**

* `" "` → exact one space
* `"\\s+"` → any whitespace (space, tab, multiple spaces)

---

### **2. Split by comma**

```java
String s = "2,3,1,1,4";
String[] parts = s.split(","); // simple comma
// or split("\\s*,\\s*") for comma with optional spaces
```

**Regex:**

* `","` → exact comma
* `"\\s*,\\s*"` → comma with optional spaces around

---

### **3. Split by both comma and space**

```java
String s = "2, 3 1,4";
String[] parts = s.split("[, ]+"); // one or more comma or space
```

**Regex:**

* `[,]` → match a comma
* `[ ,]+` → match space or comma, one or more times

---

### **4. Split by any non-digit**

```java
String s = "[2, 3, 1, 1, 4]";
String[] parts = s.split("\\D+"); // split on non-digits
```

**Regex:**

* `"\\D+"` → one or more non-digit characters (removes `[`, `]`, and `,`)

---

### **5. Split by multiple delimiters**

```java
String s = "2;3|1,4 5";
String[] parts = s.split("[;|, ]+"); // split on ; or | or , or space
```

**Regex:**

* `[;|, ]+` → matches any of `;` `|` `,` or space, one or more times

---

### **6. Split with limit**

```java
String s = "2 3 1 1 4";
String[] parts = s.split(" ", 3); 
// limit = 3 → max 3 parts, last part contains rest of string
```

---

✅ **For your case** (`[2, 3, 1, 1, 4]`), the cleanest split is:

```java
String[] parts = input.replaceAll("\\[|\\]", "").split("\\s*,\\s*");
```

This removes brackets and splits on commas with optional spaces.

---

If you want, I can make a **Java demo program** printing how each of these split regex patterns works on the same input so you see the differences.
