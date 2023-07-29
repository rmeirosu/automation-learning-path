public class CodingBatStrings {

    public static void main(String[] args) {

        // helloName
        System.out.println("CodingBat String-1 exercise: helloName");
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Dolly"));
        System.out.println(helloName("Alpha"));
        System.out.println(helloName("Omega"));
        System.out.println(helloName("Goodbye"));
        System.out.println(helloName("ho ho ho"));
        System.out.println(helloName("xyz!"));
        System.out.println(helloName("Hello"));
        System.out.println("============");

        // makeAbba
        System.out.println("CodingBat String-1 exercise: makeAbba");
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
        System.out.println(makeAbba("aaa", "bbb"));
        System.out.println(makeAbba("x", "y"));
        System.out.println(makeAbba("x", ""));
        System.out.println(makeAbba("", "y"));
        System.out.println(makeAbba("Bo", "Ya"));
        System.out.println(makeAbba("Ya", "Ya"));
        System.out.println("============");

        // makeTags
        System.out.println("CodingBat String-1 exercise: makeTags");
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
        System.out.println(makeTags("address", "here"));
        System.out.println(makeTags("body", "Heart"));
        System.out.println(makeTags("i", "i"));
        System.out.println(makeTags("i", ""));
        System.out.println("============");

        // makeOutWord
        System.out.println("CodingBat String-1 exercise: makeOutWord");
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
        System.out.println(makeOutWord("HHoo", "Hello"));
        System.out.println(makeOutWord("abyz", "YAY"));
        System.out.println("============");

        // extraEnd
        System.out.println("CodingBat String-1 exercise: extraEnd");
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
        System.out.println(extraEnd("Candy"));
        System.out.println(extraEnd("Code"));
        System.out.println("============");

        // firstTwo
        System.out.println("CodingBat String-1 exercise: firstTwo");
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo("a"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("Kitten"));
        System.out.println(firstTwo("hi"));
        System.out.println(firstTwo("hiya"));
        System.out.println("============");

        // firstHalf
        System.out.println("CodingBat String-1 exercise: firstHalf");
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(firstHalf("ab"));
        System.out.println(firstHalf(""));
        System.out.println(firstHalf("0123456789"));
        System.out.println(firstHalf("kitten"));
        System.out.println("============");

        // withoutEnd
        System.out.println("CodingBat String-1 exercise: withoutEnd");
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
        System.out.println(withoutEnd("code"));
        System.out.println(withoutEnd("ab"));
        System.out.println(withoutEnd("Chocolate!"));
        System.out.println(withoutEnd("kitten"));
        System.out.println(withoutEnd("woohoo"));
        System.out.println("============");

        // comboString
        System.out.println("CodingBat String-1 exercise: comboString");
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
        System.out.println(comboString("b", "aaa"));
        System.out.println(comboString("aaa", ""));
        System.out.println(comboString("", "bb"));
        System.out.println(comboString("aaa", "1234"));
        System.out.println(comboString("aaa", "bb"));
        System.out.println(comboString("a", "bb"));
        System.out.println(comboString("bb", "a"));
        System.out.println(comboString("xyz", "ab"));
        System.out.println("============");

        // nonStart
        System.out.println("CodingBat String-1 exercise: nonStart");
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
        System.out.println(nonStart("ab", "xy"));
        System.out.println(nonStart("ab", "x"));
        System.out.println(nonStart("x", "ac"));
        System.out.println(nonStart("a", "x"));
        System.out.println(nonStart("kit", "kat"));
        System.out.println(nonStart("mart", "dart"));
        System.out.println("============");

        // left2
        System.out.println("CodingBat String-1 exercise: left2");
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
        System.out.println(left2("code"));
        System.out.println(left2("cat"));
        System.out.println(left2("12345"));
        System.out.println(left2("Chocolate"));
        System.out.println(left2("bricks"));
        System.out.println("============");

        // right2
        System.out.println("CodingBat String-1 exercise: right2");
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
        System.out.println(right2("code"));
        System.out.println(right2("cat"));
        System.out.println(right2("12345"));
        System.out.println("============");

        // theEnd
        System.out.println("CodingBat String-1 exercise: theEnd");
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
        System.out.println(theEnd("oh", false));
        System.out.println(theEnd("x", true));
        System.out.println(theEnd("x", false));
        System.out.println(theEnd("java", true));
        System.out.println(theEnd("chocolate", false));
        System.out.println(theEnd("1234", true));
        System.out.println(theEnd("code", false));
        System.out.println("============");

        // withouEnd2
        System.out.println("CodingBat String-1 exercise: withouEnd2");
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
        System.out.println(withouEnd2("a"));
        System.out.println(withouEnd2(""));
        System.out.println(withouEnd2("coldy"));
        System.out.println(withouEnd2("java code"));
        System.out.println("============");

        // middleTwo
        System.out.println("CodingBat String-1 exercise: middleTwo");
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
        System.out.println(middleTwo("ab"));
        System.out.println(middleTwo("0123456789"));
        System.out.println("============");

        // endsLy
        System.out.println("CodingBat String-1 exercise: endsLy");
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
        System.out.println(endsLy("oddl"));
        System.out.println(endsLy("olydd"));
        System.out.println(endsLy("ly"));
        System.out.println(endsLy(""));
        System.out.println(endsLy("falsey"));
        System.out.println(endsLy("evenly"));
        System.out.println("============");

        // nTwice
        System.out.println("CodingBat String-1 exercise: nTwice");
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
        System.out.println(nTwice("Chocolate", 0));
        System.out.println(nTwice("Hello", 4));
        System.out.println(nTwice("Code", 4));
        System.out.println(nTwice("Code", 2));
        System.out.println("============");

        // twoChar
        System.out.println("CodingBat String-1 exercise: twoChar");
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("java", 4));
        System.out.println(twoChar("java", -1));
        System.out.println(twoChar("Hello", 0));
        System.out.println(twoChar("Hello", 1));
        System.out.println(twoChar("Hello", 99));
        System.out.println(twoChar("Hello", 3));
        System.out.println(twoChar("Hello", 4));
        System.out.println(twoChar("Hello", 5));
        System.out.println(twoChar("Hello", -7));
        System.out.println(twoChar("Hello", 6));
        System.out.println(twoChar("Hello", -1));
        System.out.println(twoChar("yay", 0));
        System.out.println("============");

        // middleThree
        System.out.println("CodingBat String-1 exercise: middleThree");
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
        System.out.println(middleThree("Hi yet Hi"));
        System.out.println(middleThree("java yet java"));
        System.out.println(middleThree("Chocolate"));
        System.out.println(middleThree("XabcxyzabcX"));
        System.out.println("============");

        // hasBad
        System.out.println("CodingBat String-1 exercise: hasBad");
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad("code"));
        System.out.println(hasBad("bad"));
        System.out.println(hasBad("ba"));
        System.out.println(hasBad("xba"));
        System.out.println(hasBad("xbad"));
        System.out.println(hasBad(""));
        System.out.println(hasBad("badyy"));
        System.out.println("============");

        // atFirst
        System.out.println("CodingBat String-1 exercise: atFirst");
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
        System.out.println(atFirst(""));
        System.out.println(atFirst("kitten"));
        System.out.println(atFirst("java"));
        System.out.println(atFirst("j"));
        System.out.println("============");

        // lastChars
        System.out.println("CodingBat String-1 exercise: lastChars");
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
        System.out.println(lastChars("", "hello"));
        System.out.println(lastChars("", ""));
        System.out.println(lastChars("kitten", "hi"));
        System.out.println(lastChars("k", "zip"));
        System.out.println(lastChars("kitten", ""));
        System.out.println(lastChars("kitten", "zip"));
        System.out.println("============");

        // conCat
        System.out.println("CodingBat String-1 exercise: conCat");
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
        System.out.println(conCat("", "cat"));
        System.out.println(conCat("pig", "g"));
        System.out.println(conCat("pig", "doggy"));
        System.out.println("============");

        // lastTwo
        System.out.println("CodingBat String-1 exercise: lastTwo");
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
        System.out.println(lastTwo("a"));
        System.out.println(lastTwo(""));
        System.out.println("============");

        //seeColor
        System.out.println("CodingBat String-1 exercise: seeColor");
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
        System.out.println(seeColor("NoColor"));
        System.out.println(seeColor("red"));
        System.out.println(seeColor("re"));
        System.out.println(seeColor("blu"));
        System.out.println(seeColor("blue"));
        System.out.println(seeColor("a"));
        System.out.println(seeColor(""));
        System.out.println("============");

        // frontAgain
        System.out.println("CodingBat String-1 exercise: frontAgain");
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
        System.out.println(frontAgain("jj"));
        System.out.println(frontAgain("jjj"));
        System.out.println(frontAgain("jjjj"));
        System.out.println(frontAgain("jjjk"));
        System.out.println(frontAgain("x"));
        System.out.println(frontAgain(""));
        System.out.println(frontAgain("java"));
        System.out.println(frontAgain("javaja"));
        System.out.println("============");

        // minCat
        System.out.println("CodingBat String-1 exercise: minCat");
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        System.out.println(minCat("abc", "x"));
        System.out.println(minCat("x", "abc"));
        System.out.println(minCat("abc", ""));
        System.out.println("============");

        // extraFront
        System.out.println("CodingBat String-1 exercise: extraFront");
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
        System.out.println(extraFront(""));
        System.out.println(extraFront("Candy"));
        System.out.println(extraFront("Code"));
        System.out.println("============");

        // without2
        System.out.println("CodingBat String-1 exercise: without2");
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
        System.out.println(without2("Chocolate"));
        System.out.println(without2("xxx"));
        System.out.println(without2("xx"));
        System.out.println(without2("x"));
        System.out.println(without2(""));
        System.out.println(without2("Fruits"));
        System.out.println("============");

        // deFront
        System.out.println("CodingBat String-1 exercise: deFront");
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("axy"));
        System.out.println(deFront("abc"));
        System.out.println(deFront("xby"));
        System.out.println(deFront("ab"));
        System.out.println(deFront("ax"));
        System.out.println(deFront("axb"));
        System.out.println(deFront("aaa"));
        System.out.println(deFront("xbc"));
        System.out.println(deFront("bbb"));
        System.out.println(deFront("bazz"));
        System.out.println(deFront("ba"));
        System.out.println(deFront("abxyz"));
        System.out.println(deFront("hi"));
        System.out.println(deFront("his"));
        System.out.println(deFront("xz"));
        System.out.println(deFront("zzz"));
        System.out.println("============");

        // startWord
        System.out.println("CodingBat String-1 exercise: startWord");
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
        System.out.println(startWord("hippo", "ix"));
        System.out.println(startWord("h", "ix"));
        System.out.println(startWord("", "i"));
        System.out.println(startWord("hip", "zi"));
        System.out.println(startWord("hip", "zip"));
        System.out.println(startWord("hip", "zig"));
        System.out.println(startWord("h", "z"));
        System.out.println(startWord("hippo", "xippo"));
        System.out.println(startWord("hippo", "xyz"));
        System.out.println(startWord("hippo", "hip"));
        System.out.println(startWord("kitten", "cit"));
        System.out.println(startWord("kit", "cit"));
        System.out.println("============");

        //withoutX
        System.out.println("CodingBat String-1 exercise: withoutX");
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("Hi"));
        System.out.println(withoutX("xxHi"));
        System.out.println(withoutX("Hix"));
        System.out.println(withoutX("xaxbx"));
        System.out.println(withoutX("xx"));
        System.out.println(withoutX("x"));
        System.out.println(withoutX(""));
        System.out.println(withoutX("Hello"));
        System.out.println(withoutX("Hexllo"));
        System.out.println("============");

        //withoutX2
        System.out.println("CodingBat String-1 exercise: withoutX2");
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
        System.out.println(withoutX2("xxHi"));
        System.out.println(withoutX2("Hix"));
        System.out.println(withoutX2("xaxb"));
        System.out.println(withoutX2("xx"));
        System.out.println(withoutX2("x"));
        System.out.println(withoutX2(""));
        System.out.println(withoutX2("Hello"));
        System.out.println(withoutX2("Hexllo"));
        System.out.println(withoutX2("xHxllo"));
        System.out.println("============");


    }

    public static String helloName(String name) {
        // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
    /*
    Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
    /*
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     */
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static String makeOutWord(String out, String word) {
    /*
    Given an "out" string length 4, such as "<<>>", and a word, return a new string where
    the word is in the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i
    and going up to but not including index j.

    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
     */
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }

    public static String extraEnd(String str) {
    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */
        return (str.substring(str.length() - 2)) + (str.substring(str.length() - 2)) + (str.substring(str.length() - 2));
    }

    public static String firstTwo(String str) {
    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X",
    and the empty string "" yields the empty string "".
    Note that str.length() returns the length of a string.

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
     */
        if (str.length() >= 2) {
            return (str.substring(0, 2));

        } else {
            return str;
        }
    }

    public static String firstHalf(String str) {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */
        return (str.substring(0, str.length() / 2));
    }

    public static String withoutEnd(String str) {
    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
     */
        return (str.substring(1, str.length() - 1));
    }

    public static String comboString(String a, String b) {
    /*
    Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
     */

        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static String nonStart(String a, String b) {
    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */

        return (a.substring(1, a.length()) + b.substring(1, b.length()));
    }

    public static String left2(String str) {
    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.

    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"
     */

        return (str.substring(2) + str.substring(0, 2));
    }

    public static String right2(String str) {

    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.

    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
     */

        return (str.substring(str.length() - 2, str.length())
                + str.substring(0, str.length() - 2));

    }

    public static String theEnd(String str, boolean front) {
    /*
    Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty.

    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
     */

        if (front == true) {
            return (str.substring(0, 1));
        } else {
            return (str.substring(str.length() - 1));
        }
    }

    public static String withouEnd2(String str) {
    /*
    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
     */
        if (str.length() >= 2) {
            return (str.substring(1, str.length() - 1));
        } else {
            return "";
        }
    }

    public static String middleTwo(String str) {
    /*
    Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri". The string length will be at least 2.

    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
     */

        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);

    }

    public static boolean endsLy(String str) {
    /*
    Given a string, return true if it ends in "ly".

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
     */

        if (str.length() < 2) {
            return false;
        } else if (str.substring(str.length() - 2, str.length()).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static String nTwice(String str, int n) {
    /*
    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
     */

        if (n > 0) {
            return (str.substring(0, n) + str.substring(str.length() - n));
        } else {
            return "";
        }

    }

    public static String twoChar(String str, int index) {
    /*
    Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2.

    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
     */

        if (index < 0 || index > (str.length() - 2)) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }

    }

    public static String middleThree(String str) {
    /*
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
     */

        if (str.length() % 2 != 0 && str.length() > 2) { // %2 == 0 means even number (no remainder)
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        } else {
            return "String is even number";
        }

    }

    public static boolean hasBad(String str) {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0. Note: use .equals() to compare 2 strings.

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */

        if ((str.length() < 3)) {
            return false;

        } else if (str.length() == 3 && !(str.substring(0, 1).equals("b"))) {
            return false;

        } else if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
            return true;

        } else {
            return false;
        }

    }

    public static String atFirst(String str) {
    /*
    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */

        if (str.length() == 0) {
            return "@@";

        } else if (str.length() < 2) {
            return (str + "@");

        } else {
            return (str.substring(0, 2));
        }
    }

    public static String lastChars(String a, String b) {
    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
     */
        if (a.length() == 0 && b.length() == 0) {
            return "@@";

        } else if (a.length() == 0) {
            return ("@" + b.substring(b.length() - 1, b.length()));

        } else if (b.length() == 0) {
            return (a.substring(0, 1) + "@");

        } else {
            return (a.substring(0, 1) + b.substring(b.length() - 1, b.length()));
        }
    }

    public static String conCat(String a, String b) {
    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the concatenation creates a double-char, then omit one of the chars,
    so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
     */

        if (a.length() == 0) {
            return b;

        } else if (b.length() == 0) {
            return a;

        } else if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a + b.substring(1, b.length());

        } else {
            return a + b;
        }

    }

    public static String lastTwo(String str) {
    /*
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".

    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
     */

        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2)
                    + str.substring(str.length() - 1, str.length())
                    + str.substring(str.length() - 2, str.length() - 1);

        } else {
            return str;
        }
    }

    public static String seeColor(String str) {
    /*
    Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
     */

        if (str.length() < 3) {
            return "";
        } else if (str.substring(0, 3).equals("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public static boolean frontAgain(String str) {
    /*
    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
     */

        if (str.length() <= 1) {
            return false;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return true;
        } else {
            return false;
        }
    }

    public static String minCat(String a, String b) {
    /*
    Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string
    so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
     */
        if ((a.length() != b.length())
                && (a.length() < b.length())) {
            return a + b.substring(b.length() - a.length(), b.length());

        } else if ((a.length() != b.length())
                && (a.length() > b.length())) {
            return a.substring(a.length() - b.length(), a.length()) + b;

        } else {
            return "";
        }


    }

    public static String extraFront(String str) {
    /*
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.

    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
     */
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    public static String without2(String str) {
    /*
    Given a string, if a length 2 substring appears at both its beginning and end,
    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""
     */

        if (str.length() < 2) {
            return str;

        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2, str.length());

        } else {
            return str;
        }
    }

    public static String deFront(String str) {

    /*
    Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    The string may be any length. Harder than it looks.

    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
     */

        if (str.substring(0, 1).equals("a") && !(str.substring(1, 2).equals("b"))) {
            //case 1: firstchar a and secondchar not b
            return "a" + str.substring(2, str.length());


        } else if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
            //case 2: firstchar a and secondchar b
            return str;

        } else if (!(str.substring(0, 1).equals("a")) && str.substring(1, 2).equals("b")) {
            //case 3: firstchar not a and secondchar b
            return "b" + str.substring(2, str.length());

        } else {
            //case 4: firstchar not a and secondchar not b
            return str.substring(2, str.length());
        }
    }

    public static String startWord(String str, String word) {
    /*
    Given a string and a second "word" string, we'll say that the word matches the string if it appears
    at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h"
     */
        if (str.length() >= word.length()) {
            if (word.substring(1, word.length()).equals(str.substring(1, word.length()))) {
                return str.substring(0, word.length());
            } else {
                return "";
            }

        } else {
            return "";
        }
    }

    public static String withoutX(String str) {

    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.

    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
     */


        if (str.length() > 0) {
            //if the first or last chars are 'x'
            if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1, str.length()).equals("x")) {

                if (str.length() > 1) {//return without start x and last x
                    return str.substring(1, str.length() - 1);

                } else {
                    return "";
                }

                //if first char is 'x'
            } else if (str.substring(0, 1).equals("x")) {

                if (str.length() > 1) {
                    //return without first x
                    return str.substring(1, str.length());

                } else {
                    return "";
                }

                //if last char is 'x'
            } else if (str.substring(str.length() - 1, str.length()).equals("x")) {
                if (str.length() > 1) {
                    //return without last x
                    return str.substring(0, str.length() - 1);
                } else {
                    return "";
                }

            } else {
                return str;
            }

        } else {
            return str;
        }
    }

    public static String withoutX2(String str) {
    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged. This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
     */
        if (str.length() > 0) {

            //if string is length 1 and first char is x
            if ((str.length() == 1) && (str.equals("x"))) {
                return "";

            } else if (str.substring(0, 2).equals("xx") && str.length() > 1) {
                //if one or both of the first 2 is "x" return the string without those "x" chars
                return str.substring(2, str.length());

            } else if (str.substring(0, 1).equals("x") && str.length() > 1) {
                //if first char is "x" return without first char
                return str.substring(1, str.length());

            } else if (str.substring(1, 2).equals("x") && str.length() > 1) {
                //if second char is "x" return without second char
                return str.substring(0, 1) + str.substring(2, str.length());

            } else {
                return str;
            }

        } else {
            return "";
        }
    }




}
