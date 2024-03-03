public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.brand = "Ford";
        car2.brand = "Renault";

        car.model = "Focus";
        car2.model = "Megane";

        car.color = "black";
        car2.color = "grey";

        car.price = 13;
        car2.price = 21;

        // First Step:
        car.printStates();
        car2.printStates();

        //Second Step:
        car.speed = 100;
        car2.speed = 130;
        car.speedUp(13);
        car2.speedUp(13);

        System.out.println(car.speed);
        System.out.println(car2.speed);


        car.applyBrakes(13);
        car2.applyBrakes(13);
        System.out.println(car.speed);
        System.out.println(car2.speed);


        //The Last Things:
        //car = car2;
        /*
         * Bunun meali artik car2 nin refer ettigi yani point ettigi memoryimdeki
         * bellek ile car1 imin refer ettigi memorydeki ayrilan yer ayni sey.
         *
         * O zaman sorulmasi gereken soru su?
         * car1 imin onceden refer ettigi bellek adresine ne olacak???
         * o ayrilan bellek adresi GARBAGE COLLECTION denilen bir supurge tarafindan
         * temizlenecek...
         *
         */


    }
}