//SuperClass
class Person {
    private String Nama;
    private String Alamat;
    private int Umur;
    public Person() {
    }
    public Person(String Nama, String Alamat, int Umur){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    public String getNama() {
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public int getUmur() {
        return Umur;
    }
    public void setNama() {
        this.Nama = Nama;
    }
    public void setAlamat() {
        this.Alamat = Alamat;
    }
    public void setUmur() {
        this.Umur = Umur;
    }
    public void infoPerson() {
        System.out.println("\nInfoPerson");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Umurt\t\t: " + getUmur());
    }
}