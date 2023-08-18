package array.exercise;

/**
 * Validarea oricărui CNP se realizează prin calcularea cifrei de control.
 * Dacă cifra de control calculată este egală cu cea specificată în CNP,
 * atunci codul numeric personal este valid și corect.

 * Algoritmul de calculare a cifrei de control folosește următoarele 12 cifre:
 * 279146358279. Fiecare cifra din constantă este înmulțită cu cifra corespondentă din CNP.
 * De exemplu, dacă prima cifră din CNP-ul persoanei este 1
 * (1 semnifică persoana de sex masculin născută între 1900-1999),
 * aceasta este înmulțită cu prima cifră din constantă adică 2.
 * Rezultatele înmulțirilor sunt însumate, iar numărul rezultat se împarte la 11.

 * Dacă restul împărțirii este mai mic decât 10, atunci acel număr reprezintă
 * cifra de control, cea de 13-a cifra a CNP-ului.
 * În schimb, dacă restul împărțirii este 10, atunci cifra de control este 1.

 * Să luăm de exemplu următorul CNP: 2990219469000.
 * În cazul de față trebuie sa vedem dacă cifra de control pe care o calculam este egala cu 0.
 * Dacă rezultatul nu este 0, atunci CNP-ul este incorect.

 * Vom înmulți fiecare dintre primele 12 cifre ale CNP-ului cu valoarea constantă corespunzătoare.


 *
 * What will be the output of the following code snippet?
 *      int a = 1;
 *      int[] ia = new int[10];
 *      int b = ia[a];
 *      int c = b + a;
 *      System.out.println(b = c);
 */
public class Main {

    public static void main(String[] args) {


        //Fiecare cifra din constantă este înmulțită cu cifra corespondentă din CNP.
        //Rezultatele înmulțirilor sunt însumate, iar numărul rezultat se împarte la 11.

        //  *Dacă restul împărțirii este mai mic decât 10, atunci acel număr reprezintă cifra de control, cea de 13-a cifra a CNP-ului.
        //  *În schimb, dacă restul împărțirii este 10, atunci cifra de control este 1.

        //se inmulteste fiecare numar din cnp cu fiecare numar in parte din numarul de deasupra
        //se aduna rezultatele intre ele
        //rezultatul final se imparte la 11 si se ia modulo(remainder). remainder este cifra de control

        int a = 1;
        int[] ia = new int[10];
        //  0 1 2 3 4 5 6 7 8 9 //index
        //{ 0 0 0 0 0 0 0 0 0 0 } //ia array of size 10 initialized with default values - 0
        int b = ia[a]; // a is assigned 1, ia[1] is value of ia array at index 1, meaning 0
        int c = b + a; // c is assigned the value of b + a. b is 0 as per above and a is 1. c will be assigned 1
        System.out.println(b = c); // b = c means b will be assigned the value of c, which is 1 so it will print out 1




    }
}
