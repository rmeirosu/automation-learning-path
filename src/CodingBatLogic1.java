public class CodingBatLogic1 {
    /**
     * Logic-1
     * Basic boolean logic puzzles -- if else && || !.
     */

    public static void main(String[] args) {

        // cigarParty
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
        System.out.println(cigarParty(30, true));
        System.out.println(cigarParty(50, true));
        System.out.println(cigarParty(60, false));
        System.out.println(cigarParty(61, false));
        System.out.println(cigarParty(40, false));
        System.out.println(cigarParty(39, false));
        System.out.println(cigarParty(40, true));
        System.out.println(cigarParty(39, true));


        // dateFashion
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
        System.out.println(dateFashion(3, 3));
        System.out.println(dateFashion(10, 2));
        System.out.println(dateFashion(2, 9));
        System.out.println(dateFashion(9, 9));
        System.out.println(dateFashion(10, 5));
        System.out.println(dateFashion(2, 2));
        System.out.println(dateFashion(3, 7));
        System.out.println(dateFashion(2, 7));
        System.out.println(dateFashion(6, 2));




    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        /**
         * When squirrels get together for a party, they like to have cigars.
         * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
         * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
         * Return true if the party with the given values is successful, or false otherwise.
         *
         * cigarParty(30, false) → false
         * cigarParty(50, false) → true
         * cigarParty(70, true) → true
         */

        if (isWeekend) {
            // no upper bound
            // lower bound is 40, inclusive
            if (cigars >= 40) {
                return true;
            }

        } else if (!isWeekend) {
            // upper bound is 60, inclusive
            // lower bound is 40, inclusive
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }

        } return false;

    }

    public static int dateFashion(int you, int date) {

        /**
         * You and your date are trying to get a table at a restaurant.
         * The parameter "you" is the stylishness of your clothes, in the range 0..10,
         * and "date" is the stylishness of your date's clothes.
         * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
         * If either of you is very stylish, 8 or more, then the result is 2 (yes).
         * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
         * Otherwise the result is 1 (maybe).
         *
         * dateFashion(5, 10) → 2
         * dateFashion(5, 2) → 0
         * dateFashion(5, 5) → 1
         */

        if (you <= 2 || date <= 2) {
            return 0;

        } else if (you >= 8 || date >= 8) {
            return 2;

        } return 1;

    }

}
