class A1{
    void work(){
        System.out.println("Inside class A");
    }
}

class B1 extends A1{

    void work(){
        System.out.println("Inside class B");
    }
}


public class InheritenceB {
    public static void main(String[] args) {
        A1 a = new B1();
        a.work();

        a = new A1();
        
        a.work();
    }
}
