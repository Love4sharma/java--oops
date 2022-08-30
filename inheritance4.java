class phone{
    public void call(){
        System.out.println("call the people"); 
    }
}

class samartphone extends phone{
    public void videoCall(){
        System.out.println("do videocall to talk"); 
    }
}


public class inheritance4 { 
    public static void main(String[] args) {
        samartphone sp=new samartphone(); 
        System.out.println(sp); 
    }
    
}
