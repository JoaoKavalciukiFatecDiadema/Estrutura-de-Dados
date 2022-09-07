public class Stack{
    char stack[];
    int size;

    public Stack(int capacidade){
        this.stack = new char[capacidade];
        this.size = 0;
    }

    public void push(char element) throws Exception{
        if(this.size == stack.length){
            //adicioar método de ampliarPilha
            throw new Exception("Pilha cheia");
        }

        this.size++;

        stack[size-1] = element;
    }

    public char pop() throws Exception{
        if(this.size == 0){
            throw new Exception("Empty stack");
        }

        char answer = stack[size-1];
        size--;
        return answer;
        
    }

    public char peek() throws Exception{
        return stack[size-1];
    }


    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("");
 
        int i = 0;
        for(i = 0; i<=this.size-1; i++){
            string.append(stack[i]);
        }
        string.append("");

        return string.toString();
    }
}