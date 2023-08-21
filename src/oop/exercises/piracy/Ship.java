package oop.exercises.piracy;

public class Ship {

    private double draft = 0;
    private double crew = 0;

    public Ship(double draft, double crew) {
        this.draft = draft;
        this.crew = crew;


    }

    public boolean isItWorthIt() {

        /**
         * You have access to the ship "draft" and "crew". "Draft" is the total ship weight
         * and "crew" is the number of humans on the ship.
         *
         * Each crew member adds 1.5 units to the ship draft.
         * If after removing the weight of the crew, the draft is still more than 20,
         * then the ship is worth looting.
         */

        // 1.5 crew = 1 draft
        //
        // titanic has 15 draft and 10 crew
        //
        // this means titanic has 10 crew * 1.5 each crew draft (each member adds 1.5 to ship draft) plus 15 draft
        // titanic has 15 draft from crew plus 15 draft from initial draft
        //
        // If after removing the weight of the crew, the draft is still more than 20 ship is worth
        //
        // weight of crew is 10 * 1.5 -> 15 weight worth of draft
        // initial weight of draft = 15
        // subtract weight of crew in draft units -> 15 draft - 15 crew draft = 0
        // ship has 0 draft, not worth it

        if (draft - (1.5 * crew) >= 20) {
            System.out.println("Arrrr, this Ship has plenty of booty, it's worth plundering!");
            return true;
        }
        System.out.println("Matey, this ship is poor, not worth it.");
        return false;

    }

    public double getDraft() {
        System.out.println("Ship has weight of: " + draft);
        return draft;
    }

    public double getCrew() {
        System.out.println("Ship has crew of: " + crew);
        return crew;
    }

    public void setDraft(double draft) {
        this.draft = draft;
        System.out.printf("Added %s to Ship's draft %n", draft);
    }

    public void setCrew(double crew) {
        this.crew = crew;
        System.out.printf("Added %s to Ship's crew %n", crew);
    }
}
