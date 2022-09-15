package dataOutput;

public class Main {
    public static void main(String[] args) {
        String name = "Pedro";
        float note = 8.4f;

        System.out.println("A Nota de "+name+" é: "+note);
        System.out.print("A Nota de "+name+" é: "+note);
        System.out.printf("\nA nota de %s é: %.3f", name, note);
        System.out.format("\nA nota de %s é: %.2f", name, note);
    }
}
