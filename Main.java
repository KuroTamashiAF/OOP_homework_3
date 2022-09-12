import ObjectClasses.Wardrope;

public class Main {
    public static void main(String[] args) {
        Wardrope wardrope1 = new Wardrope(10);
        System.out.println(wardrope1.getwardropeIsOpen());
        wardrope1.setOpenWardrope(true);
        System.out.println(wardrope1.getwardropeIsOpen());

    }
}
