public class main {
    public static void main(String[] args) {
        Construccion construccion1 = new Construccion("calle falsa123",2303,2505,2505);
        Construccion construccion2 = new Construccion("calle falsa123",2303,2012,2505);
        Departamento depto1 = new Departamento(01,"Proyecto1","cba","Finalizado",23,5);
        Departamento depto2 = new Departamento(02,"Proyecto2","cba","Finalizado",10,8);
        System.out.println(depto1.compareTo(depto2));
        System.out.println(depto1.esRascacielos());
        System.out.println(depto2.esRascacielos());


        System.out.println(depto1.finalizoEnFecha());
        System.out.println(depto2.finalizoEnFecha());
    }

}
