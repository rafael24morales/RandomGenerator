package random;


import java.util.concurrent.TimeUnit;
/**
 *
 * @author rafaelm
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, MinimosYMaximosException {
        
        for(int x = 0; x<100; x++){
            
            long resultado = RandomGenerator.random(1,5);
            System.out.println(resultado);
            
            TimeUnit.MICROSECONDS.sleep(resultado);
        }
    }
    
}
