package Academy;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){};

    public static OfertaAcademicaFactory getInstance(){
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OferaAcademica crearOfertaAcademica(String oferaAcademica){
        switch(oferaAcademica){
            case "Curso":
                return new Curso();
            case "ProgramaIntensivo":
                return new ProgramaIntensivo();
                default:
                    return null;
        }

    }
}
