public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println(numeroByte);
        System.out.println("tipo byte corresponde en byte "+ Byte.BYTES);
        System.out.println("tipo byte corresponde en bites "+ Byte.SIZE);
        System.out.println("max value de un byte: "+ Byte.MAX_VALUE);
        System.out.println("min value de un byte: "+ Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte "+ Short.BYTES);
        System.out.println("tipo short corresponde en bites a "+Short.SIZE);
        System.out.println("max value de un short: "+Short.MAX_VALUE);
        System.out.println("min value de un short: "+Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte "+ Integer.BYTES);
        System.out.println("tipo int corresponde en bites a "+Integer.SIZE);
        System.out.println("max value de un int: "+Integer.MAX_VALUE);
        System.out.println("min value de un int: "+Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte "+ Long.BYTES);
        System.out.println("tipo long corresponde en bites a "+Long.SIZE);
        System.out.println("max value de un long: "+Long.MAX_VALUE);
        System.out.println("min value de un long: "+Long.MIN_VALUE);

        var numeroVar = 2147483648L;
        var sentencia = "palabra";


    }
}
