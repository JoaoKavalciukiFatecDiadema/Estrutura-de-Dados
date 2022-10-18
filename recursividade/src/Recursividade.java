public class Recursividade {
    
    public static int somaRecursiva(int n){
         if(n>1){
            return somaRecursiva((n-1))+n;
         }

         return n;
    }

    public static int fatorialRecursivo(int n){
        if(n>1){
            return fatorialRecursivo((n-1))*n;
        }
        return n;
    }

    public static double somaDeFração(int n){
        if(n >= 2){
            return somaDeFração(n/2) + 1.0/n;
        }
        return n;
    }
}
