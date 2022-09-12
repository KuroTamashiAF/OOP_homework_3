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
        Items item3 = new Items("spun", 30);
        Items item4 = new Items("aaaa", 30);
        Items item5 = new Items("bbbb", 30);




        Wardrope wardrope1 = new Wardrope();
        HumanInterface humanItem = new HumanInterfaceImpl();
        //HumanItem.CheckIfTheWardropeIsOpen(wardrope1);

        humanItem.TakeItem(human1, item1);
        humanItem.TakeItem(human1, item2);
        humanItem.TakeItem(human1, item3);
        humanItem.TakeItem(human1, item4);
        humanItem.TakeItem(human1, item5);


        humanItem.ShowInventory(human1);
        System.out.println("------------------------------------");
        //humanItem.CheckIfTheWardropeIsOpen(wardrope1);
        humanItem.takeItemInWardrope(human1,"bbbb", wardrope1);

        humanItem.ShowInventory(human1);
        System.out.println("------------------------------------");
        humanItem.ShowWardrope(wardrope1);


        
    }
}
