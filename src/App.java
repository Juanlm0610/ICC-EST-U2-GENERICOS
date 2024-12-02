import models.Persona;
import models.Genericos.Caja;
import models.Genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(20);

        Par<Integer, String> par1 = new Par<>();
        Par<Integer, String> par2 = new Par<>();

        par1.setClave(2);
        par1.setValor("Hola");

        par2.setClave(24334);
        par2.setValor("a");

        Persona[] personas = {
            new Persona("Pepe", 34),
            new Persona("Juan", 30),
            new Persona("Edmundo", 22),
            new Persona("Carlos", 12),
            new Persona("Gilberto", 87),
            new Persona("Fernando", 10),
            new Persona("Pedro", 8),
            new Persona("Miguel", 52),
            new Persona("Jorge", 20),
            new Persona("Alejandra", 56)
        };

        System.out.println("Clave: " + par1.getClave() + " /// Valor: " + par1.getValor());
        System.out.println("Clave: " + par2.getClave() + " /// Valor: " + par2.getValor());

        cajaString.setObjeto("No te duermas EstebanQuito");
        cajaInteger.setObjeto(10);
        cajaPersona.setObjeto(persona);

        System.out.println(cajaInteger.getObjeto());
        System.out.println(cajaString.getObjeto());
        System.out.println(cajaPersona.getObjeto().getEdad());
        System.out.println(cajaPersona.getObjeto().getNombre());
        
        ////////////////////////////////////////////////////////////////////////

        Par<Integer, String>[] parMenores = new Par[10];
        Par<String, Integer>[] parMayores = new Par[10];
        int cont1 = 0, cont2 = 0;

        for (Persona p : personas) {
            Par<Integer, String> parMenor = new Par<>();
            Par<String, Integer> parMayor = new Par<>();

            if (p.getEdad() < 18) {
                parMenor.setClave(p.getEdad());
                parMenor.setValor(p.getNombre());
                parMenores[cont1] = parMenor;
                cont1++;
            } else {
                parMayor.setClave(p.getNombre());
                parMayor.setValor(p.getEdad());
                parMayores[cont2] = parMayor;
                cont2++;
            }
        }

        System.out.println("\nPersonas menores de edad:");
        for (Par<Integer, String> par : parMenores) {
            if (par != null) {
                System.out.println("Clave (Edad): " + par.getClave() + ", Valor (Nombre): " + par.getValor());
            }
        }

        System.out.println("\nPersonas mayores de edad:");
        for (Par<String, Integer> par : parMayores) {
            if (par != null) {
                System.out.println("Clave (Nombre): " + par.getClave() + ", Valor (Edad): " + par.getValor());
            }
        }
    }
}
