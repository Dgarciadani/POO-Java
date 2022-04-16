public class ClienteException extends  Exception {
    public ClienteException(String message){
        super(message);

    }
    @Override
    public String toString(){
        return "Algo salio muy muy mal";
    }

}
