public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j++ = " + j++);
        System.out.println("++j = " + ++j);
    }
}
