class Oddeven{
    int a;
    Oddeven(){
        a=15;
    }
}
public class Main{
    public static void main(String[] args){
        Oddeven oe1 = new Oddeven();
        
        if(oe1.a % 2 == 0){
            System.out.println("a.oe1 is even number " + oe1.a);
        }
        else{
             System.out.println("a.oe1 is odd number " + oe1.a);
        }
    }
}
