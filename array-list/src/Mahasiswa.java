public class Mahasiswa {
    public String nama, nim, jurusan, tahun_lahir, jenis_kelamin;

    //Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, String tahun_lahir, String jenis_kelamin) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.tahun_lahir = tahun_lahir;
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getUmur() {
        return 2023 - Integer.parseInt(this.tahun_lahir);
    }
}
