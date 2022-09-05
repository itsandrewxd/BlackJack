package BlackJack;

import java.util.Arrays;
import java.util.Random;

public class Deck {

    //First create a deck using arrays of suits and faces
    //Faces need to be strings
    //Hash map with keys as value of card
    static int[] faceValues = new int[11];
    String[] suits = new String[4];

    private static void setFaceValues(){
        for(int i=0; i<faceValues.length;i++){
            faceValues[i]=i+1;
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
