package mid_sem;
import java.util.*;

public class Attendanceapp {
    private int regNo;
    private String name;
    private int classesAttended;
    
    private static int totalClasses;
    
    public Attendanceapp(int regNo, String name, int classesAttended) {
        this.regNo = regNo;
        this.name = name;
        this.classesAttended = classesAttended;
    }
    
    public static void setTotalClasses(int totalClasses) {
        Attendanceapp.totalClasses = totalClasses;
    }
    
    public double calculatePercentage() {
        return (double) classesAttended / totalClasses * 100;
    }
    
    public static void main(String[] args) {
        setTotalClasses(60); 
        List<Attendanceapp> students = new ArrayList<>();
        students.add(new Attendanceapp(1001, "Anish", 45));
        students.add(new Attendanceapp(1002, "Swayams", 55));
        students.add(new Attendanceapp(1003, "Omkar", 30));
        students.add(new Attendanceapp(1004, "Rahul", 50));
        students.add(new Attendanceapp(1005, "Aryan", 35));
        
        
        Map<Integer, Double> table = new HashMap<>();
        
      
        for (Attendanceapp student : students) {
            double percentage = student.calculatePercentage();
            table.put(student.regNo, percentage);
        }
        
        System.out.println("Registration No.\tPercentage of Attendance");
        for (Map.Entry<Integer, Double> entry : table.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue() + "%");
        }
        
        List<Integer> toRemove = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : table.entrySet()) {
            if (entry.getValue() < 75.0) {
                System.out.println("Student with registration no. " + entry.getKey() + " has attendance less than 75%");
                toRemove.add(entry.getKey());
            }
        }
        
        for (int regNo : toRemove) {
            table.remove(regNo);
        }
        int count = 0;
        for (Map.Entry<Integer, Double> entry : table.entrySet()) {
            if (entry.getValue() >= 75.0) {
                count++;
            }
        }
        System.out.println("Number of students with attendance more than or equals to 75%: " + count);
    }
}
