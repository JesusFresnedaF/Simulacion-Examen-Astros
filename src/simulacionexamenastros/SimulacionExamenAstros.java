/*

 */
package simulacionexamenastros;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class SimulacionExamenAstros {

    private Planetas[] planetas = new Planetas[8];

    public void inicio() {
        initPlanetas();
        while (true) {
            elegirAstro();
        }
    }

    // array de objetos de los planetas del sistema solar
    public void initPlanetas() {
        planetas[0] = new Planetas(57910000, 88.0f, false, "Mercurio", 2439.7f, 1408f, 3.3e23f, 440f, 1407.6f);

        planetas[1] = new Planetas(108200000, 224.7f, false, "Venus", 6051.8f, 5832.5f, 4.87e24f, 737f, 5832.4f);

        planetas[2] = new Planetas(149600000, 365.2f, true, "Tierra", 6378.1f, 23.93f, 5.97e24f, 288f, 9.81f);
        Satelites tierra1 = new Satelites(0.00257f, 0.00257f, "Tierra", "Luna", 1737.1f, 27.3f, 7.342e22f, 220.0f, 1.6f);
        planetas[2].addSatelite(tierra1);

        planetas[3] = new Planetas(227940000, 687.0f, true, "Marte", 3396.2f, 24.62f, 6.39e23f, 210f, 3.71f);
        Satelites marte1 = new Satelites(0.00068f, 0.32f, "Marte", "Fobos", 11.1f, 7.7f, 1.08e16f, 233.0f, 0.01f);
        Satelites marte2 = new Satelites(0.00093f, 0.62f, "Marte", "Deimos", 6.2f, 30.3f, 1.8e15f, 233.0f, 0.003f);
        planetas[3].addSatelite(marte1);
        planetas[3].addSatelite(marte2);

        planetas[4] = new Planetas(778330000, 4331.0f, true, "Jupiter", 71492f, 9.93f, 1.9e27f, 165f, 24.79f);
        Satelites jupiter1 = new Satelites(0.4218f, 1.7691f, "Jupiter", "Io", 1821.6f, 1.8f, 8.9319e22f, 130.0f, 1.79f);
        Satelites jupiter2 = new Satelites(0.6711f, 3.5512f, "Jupiter", "Europa", 1560.8f, 3.6f, 4.7998e22f, 102.0f, 1.31f);
        Satelites jupiter3 = new Satelites(1.0704f, 7.1546f, "Jupiter", "Ganímedes", 2634.1f, 7.2f, 1.4819e23f, 110.0f, 1.43f);
        Satelites jupiter4 = new Satelites(1883000f, 16.689f, "Jupiter", "Calisto", 2410.3f, 16.689f, 1.08e23f, -139f, 1.235f);
        planetas[4].addSatelite(jupiter1);
        planetas[4].addSatelite(jupiter2);
        planetas[4].addSatelite(jupiter3);
        planetas[4].addSatelite(jupiter4);

        planetas[5] = new Planetas(1429400000, 10747.0f, true, "Saturno", 60268f, 10.66f, 5.68e26f, 134f, 10.44f);
        Satelites sat1_saturno = new Satelites(1843000, 0.942f, "Saturno", "Mimas", 198.2f, 0.942f, 0.381f, 64f, 0.006f);
        Satelites sat2_saturno = new Satelites(2380400, 1.371f, "Saturno", "Encélado", 252.1f, 1.371f, 1.08f, 75f, 0.012f);
        Satelites sat3_saturno = new Satelites(2947000, 1.888f, "Saturno", "Titán", 2575f, 1.888f, 1345f, 94f, 1.35f);
        planetas[5].addSatelite(sat1_saturno);
        planetas[5].addSatelite(sat2_saturno);
        planetas[5].addSatelite(sat3_saturno);

        planetas[6] = new Planetas(2870990000L, 30589.0f, true, "Urano", 25559f, 17.24f, 8.68e25f, 76f, 8.87f);
        Satelites sat1_urano = new Satelites(76400, 0.287f, "Urano", "Miranda", 235.8f, 1.414f, 0.659f, 60f, 0.079f);
        Satelites sat2_urano = new Satelites(128000, 0.675f, "Urano", "Ariel", 578.9f, 2.52f, 13.53f, 60f, 0.27f);
        Satelites sat3_urano = new Satelites(266000, 1.883f, "Urano", "Titania", 788.9f, 8.71f, 35.27f, 60f, 0.38f);
        planetas[6].addSatelite(sat1_urano);
        planetas[6].addSatelite(sat2_urano);
        planetas[6].addSatelite(sat3_urano);
        
        planetas[7] = new Planetas(4504300000L, 59800.0f, true, "Neptuno", 24764f, 16.11f, 1.02e26f, 72f, 11.15f);
        Satelites sat1_neptuno = new Satelites(354800, 0.671f, "Neptuno", "Tritón", 1353.4f, -5.88f, 214f, 38f, 0.78f);
        Satelites sat2_neptuno = new Satelites(105300, 0.295f, "Neptuno", "Nereida", 170f, 0.29f, 3.0f, 38f, 0.029f);
        Satelites sat3_neptuno = new Satelites(5268000, 360.136f, "Neptuno", "Neso", 60f, 0.936f, 9.3e-5f, 38f, 0.003f);
        planetas[7].addSatelite(sat1_neptuno);
        planetas[7].addSatelite(sat2_neptuno);
        planetas[7].addSatelite(sat3_neptuno);

    }

    public void elegirAstro() {
        int op = 0;
        System.out.println("*************************************************");
        op = leerInt("Elige entre un planeta o un satelite (0-1)");
        switch (op) {
            case 0 -> menuPlaneta();
            case 1 -> menuSatelite();
            default -> System.out.println("Error. Vuelve a intentarlo.");
        }
    }

    private void menuPlaneta() {
        mostrarPlanetas();
        int i = leerInt("Que planeta deseas ver?");
        System.out.println("1. Masa del cuerpo.");
        System.out.println("2. Diámetro del cuerpo.");
        System.out.println("3. Periodo de rotación sobre su propio eje.");
        System.out.println("4. Periodo de traslación alrededor del cuerpo al que orbitan.");
        System.out.println("5. Distancia media a ese cuerpo.");
        System.out.println("6. Cerrar.");
        int op = leerInt("Introduce una opcion (1-6): ");
        switch (op) {
            case 1 -> System.out.println("La masa de " + planetas[i].getNombre() + " es de: " + planetas[i].getMasa() + "kg.");
            case 2 -> System.out.println("El diametro de " + planetas[i].getNombre() + " es de " + planetas[i].getRadio_ecuatorial() * 2 + "km.");
            case 3 -> System.out.println("El periodo de rotacion sobre su eje es de: " + planetas[i].getRotacion_sobre_su_eje() + " horas.");
            case 4 -> System.out.println("El periodo de traslacion alrededor del cuerpo al que orbita es: " + planetas[i].getOrbita_al_sol() + " dias terrestres.");
            case 5 -> System.out.println("La distancia media al cuerpo al que orbitan es de: " + planetas[i].getDistancia_al_sol() + "km.");
            case 6 -> {
                System.out.println("Fin del programa.");
                System.exit(0);
            }
            default -> System.out.println("Error, vuelve a intentarlo.");
        }
        System.out.println("*************************************************");
    }
    
    private void mostrarPlanetas(){
        for (int i = 0; i < planetas.length; i++) {
            System.out.println(i+". "+planetas[i].getNombre());   
        }
    }

    private void menuSatelite() {
        mostrarPlanetas();
        int i = leerInt("A que planeta pertenece?");
        mostrarSatelites(i);
        int j = leerInt("Que satelite deseas ver?");
        System.out.println("1. Masa del cuerpo.");
        System.out.println("2. Diámetro del cuerpo.");
        System.out.println("3. Periodo de rotación sobre su propio eje.");
        System.out.println("4. Periodo de traslación alrededor del cuerpo al que orbitan.");
        System.out.println("5. Distancia media a ese cuerpo.");
        System.out.println("6. Cerrar.");
        int op = leerInt("Introduce una opcion (1-6): ");
        switch (op) {
            case 1 -> System.out.println("La masa de " + planetas[i].getSatelite(j).getNombre() + " es de: " + planetas[i].getSatelite(j).getMasa() + "kg.");
            case 2 -> System.out.println("El diametro de " + planetas[i].getSatelite(j).getNombre() + " es de " + planetas[i].getSatelite(j).getRadio_ecuatorial() * 2 + "km.");
            case 3 -> System.out.println("El periodo de rotacion sobre su eje es de: " + planetas[i].getSatelite(j).getRotacion_sobre_su_eje() + " días terrestres.");
            case 4 -> System.out.println("El periodo de traslacion alrededor del cuerpo al que orbita es: " + planetas[i].getSatelite(j).getOrbita_planetaria() + " dias.");
            case 5 -> System.out.println("La distancia media al cuerpo al que orbitan es de: " + planetas[i].getSatelite(j).getOrbita_planetaria() + "km.");
            case 6 -> {
                System.out.println("Fin del programa.");
                System.exit(0);
            }
            default -> System.out.println("Error, vuelve a intentarlo.");
        }
        System.out.println("*************************************************");
    }
    
    public void mostrarSatelites(int i){
        for (int j = 0; j < planetas[i].numSatelites(); j++) {
            System.out.println(j + ". " + planetas[i].getSatelite(j).getNombre());
        }
    }

    private int leerInt(String msg) {
        Scanner lt = new Scanner(System.in);
        System.out.println(msg);
        int x = lt.nextInt();
        return x;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        SimulacionExamenAstros m = new SimulacionExamenAstros();
        m.inicio();
    }

}
