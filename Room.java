public class Room {
    // Atributos  -- Variables (Se declaran al nivel de la clase)
    public float largo;
    public float ancho;
    public String color;
    public boolean tieneCieloRaso;
    public String tipoAcodicionamientoAmbiental;
    public boolean tienePuerta;
    public boolean tieneLuzElectrica;
    public String tipodePiso;
    // Métodos -- Funciones
    public void imprimir() {
        System.out.printf("Tamaño                      : %.2fx%.2f%n",largo,ancho);
        System.out.printf("Color                       : %s%n",color);
        System.out.printf("Acondicionamiento ambiental : %s%n",tipoAcodicionamientoAmbiental);
        System.out.printf("Tipo de piso                : %s%n",tipodePiso);
        if(tieneCieloRaso)
            System.out.println("Cielo Raso    : Si");
        else
            System.out.println("Cielo Raso    : No");
        if(tienePuerta)
            System.out.println("Con puerta    : Si");
        else
            System.out.println("Con puerta    : No");
        if(tieneLuzElectrica)
            System.out.println("Luz eléctrica : Si");
        else
            System.out.println("Luz eléctrica : No");
    }
}
