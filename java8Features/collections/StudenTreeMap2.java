package collections;

import java.util.Map;
import java.util.TreeMap;

public class StudenTreeMap2 {
    public static void main(String[] args) {
        // Create a TreeMap to store roll number as the key and grade as the value
        TreeMap<String, String> gradeMap = new TreeMap<>();

        // Create instances of Student and calculate their grades
        StudenTreeMap1 student1 = new StudenTreeMap1("101", "Alice", 75);
        StudenTreeMap1 student2 = new StudenTreeMap1("103", "Bob", 55);
        StudenTreeMap1 student3 = new StudenTreeMap1("102", "Charlie", 35);

        // Add students to the TreeMap
        gradeMap.put(student1.getRollNumber(), student1.calculateGrade());
        gradeMap.put(student2.getRollNumber(), student2.calculateGrade());
        gradeMap.put(student3.getRollNumber(), student3.calculateGrade());
        
        //print the treemap using foreach method
       gradeMap.forEach((k, v) ->{ System.out.println("Roll Number: " + k + ", Grade: " + v);});

        // Print the TreeMap containing roll numbers and grades
        for (Map.Entry<String, String> entry : gradeMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
