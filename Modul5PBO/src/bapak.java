public class bapak extends kakek{
    protected String namabapak;
    protected String addressbapak;
    public bapak() {
        System.out.println("Nama Kakek : " + namekakek);
        System.out.println("Address kakek : " + address);
        System.out.println("\n");
        System.out.println("Masukan Construktor Bapak");
        System.out.println("--dijalankan class cucu--");
        namabapak = "ROHAEDI";
        addressbapak = "KUNINGAN";
    }
    public bapak(String namabapak, String addressbapak) {
        this.namabapak = namabapak;
        this.addressbapak = addressbapak;
    }
    public String getNama() {
        return namabapak;
    }
    public String getAddress() {
        return addressbapak;
    }
    public static void main(String[] args) {
        bapak sari = new bapak();
    }
}
