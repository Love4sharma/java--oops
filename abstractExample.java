abstract class super1 {
    public super1 (){
        System.out.println("super constructor"); 
    }

    public void meth1(){
        System.out.println("meth1 of super class"); 
    }

    abstract public void meth2();

    
}

class sub extends super1 {
    public void meth2(){
        System.out.println("sub meth2"); 
    } 

    public void meth3(){
        System.out.println("sub meth3"); 
    }
}


public class abstractExample {
    public static void main(String[] args) {  
        super1 s=new sub(); 
        s.meth1();
        s.meth2();
        ((sub) s).meth3(); // add casting to meth3 method of sub class method 
    }
}
