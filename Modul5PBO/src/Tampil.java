class Tampil{
    public static void main(String[] args) {
        Person a = new Person("Rere", "Cijoho", 29);
        a.infoPerson();
        Dosen b = new Dosen("Gugun", "Kunigan", 45, "17.05.05");
        b.infoDosen();
        Mahasiswa c =  new Mahasiswa("Ina", "Lebakwangi", 17, "13.11.7066");
        c.infoMahasiswa();
        System.out.println("---------------------------------------");
    }
}
