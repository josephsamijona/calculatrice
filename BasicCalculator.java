// Programme Java pour une simple calculatrice

// Importation des bibliothèques nécessaires
import java.io.*;
import java.lang.*;
import java.util.Scanner;

// Définition de la classe BasicCalculator
public class BasicCalculator {

    // Fonction principale
    public static void main(String[] args) {

        // Déclaration des variables pour stocker les inputs
        double num1, num2;

        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner sc = new Scanner(System.in);

        
        

        // Lecture des nombres saisis par l'utilisateur
        System.out.println("Entrez le premier nombre :");
        num1 = sc.nextDouble();
        System.out.println("Entrez le second nombre :");
        num2 = sc.nextDouble();

        // Invite l'utilisateur à entrer l'opérateur (+, -, *, /)
        System.out.println("Entrez l'opérateur (+, -, *, /) :");

        // Lecture du premier caractère saisi par l'utilisateur pour représenter l'opérateur
        char op = sc.next().charAt(0);

        // Initialisation de la variable pour stocker le résultat
        double o = 0;

        // Utilisation d'une structure de contrôle switch pour effectuer l'opération appropriée
        switch (op) {

            // Cas d'addition
            case '+':
                o = num1 + num2;
                break;

            // Cas de soustraction
             case '-':
                o = num1 - num2;
                break;


            // Cas de multiplication
            case '*':
                o = num1 * num2;
                break;


            // Cas de division
            case '/':
            if (num2 != 0) {
                o = num1 / num2;
            } else {
                System.out.println("La division par zéro n'est pas autorisée.");
                return;
            }

            // Cas par défaut si l'opérateur n'est pas l'un des quatre précédents
            default:
                System.out.println("Vous avez entré une valeur incorrecte");
        }

        // Affichage du message indiquant le résultat final
        System.out.println("Le résultat final :");
        System.out.println();

        // Affichage du résultat final dans un format convivial
        System.out.println(num1 + " " + op + " " + num2
                        + " = " + o);
    }
}
