package Interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ObjectClasses.Human;
import ObjectClasses.Items;
import ObjectClasses.Wardrope;
//import Interfaces.HumanInterface;

public class HumanInterfaceImpl implements HumanInterface {

    Map<Human, ArrayList<Items>> HumanWithItems;

    public HumanInterfaceImpl() {
        HumanWithItems = new HashMap<>();
    }

    // @Override
    public void CheckIfTheWardropeIsOpen(Wardrope wardrope) {
        if (wardrope.getwardropeIsOpen() == false) {
            System.out.println("The closet is closed. Open? (yes/no)");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "yes":
                    wardrope.setOpenWardrope(true);
                    System.out.println("Closet is open, you can put in somethink");
                    break;
                case "no":
                    System.out.println("Closet is closed");
                    break;
                case default:
                    System.out.println("Enter yes/no");
                    break;

            }

        }

    }

    @Override
    public void TakeItem(Human human, Items item) {
        if (HumanWithItems.containsKey(human)) {
            HumanWithItems.get(human).add(item);
        } else {
            List<Items> foradding = new ArrayList<>();
            foradding.add(item);
            HumanWithItems.put(human, (ArrayList<Items>) foradding);
        }

    }

    @Override
    public void ShowInventory(Human human) {
        System.out.println("on Human:");
        for (Items item : HumanWithItems.get(human)) {
            System.out.println(item);
        }
    }

    @Override
    public void takeItemInWardrope(Human human, String nameItem, Wardrope wardrope) {

        int index = 0;
        for (Items item : HumanWithItems.get(human)) {
            if (item.getName() == nameItem) {
                break;
            } else {
                index++;
            }
        }
        wardrope.getVolume().add(HumanWithItems.get(human).get(index));
        HumanWithItems.get(human).remove(index);

    }

    @Override
    public void ShowWardrope(Wardrope eWardrope) {
        System.out.println("In Wardrope:");
        for (Items item : eWardrope.getVolume()) {
            System.out.println(item);
            
        }
        
        
    }

}
