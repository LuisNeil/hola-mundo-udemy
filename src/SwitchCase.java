public class SwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "Luis";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Luis":
                System.out.println("Hola Luis");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
