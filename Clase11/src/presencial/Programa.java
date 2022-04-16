package presencial;

public class Programa {
    public static void main(String[] args) {
        ImpresoraCannon i1 = new ImpresoraCannon();
        System.out.println(i1.imprimir());
        ImpresoraEpson i2 = new ImpresoraEpson();
        System.out.println(i2.imprimir());
        Impresora i3 = new ImpresoraCannon();
       // i3.soloCannon; ASI NO ME DEJARIA
        //((ImpresoraCannon)i3).soloCannon(); ASI QUEDA CASTEADO Y FUCIONA, LE INDICA QUE TIENE QUE TRATARLO COMO IMPCANNON
        System.out.println(i3.imprimir());
        //Object i3 = new ImpresoraCannon() ESTO SIRVE PARA INSTANCIARLO COMO SI FUERA UN OBJET, NO ME DEJARIA USAR LOS METODOS ESPECIFICOS DE IMPRESORA O LOS OTROS A MENOS QUE LOS CASTEE
    }
}