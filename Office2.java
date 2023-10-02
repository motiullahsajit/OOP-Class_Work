public class Office2 {
    public static void main(String[] args){
        Employee2 employee = new Employee2();
        employee.setName("Sajit");
        employee.setId(663);
        employee.setSalary(100000000.99);

        System.out.println("Id: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
