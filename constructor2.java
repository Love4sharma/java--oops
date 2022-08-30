class parent {
    
    public parent(int x) {

        System.out.println("this is a parameterised constructor x : ");

    }
}

class child extends parent {

    public child(int y) {

        System.out.println("this is a parameterised child class y : ");
    }
}

public class constructor2 {
    public static void main(String[] args) {
        parent sup = new parent(25);
        child sub = new child(54);

    }
}
