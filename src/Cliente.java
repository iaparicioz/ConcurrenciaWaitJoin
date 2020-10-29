public class Cliente extends Thread {


    @Override
    public void run() {

        while (!Main.list.isEmpty()) {
            try {
                System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
                Main.list.remove(0);
                sleep(300);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente - Voy a esperar a que me traigan comida...");
    }
}

