public class Comentário {
    public static void main(String[] args) throws Exception {
        //Olá , eu sou um comentário em uma única linha
        
        /*Eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário
         */
        
        /**
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */

        /*
         * Este método foi elaborado às pressas
         * por isso eu abreviei o nome das variáveis
         * mas olha,  ele tem a finalidade somar ou multiplicar
         * dois números
         */

         public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if(m = "M"){ //M = multiplicação
                r = n * x;
            }else{
                //se não soma mesmo
                r = n + x;
            }
            retun r;
        }

        System.out.println("Hello, World!");
    }
}
