package bangundatar;
public abstract class BangunDatar {
    private String name;

    public abstract double luas();
    public abstract double keliling();

    public void getInfo() {

        System.out.println("Bangun datar "+name);
        System.out.println("Luas: "+luas());
        System.out.println("Keliling: "+keliling());
    }

    private void setName(String name) {
        this.name = name;
    }

    protected BangunDatar(String name) {
        this.setName(name);
    }
}
