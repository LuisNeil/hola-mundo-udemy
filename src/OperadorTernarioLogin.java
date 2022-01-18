import java.util.Scanner;

public class OperadorTernarioLogin {
    public static void main(String[] args) {

        String[] usernames = {"luisneil","admin","pepe"};
        String[] passwords = {"123","1234","12345"};
        /*usernames[0] = "luisneil";
        passwords[1] = "12345";
        usernames[0] = "admin";
        passwords[1] = "54321";*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();

        System.out.println("Ingrese el password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }
            /*if( (usernames[i].equals(u) && passwords[i].equals(p))  ){
                esAutenticado = true;
                break;
            }
        }*/


        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : 
                "username o contraseña incorrectos\nLo siento, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("username o contraseña incorrectos");
            System.out.println("Lo siento, requiere autenticacion");
        }*/
    }
}
