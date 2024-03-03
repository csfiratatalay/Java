public class Main {
    public static void main(String[] args) {
        char myGrade = 'F';

        switch (myGrade){
            case 'A':
                System.out.println("Perfect!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("ehh");
                break;
            default:
                System.out.println("Terrible");
                break;
        }
    }
}