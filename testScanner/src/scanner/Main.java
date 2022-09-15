package scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Digite seu nome...");
        String name = data.nextLine();
        System.out.println("Digite sua idade...");
        int date = data.nextInt();
        System.out.format("Seu nome é %s e sua idade é %d", name, date);
    }
}
