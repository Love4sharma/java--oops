class parent{
    public parent(){ 
        System.out.println("parent class with no parameterised  constructor ");

    }
}

class child extends parent{
    public child(){
        System.out.println("child class with no parameterised construcor ");

    }
}

public class constructor { 
    public static void main(String [] args){
        parent p = new parent();

        child c=new child();
        
    }
    
}
