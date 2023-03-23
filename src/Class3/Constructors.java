package Class3;

public class Constructors {
    public String name, color;  //State/Property

    //no-arg constructor
    public Constructors(){
        System.out.println("Rose is my favourite flower");
    }

    //Parameterized Constructor
    public Constructors(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void Decoration(){
        System.out.println("Please decorate the room with " + name + " which color is " + color); //Behaviour
    }

    public static void main(String[] args) {
        Constructors flower1=new Constructors();
        flower1.name="Sunflower";
        flower1.color="Yellow";
        flower1.Decoration();

        Constructors flower2=new Constructors("Lily" , "White");
        flower2.Decoration();
    }
}
