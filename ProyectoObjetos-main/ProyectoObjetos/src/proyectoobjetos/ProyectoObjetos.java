/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoobjetos;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoObjetos {

    static Scanner duki = new Scanner(System.in);
    static Random rndm = new Random();
    static ArrayList<Tickets> tickets = new ArrayList<Tickets>();

    public static void main(String[] args) {
        AV x =new AV();
        x.setVisible(true);
//        JOptionPane.showMessageDialog(null,
//                "Bienvenido, te hemos contratado por un dia\npara gestionar un puesto de tickets para la areolina BB8");
//        JOptionPane.showMessageDialog(null,
//                "*****INFORMACION*****\n>Cada ticket tiene un valor de $9.99\n>Solamente se puede seleccionar un asiento por persona"
//                        + "\n>Si desean comprar mas de un ticket tendra que decirlo");
//        // menu
//        int n;
//        do {
//            String opt[] = {"Comprar Ticket", "Asientos Disponibles", "Salir"};
//            n = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Menu", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.QUESTION_MESSAGE, null, opt,opt[0]);
//            switch (n) {
//                case 0:
//                    comprarTicket();
//                    break;
//                case 1:
//                    if (tickets.size() == 0) {
//                        JOptionPane.showMessageDialog(null, "No se han creado tickets");
//                    } else {
//                        verVuelos();
//                    }
//                    break;
//               case 2:
//                    JOptionPane.showMessageDialog(null, "Gracias por su tiempo");
//                    break;
//            }
//        } while (n != 2);
//
//    }
//
//    public static void comprarTicket() {
//        String[] opciones = {"Madrid", "Buenos Aires", "New York", "Londres"};
//        int n = JOptionPane.showOptionDialog(null, "Seleccione su destino", "Destino", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//
//        if (n == -1) {
//            JOptionPane.showMessageDialog(null, "Ha seleccionado una opcion invalida");
//            return;
//        }
//
//        String[] opciones1 = {"9:00am", "6:00pm"};
//        int n1 = JOptionPane.showOptionDialog(null, "Seleccione su horario", "Horario", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE, null, opciones1, opciones1[0]);
//
//        if (n1 == -1) {
//            JOptionPane.showMessageDialog(null, "Ha seleccionado una opcion invalida");
//            return;
//        }
//
//        String[] opciones2 = {"Primera Clase", "Turista", "Economico"};
//        int n2 = JOptionPane.showOptionDialog(null, "Seleccione su clase", "Clase", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
//
//        if (n2 == -1) {
//            JOptionPane.showMessageDialog(null, "Ha seleccionado una opcion invalida");
//            return;
//        }
//
//        double precio;
//        if (n2 == 1) {
//            precio = 9.99;
//        } else if (n2 == 2) {
//            precio = 7.99;
//        } else {
//            precio = 12.99;
//        }
//
//        try {
//            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos tickets desea comprar?"));
//            if (cantidad <= 0) {
//                JOptionPane.showMessageDialog(null, "La cantidad de tickets debe ser mayor a cero");
//                return;
//            }
//            tickets.add(new Tickets(precio, opciones2[n2], cantidad, opciones[n], opciones1[n1]));
//        } catch (Exception NumberFormatException) {
//            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero");
//        }
//    }
//
//    public static void verVuelos() {
//        if (tickets.size() == 0) {
//            JOptionPane.showMessageDialog(null, "No se han creado tickets");
//            return;
//        }
//
//        for (int i = 0; i < tickets.size(); i++) {
//            JOptionPane.showMessageDialog(null,
//                    "Destino: " + tickets.get(i).getDestino() + "\nHorario: " + tickets.get(i).getHorario()
//                            + "\nClase: " + tickets.get(i).clase() + "\nCantidad de tickets: "
//                            + tickets.get(i).getCantidadTickets() + "\nPrecio total: "
//                            + tickets.get(i).getTotalPrice());
//        }
//
    }

}