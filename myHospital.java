abstract class hospital{
    abstract void emergency(); 
    abstract void appointment(); 
    abstract void admit(); 
    abstract void billing();     
}

class myHospital1 extends hospital {

    @Override
    void emergency() {
        System.out.println("24 hours emergency available"); 
        
    }

    @Override
    void appointment() {
        System.out.println("appointment can be done online"); 
        
    }

    @Override
    void admit() {
        System.out.println("please admit the patient"); 
        
    }

    @Override
    void billing() {
        System.out.println("billing can be done using paytm"); 
        
    }

}

public class myHospital {
    
    public static void main(String[] args) { 
        hospital h=new myHospital1(); 
        h.emergency(); 
        extracted(h);
        h.admit(); 
        h.billing(); 
         
    }

    private static void extracted(hospital h) {
        h.appointment();
    }      
}
