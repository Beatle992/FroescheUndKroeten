public class Kroeten extends Amphibium {

    protected String name;
    protected int height;
    protected String color;

    public Kroeten(int height, String name, String color) {
        super(height, name, color);
    }

    public void makeSound(){
        System.out.println("Quoork");
    }



}
