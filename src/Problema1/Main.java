package Problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de caractere!");
        String text = scanner.nextLine();

        System.out.println("Introduceti cuvintul cautat : ");
        String x_string = scanner.nextLine();
        int x = text.indexOf(x_string);
        System.out.println(x < 0 ? "Cuvintul nu este in acest string" : "Cuvintul cautat se afla pe pozitia " + x);
        String y_string = text.toUpperCase();
        StringBuilder sb = new StringBuilder(text);
        text = sb.reverse().toString();
        System.out.println("Lungimea textului : " + text.length());
        System.out.println(text);
    }
}

//Problema 1: Procesarea unui șir de caractere (String, StringBuilder, Operatori)
//
//Descriere:
//Scrie un program Java care procesează un șir de caractere introdus de utilizator (reprezentând un text) și
//efectuează mai multe operații pe acesta, folosind clasa String și StringBuilder. Programul va verifica dacă
//textul conține un anumit cuvânt, va converti textul în majuscule și va inversa ordinea caracterelor.
//
//Cerințe:
//
//Creează un pachet problem1.
//În clasa MainApp, cere utilizatorului să introducă un text și un cuvânt de căutat (folosind Scanner).
//Verifică dacă textul conține cuvântul (case-insensitive) și afișează poziția primei apariții.
//Folosește StringBuilder pentru a converti textul în majuscule și pentru a-l inversa.
//        Afișează rezultatele, inclusiv lungimea textului.