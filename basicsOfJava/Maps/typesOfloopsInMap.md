In Java, **maps** (like `HashMap`, `TreeMap`, `LinkedHashMap`, etc.) can be looped over in several ways, depending on what part of the map you want to access: keys, values, or key-value pairs.

Here are the **types of loops** you can use to iterate through a `Map<K, V>`:

---

### 1. **Using `entrySet()` in a `for-each` loop (Most common)**

```java
for (Map.Entry<K, V> entry : map.entrySet()) {
    K key = entry.getKey();
    V value = entry.getValue();
    System.out.println(key + " = " + value);
}
```

---

### 2. **Using `keySet()` in a `for-each` loop**

```java
for (K key : map.keySet()) {
    V value = map.get(key);
    System.out.println(key + " = " + value);
}
```

---

### 3. **Using `values()` in a `for-each` loop (values only)**

```java
for (V value : map.values()) {
    System.out.println("Value = " + value);
}
```

---

### 4. **Using `Iterator` with `entrySet()`**

```java
Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<K, V> entry = iterator.next();
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

---

### 5. **Using `forEach()` with Lambda (Java 8+)**

```java
map.forEach((key, value) -> {
    System.out.println(key + " = " + value);
});
```

---

### 6. **Using `Streams` API (Java 8+)**

```java
map.entrySet().stream().forEach(entry ->
    System.out.println(entry.getKey() + " = " + entry.getValue())
);
```

---

Let me know if you want a comparison of efficiency or use-case best practices.
