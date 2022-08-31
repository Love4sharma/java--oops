class student{
    String name;
    int age;
    public student(String name,int age){
        this.name=name;
        this.age=age; 
    }

}
public class arrayOfObjects {
    public static void main(String[] args) {
        student students[]=new student[4]; 
        students[0]=new student("karan", 12);
        students[1]=new student("ram", 14);
        students[2]=new student("shyam", 13);
        students[3]=new student("pavan", 15);

        for(student s:students){
            System.out.println(s); 

        }
        
    }      
}
    

