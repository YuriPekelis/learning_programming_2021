package yurii.oop;

public class Dog extends Animal{

    public Dog (String name ){
        this.name=name;
    }


    @Override
    public void say() {
        System.out.println(this.name);
    }

    public void say (String word) {
        System.out.println(word);
    }

}
