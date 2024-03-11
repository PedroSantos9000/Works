import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[]args){
        /*ArrayList<Integer> numeros =  new ArrayList<>();
        Random sc = new Random();

        for (int i =0; i<10; i++){
            numeros.add(sc.nextInt(30));
        }

        System.out.println(numeros.size());*/

        Banco imobiliario = new Banco();
        Conta c1= new Conta();
        c1.setNumero("00001");
        c1.setSaldo(20000);
        c1.setTitular("guilherme henrique");

        Conta c2= new Conta();
        c2.setNumero("00002");
        c2.setSaldo(10000);
        c2.setTitular("lucas");

        Conta c3= new Conta();
        c3.setNumero("00002");
        c3.setSaldo(10000);
        c3.setTitular("lucas");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
}
