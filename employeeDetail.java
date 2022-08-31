class employee{
    String name;
    int salary;
    public employee(String name,int salary){
        this.name=name;
        this.salary=salary; 
    }
}



public class employeeDetail {
    public static void main(String[] args) { 
        employee employees[]=new employee[5]; 
        employees[0]=new employee("karan", 20000);
        employees[1]=new employee("ram", 25000);
        employees[2]=new employee("shyam", 30000);
        employees[3]=new employee("pavan",40000);
        employees[4]=new employee("pan sigh tomat",55000);

        for(employee e:employees){
            System.out.println(e); 
        }
    }
}
