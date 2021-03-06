package com.example.android_application_for_p3.data;

public class RankChecker {
    private int combinationAngle; // rank translated to the angle in the speedometer

    public RankChecker(String combinationText) {
        //rank of the combination, where 1 is Royal Flush and 7642 is worst possible
        int combinationRank = findRank(combinationText);
        combinationAngle = findAngle(7643 - combinationRank);
    }

    private int findRank (String text) {
        String[] array = text.split(" ");
        return Integer.parseInt(array[array.length - 1]);
    }

    private int findAngle (int rank){
        //calculating how many ranks fit into the same angle
        float degree = 7642 / 180;
        //Finding how many angles make up the rank
        float angle = rank/degree;
        //rounding it to a whole angle, since you won't be able to see the small changes
        return Math.round(angle);
    }

    public int getCombinationAngle() {
        return combinationAngle;
    }
}
