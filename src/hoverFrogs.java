public class  hoverFrogs extends Amphibium {



        protected String name;
        protected int height;
        protected String color;


    public hoverFrogs(int height, String name, String color) {
        super(height, name, color);
    }

    public void makeSound(){
            System.out.println("Quaak!!");
        }

    public void showabillity(){
        String abillity = "hover";
        System.out.println("I can " + abillity);
    }
    }


