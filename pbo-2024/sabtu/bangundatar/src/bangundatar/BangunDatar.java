package bangundatar;
public abstract class BangunDatar {
    Double luas;
    Double keliling;
    
    abstract double luas();
    abstract double keliling();

    public void printLuas() {
        System.out.println("Luas: " + luas());
    }

    public void printKeliling() {
        System.out.println("Keliling: " + keliling());
    }
}

