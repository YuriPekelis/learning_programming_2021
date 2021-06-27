package yurii.oop;

public class OOPHelper {
    public static void main(String[] args) {
        Dog dogAstra = new Dog("Astra");
        dogAstra.say();
        dogAstra.say("Hello");
        Dog dog1 =new Dog ("Bert");
        dog1.say();
        Cat catBlack=new Cat ("Black");
        catBlack.say();
        String [] dogNames = {"Astra", "Bert", "Jack"};
        int [] numbers = new int[4];
        Dog [] dogs = new Dog[3];
        for (int i=0; i<3; i++){
            dogs[i] = new Dog(dogNames[i]);
        }
        for (int i=0; i<3; i++){
            dogs[i].say();
        }
        System.out.println("======================");

        Animal [] zoo = new Animal[6];
        String [] catNames = {"Byte", "Kilobyte", "Megabyte"};
        for (int i=0; i<3; i++){
            zoo[i] = new Dog(dogNames[i]);
        }
        for(int i=3; i<6; i++) {
            zoo[i] = new Cat(catNames[i - catNames.length]);
        }
        for (Animal currentAnimal: zoo) {
            currentAnimal.say();
        }

//        for(int i=0; i<6; i++) {
//            Animal currentAnimal = zoo[i];
//        }

    }
}
