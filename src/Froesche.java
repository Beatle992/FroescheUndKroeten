public class Froesche extends Amphibium{

    protected String name;
    protected int height;
    protected String color;

    public Froesche(int height, String name, String color) {
        super(height,  name,  color);
    }
    public void makeSound(){
        System.out.println("Quaak!!");
    }

    protected void  instructTo()
    {
        System.out.println("Take off");


    }
}
