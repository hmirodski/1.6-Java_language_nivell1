package exercici2;

public class GenericMethods {

    public <T, U, V> void showGenericMethods(T first, U second, V third) {
        System.out.println("1: " + first);
        System.out.println("2: " + second);
        System.out.println("3: " + third);
    }
}
