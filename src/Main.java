public class Main {
    public static void main(String args[]){





        System.out.println();

        Kroeten toad = new Kroeten(10, "toad", "darkgreen");
        toad.makeSound();
        System.out.println(toad.getColor());
        System.out.println(toad.getHeight());

        System.out.println();

        hoverFrogs hover = new hoverFrogs(12, "HoverFrog", "lightgreen");
        hover.makeSound();
        System.out.println(hover.getColor());
        System.out.println(hover.getHeight());
        hover.showAbillity();

        System.out.println();

        Froesche test = new Froesche(12, "Frog" , "green" );
        test.makeSound();
        System.out.println(test.getColor());
        System.out.println(test.getHeight());
        test.instructTo(hover);


    }
}
