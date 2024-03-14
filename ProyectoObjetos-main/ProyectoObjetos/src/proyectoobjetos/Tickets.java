/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Tickets {

    private double precio;
    private double vuelto;
    private String clase;
    private int cantidadTickets;
    private String destino;
    private String horario;

    public Tickets(double precio, String clase, int cantidadTickets, String destino, String horario) {
        this.precio = precio;
        this.clase = clase;
        this.cantidadTickets = cantidadTickets;
        this.destino = destino;
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public String getHorario() {
        return horario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVuelto() {
        return vuelto;
    }

    public String getDestino() {
        return destino;
    }

    public String clase() {
        return clase;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void vuelto(double recibido, int cantidadTickets) {
        if (recibido < (precio * cantidadTickets)) {
            JOptionPane.showMessageDialog(null, "No ha pagado el precio completo del ticket");
            return;
        }

        vuelto = recibido - (precio * cantidadTickets);
        if (vuelto < 0) {
            JOptionPane.showMessageDialog(null, "No ha pagado el precio completo del ticket");
        } else if (vuelto == 0) {
            JOptionPane.showMessageDialog(null, "Gracias, Ha pagado por completo el ticket");
        } else {
            JOptionPane.showMessageDialog(null, "Gracias, Su vuelto es de: " + vuelto);
        }
    }

    public double getTotalPrice() {
        return precio * cantidadTickets;
    }

    @Override
public String toString() {
        return "Tickets [cantidadTickets=" + cantidadTickets + ", clase=" + clase + ", destino=" + destino + ", horario="
                + horario + ", precio=" + precio + "]";
    }
}
