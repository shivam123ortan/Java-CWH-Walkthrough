class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Employee shivam = new Employee();
        shivam.salary = 8;
        shivam.setName("GOD");
        System.out.println(shivam.getname());  
        System.out.println(shivam.getSalary());
    }
    
}
