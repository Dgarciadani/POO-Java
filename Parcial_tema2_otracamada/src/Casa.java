public class Casa extends Proyecto{
    private Double superficieTerreno;
    private Integer cantidadBaños;
    private Integer cantidadDormitorios;

    public Casa(Integer numeroProyecto, String nombreProyecto, String ciudad, String status, Double superficieTerreno, Integer cantidadBaños, Integer cantidadDormitorios) {
        super(numeroProyecto, nombreProyecto, ciudad, status);
        this.superficieTerreno = superficieTerreno;
        this.cantidadBaños = cantidadBaños;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
