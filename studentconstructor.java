class Thiscon {

    Thiscon() {
        this(101, "Izna");
        System.out.println("Default Constructor Executed");
    }

    Thiscon(int id, String name) {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Thiscon Ts = new Thiscon();
    }
}
