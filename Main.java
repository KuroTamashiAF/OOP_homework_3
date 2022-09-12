import Interfaces.HumanInterface;
import Interfaces.HumanInterfaceImpl;
import ObjectClasses.Human;
import ObjectClasses.Items;
import ObjectClasses.Wardrope;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("alex");
        Items item1 = new Items("pen", 1);
        Wardrope wardrope1 = new Wardrope(10);
        HumanInterface HumanItem = new HumanInterfaceImpl();
        HumanItem.CheckIfTheWardropeIsOpen(wardrope1);
        


    }
}
