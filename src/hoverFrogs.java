public class  hoverFrogs extends Froesche {



        protected String name;
        protected int height;
        protected String color;


    public hoverFrogs(int height, String name, String color) {
        super(height, name, color);
    }

    public void makeSound(){
            System.out.println("Quaak!!");
        }

    public void showAbillity(){

        System.out.println("I can hover");
    }
    public void hover(){

        System.out.println("Roger I am hovering");
    }

    }


