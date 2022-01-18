public class Caracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("max value para char = " + Character.MAX_VALUE);
        System.out.println("min value para char = " + Character.MIN_VALUE);
    }
}
