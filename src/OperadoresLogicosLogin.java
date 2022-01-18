import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "luisneil";
        passwords[1] = "12345";
        usernames[0] = "admin";
        passwords[1] = "54321";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if( (usernames[i].equals(u) && passwords[i].equals(p))  ){
                esAutenticado = true;
                break;
            }
        }


        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("username o contraseña incorrectos");
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}
