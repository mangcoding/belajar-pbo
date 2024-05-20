public class TestArray {
    public static void main(String[] args) {
        String nama[] = new String[1];
        nama[0] = "Rizky";
        
        String namabaru[] = new String[2];

        for (int i = 0; i < nama.length; i++) {
            namabaru[i] = nama[i];
        }
        namabaru[1] = "Eko";
    }
}
