public class CodingBatLogic1 {
    /**
     * Logic-1
     * Basic boolean logic puzzles -- if else && || !.
     */

    public static void main(String[] args) {

        // cigarParty
        System.out.println("cigarParty");
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
        System.out.println("============");


        // dateFashion
        System.out.println("dateFashion");
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
        System.out.println("============");


        // squirrelPlay
        System.out.println("squirrelPlay");
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
        System.out.println(squirrelPlay(90, false));
        System.out.println(squirrelPlay(90, true));
        System.out.println(squirrelPlay(50, false));
        System.out.println(squirrelPlay(50, true));
        System.out.println(squirrelPlay(100, false));
        System.out.println(squirrelPlay(100, true));
        System.out.println(squirrelPlay(105, true));
        System.out.println(squirrelPlay(59, false));
        System.out.println(squirrelPlay(59, true));
        System.out.println(squirrelPlay(60, false));
        System.out.println("============");


        // caughtSpeeding
        System.out.println("caughtSpeeding");
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
        System.out.println(caughtSpeeding(80, false));
        System.out.println(caughtSpeeding(85, false));
        System.out.println(caughtSpeeding(85, true));
        System.out.println(caughtSpeeding(70, false));
        System.out.println(caughtSpeeding(75, false));
        System.out.println(caughtSpeeding(75, true));
        System.out.println(caughtSpeeding(40, false));
        System.out.println(caughtSpeeding(40, true));
        System.out.println(caughtSpeeding(90, false));
        System.out.println("============");


        // sortaSum
        System.out.println("sortaSum");
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
        System.out.println(sortaSum(12, -3));
        System.out.println(sortaSum(-3, 12));
        System.out.println(sortaSum(4, 5));
        System.out.println(sortaSum(4, 6));
        System.out.println(sortaSum(14, 7));
        System.out.println(sortaSum(14, 6));
        System.out.println("============");


        // alarmClock
        System.out.println("alarmClock");
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
        System.out.println(alarmClock(6, false));
        System.out.println(alarmClock(0, true));
        System.out.println(alarmClock(6, true));
        System.out.println(alarmClock(1, true));
        System.out.println(alarmClock(3, true));
        System.out.println(alarmClock(5, true));
        System.out.println("============");


        // love6
        System.out.println("love6");
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
        System.out.println(love6(1, 6));
        System.out.println(love6(1, 8));
        System.out.println(love6(1, 7));
        System.out.println(love6(7, 5));
        System.out.println(love6(8, 2));
        System.out.println(love6(6, 6));
        System.out.println(love6(-6, 2));
        System.out.println(love6(-4, -10));
        System.out.println(love6(-7, 1));
        System.out.println(love6(7, -1));
        System.out.println(love6(-6, 12));
        System.out.println(love6(-2, -4));
        System.out.println(love6(7, 1));
        System.out.println(love6(0, 9));
        System.out.println(love6(8, 3));
        System.out.println(love6(3, 3));
        System.out.println(love6(3, 4));
        System.out.println("============");


        // in1To10
        System.out.println("in1To10");
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true));
        System.out.println(in1To10(10, false));
        System.out.println(in1To10(10, true));
        System.out.println(in1To10(9, false));
        System.out.println(in1To10(9, true));
        System.out.println(in1To10(1, false));
        System.out.println(in1To10(1, true));
        System.out.println(in1To10(0, false));
        System.out.println(in1To10(0, true));
        System.out.println(in1To10(-1, false));
        System.out.println(in1To10(-1, true));
        System.out.println(in1To10(99, false));
        System.out.println(in1To10(-99, true));
        System.out.println("============");


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

        }
        return false;

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

        }
        return 1;

    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {

        /**
         * The squirrels in Palo Alto spend most of the day playing.
         * In particular, they play if the temperature is between 60 and 90 (inclusive).
         * Unless it is summer, then the upper limit is 100 instead of 90.
         * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
         *
         * squirrelPlay(70, false) → true
         * squirrelPlay(95, false) → false
         * squirrelPlay(95, true) → true
         */

        if (isSummer && (temp >= 60 && temp <= 100)) {
            return true;

        } else if (!isSummer && (temp >= 60 && temp <= 90)) {
            return true;

        }
        return false;

    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        /**
         * You are driving a little too fast, and a police officer stops you.
         * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
         * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
         * If speed is 81 or more, the result is 2.
         * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
         *
         * caughtSpeeding(60, false) → 0
         * caughtSpeeding(65, false) → 1
         * caughtSpeeding(65, true) → 0
         */

        if (isBirthday) {
            if (speed <= 65) {
                return 0;

            } else if (speed <= 85) {
                return 1;

            }
            return 2;

        }
        if (speed <= 60) {
            return 0;

        } else if (speed <= 80) {
            return 1;

        }
        return 2;
    }

    public static int sortaSum(int a, int b) {
        /**
         * Given 2 ints, a and b, return their sum.
         * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
         *
         * sortaSum(3, 4) → 7
         * sortaSum(9, 4) → 20
         * sortaSum(10, 11) → 21
         */

        int sum = a + b;

        if (sum >= 10 && sum <= 19) {
            return 20;

        }
        return sum;

    }

    public static String alarmClock(int day, boolean vacation) {
        /**
         * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
         * and a boolean indicating if we are on vacation,
         * return a string of the form "7:00" indicating when the alarm clock should ring.
         * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
         * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
         *
         * alarmClock(1, false) → "7:00"
         * alarmClock(5, false) → "7:00"
         * alarmClock(0, false) → "10:00"
         */

        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
            return "off";
        }
        if (day >= 1 && day <= 5) {
            return "7:00";
        }
        return "10:00";

    }

    public static boolean love6(int a, int b) {
        /**
         * The number 6 is a truly great number.
         * Given two int values, a and b, return true if either one is 6.
         * Or if their sum or difference is 6.
         * Note: the function Math.abs(num) computes the absolute value of a number.
         *
         * love6(6, 4) → true
         * love6(4, 5) → false
         * love6(1, 5) → true
         */

        int sum = a + b;
        int dif = Math.abs(a - b);

        if ((a == 6 || b == 6) || (sum == 6 || dif == 6)) {
            return true;

        }
        return false;

    }

    public static boolean in1To10(int n, boolean outsideMode) {
        /**
         * Given a number n, return true if n is in the range 1..10, inclusive.
         * Unless outsideMode is true, in which case return true if the number is less or equal to 1,
         * or greater or equal to 10.
         *
         *
         * in1To10(5, false) → true
         * in1To10(11, false) → false
         * in1To10(11, true) → true
         */

        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;

            }
            return false;

        } else {
            if (n <= 1 || n >= 10) {
                return true;
            }
            return false;

        }


    }


}
