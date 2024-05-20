public class Student<T,U> {
    String name;
    T age;
    String address;
    U birthYear;

    public Student(String name, T age, String address, U birthYear) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthYear = birthYear;
    }

    public String getInfo() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address + "\nBirth Year: " + birthYear;
    }
}


