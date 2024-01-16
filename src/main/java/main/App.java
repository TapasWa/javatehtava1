package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hedgehog siili = new Hedgehog();
        boolean exit = false;

        while (!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                String strinInput = sc.nextLine();
                i = Integer.parseInt(strinInput);

                switch (i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String puhu = sc.nextLine();
                        if (puhu.isEmpty()) {
                            siili.esita();
                        } else {
                            siili.speak(puhu);
                        }
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        siili = new Hedgehog(name, age);
                        break;
                    case 3:
                        int kierrosta = 0;
                        System.out.println("Kuinka monta kierrosta?");
                        try {
                            String kierros = sc.nextLine();
                            kierrosta = Integer.parseInt(kierros);
                            siili.juoksee(kierrosta);
                        } catch (NumberFormatException e) {
                            System.out.println("Syöte ei ole kelvollinen numero.");
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }

        sc.close();
    }
}
