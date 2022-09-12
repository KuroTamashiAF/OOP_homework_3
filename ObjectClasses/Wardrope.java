package ObjectClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Wardrope
 */
public class Wardrope {
    private static int idSequence = 1;
    //private int volume;
    private int id;
    private boolean OpenWardrope = false;
    private List<Items> volume;

    public Wardrope() {
        //this.volume = vol;
        this.id  = idSequence++;
        this.volume = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    // public int getVolume() {
    //     return volume;
    //}
    public boolean getwardropeIsOpen(){
     return this.OpenWardrope;
    }
    public void setOpenWardrope(boolean openWardrope) {
        OpenWardrope = openWardrope;
    }
    public List<Items> getVolume() {
        return volume;
    }
}