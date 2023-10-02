public class Employee2 {
    private int e_id;
    private String e_name;
    private double salary;

    public void setName(String e_name){
        this.e_name = e_name;
    }

    public void setId(int e_id){
        this.e_id = e_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return e_id;
    }

    public String getName(){
        return e_name;
    }

    public double getSalary() {
        return salary;
    }


}
