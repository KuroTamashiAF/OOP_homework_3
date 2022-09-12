package ObjectClasses;

/**
 * Wardrope
 */
public class Wardrope {
    private static int idSequence = 1;
    private int volume;
    private int id;
    private boolean OpenWardrope = false;

    public Wardrope(int vol) {
        this.volume = vol;
        this.id  = idSequence++;
    }
    public int getId() {
        return id;
    }
    public int getVolume() {
        return volume;
    }
    public boolean getwardropeIsOpen(){
     return this.OpenWardrope;
    }
    public void setOpenWardrope(boolean openWardrope) {
        OpenWardrope = openWardrope;
    }
}