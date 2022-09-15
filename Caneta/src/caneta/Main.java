package caneta;

public class Main {
    public static void main(String args[]) {
        Caneta caneta1 = new Caneta("Azul","Brooksfield", 0.5f, 90, true);
        Caneta caneta2 = new Caneta("Preta", "BIC", 4.0f, 100, false);
        caneta2.setModelo("Mookks");
    }
}