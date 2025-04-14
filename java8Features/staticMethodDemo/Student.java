package staticMethodDemo;

public class Student {
	 private int studentId;
	    private String studentName;
	    private String snack;
	    private static int count=1000;
	    
	    /**
	     * Static method can access only static variables
	     * Non-static method can access both static and non statc variables
	     */
	    
	    public Student(){
	        studentId=++count;
	    }
	    public static int getCountValue() {
	    	//System.out.println(studentId);  //can't access non-static variables inside static method
	    	return count;
	    }
	    public void testStatic() {
	    	System.out.println(count);
	    }
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

	    
	}

