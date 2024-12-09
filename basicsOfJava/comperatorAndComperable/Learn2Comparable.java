import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

// class Student implements Comparable<Student> {
//     String name;
//     int age;

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public int compareTo(Student s2) {
//         if (this.age == s2.age) {
//             return this.name.compareTo(s2.name);
//         }
//         return Integer.compare(this.age, s2.age); // increasing order
//         // return Integer.compare(s2.age, this.age); // descreasing order
//     }

//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     }
// }

public class Learn2Comparable {
    public static void main(String[] args) {

        // Comparator<Student> comparator = (i, j) -> i.age - j.age; // increasing order
        // // lambda expression
        // Comparator<Student> comparator = (i, j) -> j.age - i.age; // decreasing order // lambda expression

        List<Student> nums = new ArrayList<>();
        nums.add(new Student("Rohit", 15));
        nums.add(new Student("Loki", 21));
        nums.add(new Student("Sam", 36));
        nums.add(new Student("Tony", 63));
        nums.add(new Student("Thor", 54));

        Collections.sort(nums, (i, j) -> j.age - i.age); // lambda in sort function // sort in ascending order

        for (Student s : nums) {
            System.out.println(s);
        }

        // Comparator<Student> comparator = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // List<Student> nums = new ArrayList<>();
        // nums.add(new Student("Rohit", 15));
        // nums.add(new Student("Loki", 21));
        // nums.add(new Student("Sam", 36));
        // nums.add(new Student("Tony", 63));
        // nums.add(new Student("Thor", 54));

        // Collections.sort(nums, comparator);// sort in ascending order

        // for (Student s : nums) {
        // System.out.println(s);
        // }

        // Comparator<Integer> comparator = new Comparator<Integer>(){
        // public int compare(Integer i, Integer j) {
        // if (i % 10 < j % 10) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(15);
        // nums.add(21);
        // nums.add(36);
        // nums.add(63);
        // nums.add(54);

        // Collections.sort(nums,comparator);// sort in ascending order

        // System.out.println(nums);
    }
}
