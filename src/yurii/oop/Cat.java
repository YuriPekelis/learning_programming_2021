package yurii.oop;

public class Cat extends Animal{

    public Cat(String name) {
        this.name = name;
//        this.setName(name);// equal to previous
    }

    @Override
    public void say() {
        System.out.println("Mjau");
    }
}
