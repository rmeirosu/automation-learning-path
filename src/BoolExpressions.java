public class BoolExpressions {
    public static void main(String[] args) {
        int apples = 6;
        int oranges = 9;

        System.out.println(apples == oranges);
        //Boolean expressions evaluate to true or false.
        //When testing for equality in Java we use '=='.
        System.out.println(apples != oranges);
        //'!=' - Not equal.

        System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
        System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
        System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
        System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);

        System.out.println(apples + " > " + oranges + " is " + (apples > oranges));
        System.out.println(apples + " < " + oranges + " is " + (apples < oranges));
        System.out.println(apples + " >= " + oranges + " is " + (apples >= oranges));
        System.out.println(apples + " <= " + oranges + " is " + (apples <= oranges));

        //Compound Boolean Expressions
        double applePrice = 12.60;
        double orangePrice = 4.50;
        /*We want to reduce the price of apples if there are more apples than oranges
        but only do that if apples cost more than oranges.
        There are two conditions here.*/
        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) && (applePrice > orangePrice));
        //'&&' is AND

        //Other way to write it:
        if ((apples > oranges) && (applePrice > orangePrice)) {
            System.out.println("Reducing apple cost.");
        }

        //Either condition being true - use OR - '||'
        System.out.printf("Reducing apple cost: %s %n", (apples > oranges) || (applePrice > orangePrice));

        /*
        TRUTH TABLES:

        A. and (&&) truth table:
              | true  | false
        true  | true  | false
        false | false | false

        1. true && true = true
        2. true && false = false
        3. false && true = false
        4. false && false = false

        B. or (||) truth table:
              | true  | false
        true  | true  | true
        false | true  | false

        1. true || true = true
        2. true || false = true
        3. false || true = true
        4. false || false = false
        */

        /*Boolean Variables:
        Boolean can only store true or false.
        We can use boolean variable in place of a boolean expression.
         */
        boolean moreApples;
        boolean applesAreDearer;

        moreApples = (apples > oranges);
        applesAreDearer = (applePrice > orangePrice);

        System.out.printf("We have more apples: %s %n", moreApples);
        System.out.printf("Apples are dearer: %s %n", applesAreDearer);

        System.out.printf("Reducing cost of apples: %s %n", (moreApples && applesAreDearer));
        System.out.printf("Reducing cost of apples: %s %n", (moreApples || applesAreDearer));

        boolean moreApplesAndDearer = moreApples && applesAreDearer;
        boolean moreApplesOrDear = moreApples || applesAreDearer;
        System.out.printf("Reducing cost of apples: %s %n", moreApplesAndDearer);
        System.out.printf("Reducing cost of apples: %s %n", moreApplesOrDear);

    }
}
