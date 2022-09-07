import javax.crypto.spec.DESKeySpec;

public class App {
    public static void main(String[] args) throws Exception {
       Stack palavra = new Stack(10);

       palavra.push('F');
       palavra.push('E');
       palavra.push('L');
       palavra.push('I');
       palavra.push('C');
       palavra.push('I');
       palavra.push('D');
       palavra.push('A');
       palavra.push('D');
       palavra.push('E');

       System.out.println(palavra);

       Stack palavraInvertida = new Stack(palavra.size);

       for(int i = palavra.size-1; i>=0; i--){
            palavraInvertida.push(palavra.peek());
            palavra.pop();
       }
       System.out.println(palavraInvertida);
    }
}
