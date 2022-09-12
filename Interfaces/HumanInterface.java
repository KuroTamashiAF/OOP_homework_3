package Interfaces;

import ObjectClasses.Human;
import ObjectClasses.Items;
import ObjectClasses.Wardrope;

public interface HumanInterface {

    void TakeItem(Human human, Items item);

    void CheckIfTheWardropeIsOpen(Wardrope wardrope);

    void ShowInventory(Human human);

    void takeItemInWardrope(Human human, String nameItem, Wardrope wardrope);

}
