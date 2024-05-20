public class Siswa {
    public String name;
    public String birthPlace;
    public String birthDate; //yyyy-mm-dd
    public String phoneNumber;
    public String city; //Sukabumi, Bogor, Bandung, Jakarta

    public Siswa(String name, String birthPlace, String birthDate, String phoneNumber, String city) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public int getBirthYear() {
        return Integer.parseInt(this.birthDate.substring(0, 4));
    }

    public int getAge() {
        return 2023 - this.getBirthYear();
    }
}
