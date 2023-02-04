import java.util.Arrays;

public class ArrayRotationTask {



    public static void main(String[] args) {
        int [] givenArray = {1,2,3,4,5,6,7};

        /*
        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, 2)));
        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, 8)));
        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, 100)));
        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, -2)));

         */

        givenArray[2] = -3;

        System.out.println(Arrays.toString(rotateArrayLeft(givenArray, 2)));

    }





    public static  int [] rotateArrayLeft (int [] givenArray, int numberOfPositions){


        while (numberOfPositions > givenArray.length) {
            numberOfPositions -= givenArray.length;
        }  // handles a position value greater than the number of integers in the array

        int[] resultArray = new int[givenArray.length];

        try {

            if (numberOfPositions < 0) {
                throw new NegativeNumberException();
            }

            for (int each : givenArray) {
                if (each < 0) {
                    throw new NegativeNumberException();
                }
            }

        } catch (NegativeNumberException e){
            e.printStackTrace();
            return resultArray; // will return array of zeroes
        }



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
