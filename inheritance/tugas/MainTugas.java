public class MainTugas {
    public static void main(String[] args) {
        Dosen ds = new Dosen();
        ds.setNama("Yocki");
        ds.setSKS(12);

        Pegawai pg = new Pegawai();
        pg.setNama("Febri");

        DaftarGaji df = new DaftarGaji(3);
        df.addPegawai(ds);
        df.addPegawai(pg);
        df.printSemuaGaji();
    }
}
