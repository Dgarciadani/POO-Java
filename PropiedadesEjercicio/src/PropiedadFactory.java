public class PropiedadFactory {
    //patron 1
    private static PropiedadFactory instance;
    //patron 2
    private PropiedadFactory() {}

    //patron 3
    public  static PropiedadFactory getInstance(){
        if ( instance ==null){
            instance = new PropiedadFactory();
        }
        return instance;
    };
public Propiedad crearPropiedad(String nombrePropiedad){
    switch(nombrePropiedad){
        case "Av. San Martin":
            return new Casa("Av. San Martin", 130,500);
        case "Mitre":
            return new Casa("Mitre",233,700);

        case "Gutierres":
            BarrioCerrado barrioCerrado = new BarrioCerrado("Gutierres",300);
            barrioCerrado.agregarPropiedad(new Casa("Av. San Martin", 130,500));
            barrioCerrado.agregarPropiedad(new Casa("Mitre",233,700));
            default:
                return null;
    }
}
}
