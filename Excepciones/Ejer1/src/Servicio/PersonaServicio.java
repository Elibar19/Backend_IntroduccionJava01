package Servicio;
    import Entidades.Persona;

    import java.util.Scanner;

    public class PersonaServicio {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        public boolean esMayorDeEdad(Persona persona) throws Exception {

            if (persona == null) {
                throw new Exception("La informacion de la persona no existe");
            }
            return persona.getEdad() >=18;
        }

        public Persona crearPersona() {

            Persona persona = new Persona();
            System.out.println("Ingrese su nombre: ");
            persona.setNombre(leer.next());
            System.out.println("Ingrese su edad");
            persona.setEdad(leer.nextInt());
            System.out.println("Ingrese su sexo (\"Elija H si es hombre, M si es mujer y O para otro)\"");
            String sexo = leer.next();
            while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
                System.out.println("Sexo incorrecto. Inténtelo de nuevo.");
                System.out.print("Ingrese el sexo (H, M, O): ");
                sexo = leer.next();
            }
            persona.setSexo(sexo);
            System.out.println("Ingrese su peso");
            persona.setPeso(leer.nextDouble());
            System.out.println("Ingrese su altura");
            persona.setAltura(leer.nextDouble());

            return persona;
        }

        public int calcularIMC(Persona persona) throws Exception {
            int res = 0;
            if (persona == null) {
                throw new Exception("La informacion de la persona esta vacia");
            }
            double pesoIdeal = persona.getPeso() / Math.pow(persona.getAltura(), 2);
            if (pesoIdeal < 20) {
                res = -1;
            }
            if (pesoIdeal >= 20 && pesoIdeal <= 25) {
                res = 0;
            }
            if (pesoIdeal > 25) {
                res = 1;
            }
            return res;
        }

        public String pesoIdeal(int pesoideal) {
            String pesoIdeal = "";
            if (pesoideal == -1) {
                pesoIdeal = " y se encuentra por debajo del peso ideal";
            }
            if (pesoideal == 0) {
                pesoIdeal = " y se encuentra en su peso ideal";
            }
            if (pesoideal == 1) {
                pesoIdeal = " y tiene sobrepeso";
            }
            return pesoIdeal;
        }

        public int[] calcularIMCPersonas(int[] datosimc) {
            int[] resultadoIMC = new int[3]; // [0]: por debajo del peso ideal, [1]: en el peso ideal, [2]: con sobrepeso
            for (int i = 0; i < 2; i++) {
                int resultado = datosimc[i];
                switch (resultado) {
                    case -1:
                        resultadoIMC[0]++;
                        break;
                    case 0:
                        resultadoIMC[1]++;
                        break;
                    default:
                        resultadoIMC[2]++;
                        break;
                }
            }
            return resultadoIMC;
        }

        public void calcularPorcentajeIMC(int[] resultadoIMC) {
            double[] porcentajeIMC = new double[3];

            int totalPersonas = resultadoIMC[0] + resultadoIMC[1] + resultadoIMC[2];

            porcentajeIMC[0] = ((double) resultadoIMC[0] / totalPersonas) * 100.0;
            porcentajeIMC[1] = ((double) resultadoIMC[1] / totalPersonas) * 100.0;
            porcentajeIMC[2] = ((double) resultadoIMC[2] / totalPersonas) * 100.0;
            System.out.println("");
            System.out.println("Porcentaje de personas debajo de su peso ideal: " + porcentajeIMC[0]);
            System.out.println("Porcentaje de personas en su peso ideal: " + porcentajeIMC[1]);
            System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeIMC[2]);
            System.out.println("");

        }

        public void calcularPorcentajeMayoresDeEdad(Persona[] personas) throws Exception {
            int totalPersonas = personas.length;
            int contadorMayoresDeEdad = 0;

            for (int i = 0; i < totalPersonas; i++) {
                if (personas[i] != null && esMayorDeEdad(personas[i])) {
                    contadorMayoresDeEdad++;
                }
            }

            System.out.println("\n\nEl porcentaje de mayoría de edad es: " + (contadorMayoresDeEdad / totalPersonas) * 100.0);
        }
    }
