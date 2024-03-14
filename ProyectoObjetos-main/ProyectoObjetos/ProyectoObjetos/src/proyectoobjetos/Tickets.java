package proyectoobjetos;

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

    public void vuelto(int recibido, int cantidadTickets) {
        vuelto = recibido - precio * cantidadTickets;
        if (vuelto < 0) {
            System.out.println("No ha pagado el precio completo del ticket");
        } else if (vuelto == 0) {
            System.out.println("Gracias, Ha pagado por completo el ticket");
        } else {
            System.out.println("Gracias, Su vuelto es de: " + vuelto);
        }
    }

    // public void AsientoDisponible(String asientoIngresado, String
    // destinoIngresado) {
    // if (asientoIngresado.equals(asiento) && destinoIngresado.equals(destino)) {
    // System.out.println("Asiento ocupado!!");
    // }else{
    // System.out.println("Ha reservado el asiento "+asientoIngresado+" con destino
    // a "+destinoIngresado);
    // }
    // }

    @Override
    public String toString() {
        return "Tickets [cantidadTickets=" + cantidadTickets + ", clase=" + clase + ", destino=" + destino + ", horario="
                + horario + ", precio=" + precio + "]";
    }

}
