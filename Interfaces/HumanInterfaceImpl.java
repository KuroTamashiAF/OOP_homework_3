package Interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ObjectClasses.Human;
import ObjectClasses.Items;

public class HumanInterfaceImpl implements HumanInterface{
    Map<Human, ArrayList<Items>> HumanWithItems;
        
public HumanInterfaceImpl() {
    HumanWithItems = new HashMap<>();
}

@Override
public void CheckIfTheWardropeIsOpen() {
    
    
}
        

    
    
}
