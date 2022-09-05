public class Stack{
    int stack[];
    int size;

    public Stack(int capacidade){
        this.stack = new int[capacidade];
        this.size = 0;
    }

    public void push(int element) throws Exception{
        if(this.size == stack.length){
            //adicioar método de ampliarPilha
            throw new Exception("Pilha cheia");
        }

        this.size++;

        stack[size-1] = element;
    }

    public int pop() throws Exception{
        if(this.size == 0){
            throw new Exception("Empty stack");
        }

        int answer = stack[size-1];
        size--;
        return answer;
        
    }

    public int peek() throws Exception{
        return stack[size-1];
    }


    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("[");
 
        int i = 0;
        for(i = 0; i<this.size-1; i++){
            string.append(stack[i] + ", ");
        }
 
        if(i == size-1) string.append(stack[i] + "]");
        return string.toString();
    }
}