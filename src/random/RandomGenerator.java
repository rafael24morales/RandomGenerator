package random;

/**
 *
 * @author rafaelm
 */
public class RandomGenerator {
    
    /**
     *Éste método random genera números aleatorios en un rango establecido de minimo y máximo
     * @param min es el número minimo del rango en el que se requiere el número a generar
     * @param max es el número máximo del rango en el que se requiere el número a generar
     * @return el número aleatorio en el rango establecido
     * @throws MinimosYMaximosException al establecer mal el rango, lanza una excepción
     */
    public static long random(long min, long max) throws MinimosYMaximosException{   
        
        /*
        Al ser el número minimo igual o más grande que el máximo, se ejecuta una excepción
        pues el rango no es válido
        */
        if(min >= max){
            
            throw new MinimosYMaximosException("Mínimo es más grande o igual a Máximo");
        }else{
            //el valor de x es la diferencia en el rango
            long x = (max - min) + 1;
            /* se toman los milisegundos que se ejecuta ésta línea según el sistema
                    y es calculado el módulo con el número máximo del rango, ésto para generar
                    el número entre 0 y el máximo.
            */
            float random =  System.currentTimeMillis() % max ;
            /*
                finalmente se acota el número en el rango establecido con anterioridad y se recorre 
                en desfase (sumando el mínimo), ésta línea es retornada por el método para objeter el resultado.
            */
            return ((long)random % x) + min;
        }
    }
    
}
