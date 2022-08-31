class rectangle{
    private double length; 
    private double breadth;
    public double getlength(){ 
        return breadth;
        
    }

    public void setlength(double l){
        if(l>0){
            length=l;
        }
        else{
            length=0; 
        }
    }

    public double getbreadth(){
        return breadth; 
    }

    public void setbreadth(double b){
        if(b>0){
            breadth=b; 
        }

        else{
            breadth=0; 
        }
    }
    public double area(){
        return getlength()*getbreadth(); 
    }

    public double perimeter(){ 
        return 2*(getlength()+getbreadth()); 

    }
}


public class dataHidingPractice {
    public static void main(String[] args) { 
        rectangle r=new rectangle();
        r.setlength(10.5);
        r.setbreadth(5.5);
        System.out.println("area is:"+r.area()); 
        System.out.println("perimeter is:"+r.perimeter()); 
        System.out.println(r.getlength());
        System.out.println(r.getbreadth()); 
         
    }
}
