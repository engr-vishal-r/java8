package streams;

import java.util.List;
import java.util.stream.Stream;

class EmployeeStreamDemoService
{
    //In the below example different streams are used for sorting and filtering because streams cannot be reused
    public static void main (String[] args) {
        List<EmployeeStreamDemo> lstEmp = EmployeeStreamDemo.getEmployeeStreamDemoList();
        //Converting a List into Stream
        Stream<EmployeeStreamDemo> empStream = lstEmp.stream();
        //Printing the stream
        System.out.println("*****Printing the stream*****");
        empStream.forEach(System.out::println);
        Stream<EmployeeStreamDemo> empStream_filter = lstEmp.stream();
        //Filtering based on EmployeeStreamDemo's time in the organization
        System.out.println("*****Filtering the stream*****");
        Stream<EmployeeStreamDemo> filterEmpStream = empStream_filter.filter(emp -> emp.getYearsInOrg() < 1);
        filterEmpStream.forEach(System.out::println);
        Stream<EmployeeStreamDemo> empStream_sort = lstEmp.stream();
        System.out.println("*****Sorting the stream*****");
        //Sorting based on EmployeeStreamDemo ID
        Stream<EmployeeStreamDemo> sortedEmpStream = empStream_sort.sorted((e1, e2) -> e1.getId() - e2.getId());
        sortedEmpStream.forEach(System.out::println);
        Stream<EmployeeStreamDemo> empStream_pipeline = lstEmp.stream();
        //Pipelining all the streams into one
        System.out.println("*****Piplelining all the functionalities*****");
        empStream_pipeline.filter(emp -> emp.getYearsInOrg() < 1)
        .sorted((e1, e2) -> e1.getId() - e2.getId())
        .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
    }
}
