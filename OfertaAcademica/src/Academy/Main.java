package Academy;

public class Main {
    public static void main(String[] args) {
        OferaAcademica cursoFront = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        cursoFront.setNombre("FrontEnd");
        cursoFront.setDescripcion("FrontEnd");
        ((Curso)cursoFront).setCargaHorariaMensual(2);
        ((Curso)cursoFront).setDuracionMeses(16);
        ((Curso)cursoFront).setValorHora(1000);

        OferaAcademica cursoBack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        cursoBack.setNombre("Back");
        cursoBack.setDescripcion("Back");
        ((Curso)cursoBack).setCargaHorariaMensual(2);
        ((Curso)cursoBack).setDuracionMeses(900);
        ((Curso)cursoBack).setValorHora(20);

        OferaAcademica fullStack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("Full");
        fullStack.setDescripcion("Full/ Front+Back");
        ((ProgramaIntensivo)fullStack).setPorcentajeBonificacion(.20);

        ((ProgramaIntensivo) fullStack).agregarOfertaAcademica(cursoFront);
        ((ProgramaIntensivo) fullStack).agregarOfertaAcademica(cursoBack);

        Instituto dh = new Instituto("Digital House");
        dh.agregarOfertaAcademica(cursoFront);
        dh.agregarOfertaAcademica(cursoBack);
        dh.agregarOfertaAcademica(fullStack);
        System.out.println("INFORME DE OFERTAS DISPONIBLE");
        dh.generarInforme();


    }
}
