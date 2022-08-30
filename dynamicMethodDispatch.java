class supermMth1{ 
    public void display(){
        System.out.println("this is a super class ");
    }

}

class subclass extends supermMth1{
    public void display(){
        System.out.println("this is created to practice dynamiv method dispatch");

    } 

    public void info(){
        System.out.println("dynamic method is running successfully");

    }
}


public class dynamicMethodDispatch { 
    public static void main(String [] args){ 
        supermMth1 sup = new supermMth1();
        sup.display();

        supermMth1 sub=new subclass();
        sub.display(); 
        // sub.info();==> it can not be called by using sub class if it is using reference of super class 
    }
    
}
