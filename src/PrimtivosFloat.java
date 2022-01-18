public class PrimtivosFloat {

    public static void main(String[] args) {

        float realFloat = 2.12e3F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float correspnode en byte a = "+ Float.BYTES);
        System.out.println("float corresponde en bites a = "+Float.SIZE);
        System.out.println("max value para float = "+Float.MAX_VALUE);
        System.out.println("min value para float = "+Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double correspnode en byte a = "+ Double.BYTES);
        System.out.println("double corresponde en bites a = "+Double.SIZE);
        System.out.println("max value para double = "+Double.MAX_VALUE);
        System.out.println("min value para double = "+Double.MIN_VALUE);
        
        var varFloat = 3.1416f;
        System.out.println("varFloat = " + varFloat);
    }
}
