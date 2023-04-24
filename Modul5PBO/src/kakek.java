public class kakek{
    protected String namekakek;
    protected String address;
    public kakek() {
        System.out.println("\n Program Demo Inheritance");
        System.out.println("=============================");
        System.out.println("   Masukan construktor kakek");
        System.out.println("-Dijalankan oleh subclass Bapak-");
        namekakek = "Joyo Cokro Aminoto";
        address = "Sieman Djojakarta";
    }
    public kakek(String name, String address) {
        this.namekakek = name;
        this.address = address;
    }
    public String getName() {
        return namekakek;
    }
    public String getAddress() {
        return address;
    }
}
