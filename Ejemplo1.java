public class Ejemplo1 {
    public static void main(String[] args) throws Exception {
        Room c01 = new Room();
        Room c02 = new Room();
        // Referenciar los atributos
        c01.ancho=4.5f;
        c01.largo=5.5f;
        c01.color = "Verde - Naranja";
        c01.tieneCieloRaso = true;
        c01.tipoAcodicionamientoAmbiental = "Aire";
        c01.tienePuerta=true;
        c01.tieneLuzElectrica = true;
        c01.tipodePiso = "Porcelanato";
        // Referenciar los métodos
        c01.imprimir();
        c02.imprimir();
    }
}
