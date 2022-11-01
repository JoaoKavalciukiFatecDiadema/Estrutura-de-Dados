public class Arvore {
    private No raiz;
    public Arvore(){
        raiz = null;
    }

    public void adicionaElemento(int elemento){
        No novo = new No(elemento);

        if(this.raiz == null){
            this.raiz = novo;
        } else {
            No aux1 = this.raiz, aux2 = this.raiz;
            while(aux1 != null){
                aux2 = aux1;

                if(elemento < aux1.elemento) aux1 = aux1.esquerda; else if(elemento>aux1.elemento) aux1 = aux1.direita;
            }

            if(elemento == aux2.elemento) System.out.println("Elemento já existente."); else{
                if(elemento < aux2.elemento) aux2.esquerda = novo;
                if(elemento > aux2.elemento) aux2.direita = novo;
                System.out.println("Elemento incluído");
            }
        }
    }

    public void preOrdem(No n){
        if(n != null){
            System.out.println(n.elemento);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }
    }

    public int somaPreOrdem(No n){
        if(n != null){
            return n.elemento + somaPreOrdem(n.esquerda) + somaPreOrdem(n.direita);
        }
        return 0;
    }

    public void verificar(int elemento){
        No aux = this.raiz;
        while(aux != null){
            if(elemento < aux.elemento) aux = aux.esquerda; else if(elemento > aux.elemento) aux = aux.direita; 
            else System.out.println("Elemento repetido");
        }
    }
}
