// neeraj sir codes

// import java.util.*;

// class Student implements Comparable<Student> {
//     int roll;
//     String name;
//     public Student(String name, int roll) {
//         this.name = name;
//         this.roll = roll;
//     }

//     public int compareTo(Student that) {
//         System.out.println(this.name+" "+that.name);
//         System.out.println(this.roll+" "+that.roll);
//         if (this.roll == that.roll) {
//             return this.name.compareTo(that.name);
//         }
//         System.out.println(Integer.compare(this.roll, that.roll));
//         return Integer.compare(this.roll, that.roll);
//     }

//     public String toString() {
//         return " " + name + " " + roll;
//     }
// }

// // class Student{
// //     int roll;
// //     String name;
// //     public Student(String name, int roll) {
// //         this.name = name;
// //         this.roll = roll;
// //     }
// // }

// public class LearnComparable {
//     public static void main(String[] args) {
//         Student s1 = new Student("Neeraj", 3);
//         Student s2 = new Student("Rahul", 2);
//         Student s4 = new Student("Akash", 2);
//         Student s3 = new Student("Rohit", 1);
//         List<Student> students = new ArrayList<Student>();
//         students.add(s1);
//         students.add(s2);
//         students.add(s4);
//         students.add(s3);
//         Collections.sort(students);
//         for(Student s:students){
//             System.out.println(s.roll+" "+s.name);
//         }
//         // System.out.println(students);
//     }
// }

 
package Collections; 

 

import java.util.*; 

 

//class MyComparator implements Comparator<Student> { 

// 

//    @Override 

//    public int compare(Student o1, Student o2) { 

//        return o1.roll - o2.roll; 

//    } 

//} 

 

class Student { 

    int roll; 

    String name; 

 

    public Student(String name, int roll) { 

        this.name = name; 

        this.roll = roll; 

    } 

 

    @Override 

    public String toString() { 

        return " " + name + " " + roll + "\n"; 

    } 

} 
public class LearnComparable { 

    public static void main(String[] args) { 

        Student s1 = new Student("Neeraj", 2); 

        Student s2 = new Student("Rahul", 1); 

        Student s3 = new Student("Rohit", 7); 

        Student s4 = new Student("Akash", 4); 

 

        List<Student> students = new ArrayList<Student>(); 

        students.add(s1); 

        students.add(s2); 

        students.add(s3); 

        students.add(s4); 

        Collections.sort(students, new Comparator<Student>() { 

            @Override 

            public int compare(Student o1, Student o2) { 

                return o1.roll - o2.roll; 

            } 

        }); 

        System.out.println(students); 

    } 

} 