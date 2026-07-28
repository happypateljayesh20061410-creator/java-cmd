class Thismeathod {
void message() {
System.out.println("Welcome to Java Programming!");
}
void display() {
System.out.println("Calling another method using this keyword..."); 
this.message();
}
public static void main(String[] args) {
Thismeathod Td = new Thismeathod(); 
Td.display();
}
}
