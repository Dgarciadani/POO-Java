public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona("manolo","castillo",231234,43);
        Persona per2 = new Persona("juan","arturo",23451234,23);
        ContratoMensual contraMen1 = new ContratoMensual(34,2019,false,per1,48.0,234,"jefe");
        ContratoMensual contraMen2 = new ContratoMensual(34,2019,true,per2,485.0,2341,"encargado");
        System.out.println(contraMen1.esJefe());
        ContratoHora contraHora1 = new ContratoHora(23,2020,false,per1,23,15.5);
        ContratoHora contraHora2 = new ContratoHora(23,2020,true,per2,231,15.51);
        System.out.println(contraHora1.compareTo(contraHora2));
        System.out.println(contraHora2.incorporarTrabajo());
        System.out.println(contraHora1.incorporarTrabajo());

    }
}
