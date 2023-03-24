public class Mahasiswa {
    public String name;
    public String nim;
    public String jurusan;
    public double ipk;
    public String keterangan;

    public Mahasiswa(String name, String nim, String jurusan, double ipk) {
        this.name = name.length() < 8 ? name+"\t" : name;
        this.nim = nim.length() < 8 ? nim+"\t" : nim;
        this.jurusan = jurusan.length() < 8 ? jurusan+"\t\t" : (jurusan.length() < 16 ? jurusan+"\t" : jurusan);
        this.ipk = ipk;
        if (ipk >= 4.0) {
            this.keterangan = "Summa Cumlaude";
        } else if (ipk >= 3.5) {
            this.keterangan = "Cumlaude";
        } else if (ipk >= 2.5) {
            this.keterangan = "Lulus";
        } else {
            this.keterangan = "Tidak Lulus";
        }
    }
}
