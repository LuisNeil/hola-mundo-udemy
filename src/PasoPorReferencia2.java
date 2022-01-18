class Persona{
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}

public class PasoPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Luchito");
        System.out.println("Iniciamos el metodo main");
        System.out.println(persona.getNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println(persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Luis Neil Tejeda Lopez");

    }
}
