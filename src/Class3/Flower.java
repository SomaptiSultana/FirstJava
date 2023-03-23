package Class3;

public class Flower {
    public String name, color;  //State/Property

    public void Decoration(){
        System.out.println("Please decorate the room with " + name + " which color is " + color); //Behaviour
    }

    public static void main(String[] args) {
        Flower flower1= new Flower();    //object
        flower1.name="Rose";
        flower1.color="Red";
        flower1.Decoration();

        Flower flower2=new Flower();
        flower2.name="Lily";
        flower2.color="White";
        flower2.Decoration();
    }
}
