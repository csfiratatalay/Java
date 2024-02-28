public class Main {
    public static void main(String[] args) {

        int numberOne = 13;
        int numberTwo = 14;
        int numberThree= 12;
        int theBiggestNumber = numberOne;


        if (theBiggestNumber < numberTwo)  {
            theBiggestNumber = numberTwo;
            System.out.println("The big number is " + theBiggestNumber);
        }
        if(theBiggestNumber < numberThree) {
            theBiggestNumber = numberThree;
            System.out.println("The big number is " + theBiggestNumber);
        }


    }
}