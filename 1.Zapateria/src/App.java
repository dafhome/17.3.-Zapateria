import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Casual> tiendaCasual = new ArrayList<>();
        ArrayList<Deporte> tiendaDeporte = new ArrayList<>();
        ArrayList<Elegante> tiendaElegante = new ArrayList<>();

        tiendaCasual.add(new Casual("Vans", "Skooll", "Piel", 45, 59.99));
        tiendaCasual.add(new Casual("Converse", "Taylor", "Tela", 44.5, 89.99));

        tiendaDeporte.add(new Deporte("Nike", "Air Force", "Piel", 43.5, 89.95));
        tiendaDeporte.add(new Deporte("Puma", "Mayze", "Sintetico", 41, 29.95));

        tiendaElegante.add(new Elegante("Boss", "BRANDON_TENN_SD", "Ante", 45, 129.95));
        tiendaElegante.add(new Elegante("Martinelli", "Buchel", "Piel", 44, 112.95));

        for (int i = 0; i < tiendaCasual.size(); i++) {
            System.out.println(tiendaCasual.get(i));
            ;
            System.out.println(tiendaDeporte.get(i));
            ;
            System.out.println(tiendaElegante.get(i));
            ;
        }

        System.out.println();
        System.out.println("Que tipo de zapatos quieres comprar?\n1-CASUAL\n2-DEPORTIVOS\n3-ELEGANTES");
        int opcion;
        String modelo;
        opcion = scan.nextInt();
        scan.nextLine();
        int contador = 0;
        boolean validar = false;
        double total = 0f;
        while (!validar) {
            System.out.println("¿Que modelo quieres comprar? Indica salir para terminar.");
            modelo = scan.nextLine();
            if (modelo.equalsIgnoreCase("salir")) {
                validar = true;
            } else {
                if (opcion == 1) {
                    for (int i = 0; i < tiendaCasual.size(); i++) {
                        if (tiendaCasual.get(i).getModelo().equalsIgnoreCase(modelo)) {
                            total += tiendaCasual.get(i).getPrecio();
                            System.out.println(tiendaCasual.get(i).getMarca() + " se ha añadido a la cesta.");
                            contador++;
                        }
                    }
                } else if (opcion == 2) {
                    for (int i = 0; i < tiendaDeporte.size(); i++) {
                        if (tiendaDeporte.get(i).getModelo().equalsIgnoreCase(modelo)) {
                            total += tiendaDeporte.get(i).getPrecio();
                            System.out.println(tiendaDeporte.get(i).getMarca() + " se ha añadido a la cesta.");
                            contador++;
                        }
                    }
                } else if (opcion == 3) {
                    for (int i = 0; i < tiendaElegante.size(); i++) {
                        if (tiendaElegante.get(i).getModelo().equalsIgnoreCase(modelo)) {
                            total += tiendaElegante.get(i).getPrecio();
                            System.out.println(tiendaElegante.get(i).getMarca() + " se ha añadido a la cesta.");
                            contador++;
                        }
                    }
                } else
                    System.out.println("Lo siento pero la clase de zapato elegida no la tenemos todavía.");
            }

        }
        System.out.println("Llevas " + contador + " zapatos, el total de la cesta son " + total + "€");
        System.out.println("Gracias por venir!");
        scan.close();
    }
}
// Primero se pregunta al usuario qué tipo de zapato quiere comprar, del tipo:
// "Que tipo de zapatos quieres comprar?\n1-ELEGANTES\n2-CASUAL\n3-DEPORTIVOS"

// Luego se pregunta al usuario qué modelo quiere comprar. Lo que vale ese
// modelo, se va sumando al
// gastoTotal, y se sigue preguntando qué modelo quiere comprar hasta que
// escribe ‘salir’.

// Cuando sale, se le da el gasto total y un mensaje de ‘hasta la próxima’. El
// gasto total también se
// puede ir mostrando dentro del bucle mientras se va sumando.
