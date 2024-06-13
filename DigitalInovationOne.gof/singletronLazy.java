
/**
 * 
 * singletron "preguiçoso"
 * 
 * @author cristopheroan
 */

public class singletronLazy {

        private static singletronLazy instancia;

        private singletronLazy() {
            super();
        }

        public static singletronLazy getInstancia() {
            if (instancia == null) {
                instancia = new singletronLazy();
            }
            return instancia;
        }
    
}
