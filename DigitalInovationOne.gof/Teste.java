

public class Teste {
    
    private static final char[] lazy = null;

    /**
     * @param args
     * @param singletronLazy
     * @param instancia 
     */
    @SuppressWarnings("static-access")
    public static void main(String[] args, singletronLazy singletronLazy, singletronLazy instancia) {
        singletronLazy = instancia;
        System.out.println(lazy);
        singletronLazy = singletronLazy.getInstancia();
        System.out.println(lazy);

    }
}
