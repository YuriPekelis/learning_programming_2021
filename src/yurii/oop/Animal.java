package yurii.oop;

public abstract class Animal {
    protected String name;

    public void setName (String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void say();

}
