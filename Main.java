import Interfaces.HumanInterface;
import Interfaces.HumanInterfaceImpl;
import ObjectClasses.Human;
import ObjectClasses.Items;
import ObjectClasses.Wardrope;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("alex");
        Items item1 = new Items("pen", 1);
        Items item2 = new Items("antribe", 100);
        Items item3 = new Items("antribe", 100);



        Wardrope wardrope1 = new Wardrope();
        HumanInterface humanItem = new HumanInterfaceImpl();
        //HumanItem.CheckIfTheWardropeIsOpen(wardrope1);

        humanItem.TakeItem(human1, item1);
        humanItem.TakeItem(human1, item2);
        humanItem.TakeItem(human1, item3);
        //humanItem.ShowInventory(human1);
        //humanItem.CheckIfTheWardropeIsOpen(wardrope1);
        humanItem.takeItemInWardrope(human1,"pen", wardrope1);
        humanItem.ShowInventory(human1);

        
    }
}
