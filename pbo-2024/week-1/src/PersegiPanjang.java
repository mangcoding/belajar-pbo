public class PersegiPanjang {
    //Properties, or fields or attributes, or instance variables, state
    private Double panjang;
    private Double lebar;

    //Constructor
    public PersegiPanjang(Double panjang, Double lebar) {
        this.setProperty(panjang, lebar);
    }
    
    //Methods, or functions, or procedures, or subroutines, or behaviors
    public void setProperty(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    public void hitungLuas() {
        System.out.println(panjang * lebar);
    }


    public Double getLuas() {
        return panjang * lebar;
    }
}