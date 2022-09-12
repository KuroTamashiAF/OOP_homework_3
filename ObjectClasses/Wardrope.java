package ObjectClasses;

/**
 * Wardrope
 */
public class Wardrope {
    private static int idSequence = 1;
    private int volume;
    private int id;
    private boolean OpenWardrope;

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


}