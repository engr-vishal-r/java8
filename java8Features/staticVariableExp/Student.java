package staticVariableExp;

public class Student {
    /**
     * Static keyword can be used with variable, method and block
     * Major usage of static keyword is to count the objects of the class and to auto generate the values
     * static is common property for all the objects. Static variable is loaded at the time of class creation
     */

    private int studentId;
    private String studentName;
    private String snack;
    private static int count=1000;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student(){
        count++;
        studentId=count;
    }
}
