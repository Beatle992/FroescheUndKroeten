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

    public int setHeight(int height){
        this.height = height;
        return height;
    }

    public int setColor(int color){
        this.color = String.valueOf(color);
        return color;
    }

}
