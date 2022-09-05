package BlackJack;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
public class Cards {

    static int[] faceValues = new int[11];
    String[] suits = new String[4];


    public static void createDeck(){

    }



    private static void setFaceValues() {
        for (int i = 0; i < faceValues.length; i++) {
            faceValues[i] = i + 1;
        }
    }
    private static void getFaceValues() {
        System.out.println(Arrays.toString(faceValues));
    }

    public static void main(String[] args) {
        setFaceValues();
        getFaceValues();
    }
}