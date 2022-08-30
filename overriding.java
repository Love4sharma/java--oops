class overrideMethod{
    public void display(){
        System.out.println("this is a super class");
    }
}

class overrideSuper extends overrideMethod{
    public void display(){
        System.out.println("this is a sub class");
    }
}

public class overriding{
    public static void main(String [] args){
        overrideMethod m=new overrideMethod();
        m.display();

        overrideSuper sub=new overrideSuper();
        sub.display();

    }
}
     
