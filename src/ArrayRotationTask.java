import java.util.Arrays;

public class ArrayRotationTask {



    public static void main(String[] args) {
        int [] givenArray = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, 2)));

    }





    public static  int [] rotateArrayLeft (int [] givenArray, int numberOfPositions){

        int[] resultArray = new int[givenArray.length];


        int givenIndex = numberOfPositions;


        for (int i = 0; i < resultArray.length - numberOfPositions; i++) {
            resultArray[i] = givenArray[givenIndex];
            givenIndex++;
        }

        givenIndex = 0;

        for (int i = resultArray.length - numberOfPositions; i < resultArray.length; i++) {
            resultArray[i] = givenArray[givenIndex];
            givenIndex++;
        }


        return resultArray;

    }


}
