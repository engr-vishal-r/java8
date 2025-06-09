package functionalInterfaceExp;

import java.util.List;
import java.util.function.Consumer;

class EmployeeServiceConsumer {
    public static void main(String[] args) {
        List<EmployeeConsumer> lstEmp = EmployeeConsumer.getEmpList();
 
        System.out.println("***** Generating HR Report *****");
        generateReport(lstEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole() + " : " + e.getSal()));
 
        System.out.println("\n***** Generating Manager Report *****");
        generateReport(lstEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole()));
    }
 
    public static void generateReport(List<EmployeeConsumer> lstEmp, Consumer<EmployeeConsumer> consumer) {
        for (EmployeeConsumer e : lstEmp) {
            consumer.accept(e);
        }
    }
}
