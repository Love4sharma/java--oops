class supermethod{
    public void display(int x){
        System.out.println("this is a super class with value of x :" + x );
    }

} 

class submethod1 extends supermMth1{
    public void display(int y){
        System.out.println("this is a sub class with value of y : "+ y); 

    }   
}

public class overridewithconstructor { 
    public static void main(String [] args){
        submethod1 sup=new submethod1();
        sup.display(12); 

        submethod1 sub = new submethod1();
        sub.display(10);
    }
    
}
