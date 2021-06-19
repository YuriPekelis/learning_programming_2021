public class Dog {
    private String name;
    private int age;
    private String type;
    private String color;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public static int getDogLegQty() {
        return 4;
    }
}
