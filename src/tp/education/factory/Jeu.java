package tp.education.factory;

import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        System.out.println("Entrez la vitesse :");
        Scanner s1 = new Scanner(System.in);
        int v=s1.nextInt();
        System.out.printf("Vous avez entrez la vitesse : " + v);

        VoitureFactory factory = new VoitureFactory();
        Voiture voiture=factory.commanderVoiture(v);
        voiture.accelerer();
        s1.close();
    }
}
