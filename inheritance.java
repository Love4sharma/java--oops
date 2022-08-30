class circle{
    int radius;
    public double area(){
        return Math.PI*4*radius; 
    }
} 

class cylinder extends circle{
    int height; 
    public double volume(){
        return area()*height; 
    }
}


public class inheritance {  
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.radius=5;
        c.height=10;
        System.out.println(c.volume()); 
        System.out.println(c.area());

    }
    
}
