public class LinkedList {
    private No inicioLista;

    public LinkedList(){
        this.inicioLista = null;
    }


    public void adicionaInicio(Aluno elemento){
        No novoNo = new No(elemento);
        /*Instancia o novo nó com o novo elemento do início da lista*/
        novoNo.prox = inicioLista;
        /* Atribui ao atributo novo da classe nó o endereço do nó*/
        inicioLista = novoNo;
        /*Atributo inicio da Lista o novo nó*/
    }

    public Aluno removeInicio(){
        Aluno resp = null;
        
        if(this.inicioLista == null) {
            System.out.println("Lista vazia");
        } else {
            resp = inicioLista.elemento;
            this.inicioLista = inicioLista.prox;
        }
        
        return resp;
    }

    public boolean buscarElemento(Aluno
     elemento){
        No auxiliar = inicioLista;
        //Enquanto n achar o elemento pedido E for diferente de nulo continua a busca
        while(auxiliar != null && auxiliar.elemento != elemento){
            auxiliar = auxiliar.prox;
        }

        if(auxiliar.elemento == elemento) return true;
        return false;
    }
  
    
    public String listaReversa(){

        No aux = inicioLista;
        String resp = "";
        //Percorre a lista até não ultrapassar o último nó;
        while(aux != null){
            //Recebe o nó atual + espaço em branco + a resposta anterior.
            resp = aux.elemento + " " + resp;
    
            //Atualiza o aux pr próx nó;
            aux = aux.prox;
        }
        
        return"["  + resp + "]";
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        
        No auxiliar = inicioLista;

        string.append("[");

        while(auxiliar.prox != null) {
            string.append(auxiliar.elemento.toString() + "\n");
            auxiliar = auxiliar.prox;
        }

        if(auxiliar.prox == null) string.append(auxiliar.elemento.toString());

        
        return string.toString();
    }
}

