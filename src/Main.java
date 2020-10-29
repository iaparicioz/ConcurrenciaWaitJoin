import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        try{
            while(true){
                Cliente cliente = new Cliente();
                Camarero camarero = new Camarero();
                // Es importante que empiece el camarero ya que se queda esperando.
                cliente.start();
                cliente.join();
                camarero.start();
                camarero.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}

