public class ListaDeInteiro{
    private int dados[];
    private int tamanho;
 
    public ListaDeInteiro(int capacidade){
       dados = new int[capacidade];
       tamanho=0;
    }
 
    public void adicionaInicio(int element) throws Exception{
        if(this.tamanho == dados.length){   
            throw new Exception("Lista cheia");
        }

        tamanho++;
        for(int i = tamanho-1; i>=1; i--){
            dados[i] = dados[i-1];
        }

        dados[0] = element;
    }

    public void adicionaFinal(int element) throws Exception{
        if(this.tamanho == this.dados.length){
            throw new Exception("Lista vazia");
        }

        dados[tamanho] = element;
        tamanho++;
    }


    public int removeInicio() throws Exception{
        int  resposta = -1;

        if(this.tamanho == 0){
            throw new Exception("Lista vazia");
        }

        resposta = dados[0];

        for(int i = 0; i<tamanho; i++){
            dados[i] = dados[i+1];
        }

        tamanho--;
        return resposta;
    }
 
    public int removeFinal() throws Exception{
       int resposta = Integer.MIN_VALUE;
 
       if(this.tamanho == 0) {
          throw new Exception("Lista vazia");
       } else {
          resposta = dados[this.tamanho-1];
          tamanho--;
       }
 
       return resposta;
    }
    public String toString(){
       StringBuilder string = new StringBuilder();
       string.append("[");

       int i = 0;
       for(i = 0; i<this.tamanho-1; i++){
        string.append(dados[i] + ", ");
       }

       if(i == tamanho-1) string.append(dados[i] + "]");
       return string.toString();
    }
 }