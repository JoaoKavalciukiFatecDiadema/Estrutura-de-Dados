public class Queue{
    String[] queue;
    int size;

    public Queue(int capacity){
        queue = new String[capacity];
        size = 0;
    }

    public void enqueue(String element) throws Exception{
        if(this.size == this.queue.length){
            throw new Exception("The list is full");
        }

        this.size++;
        for(int i = size-1; i>=1; i--){
            queue[i] = queue[i-1];
        }

        queue[0] = element;
    }

    public String dequeue() throws Exception{
        if(this.size == 0) throw new Exception("Empty list");

        String dequeuedElement = queue[size-1];
        size--;
        return dequeuedElement;
    }

    public String peek() throws Exception{
        if(this.size == 0) throw new Exception("Empty list");

        String element = queue[size-1];
        return element;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("[");
 
        int i = 0;
        for(i = 0; i<this.size-1; i++){
            string.append(queue[i] + ", ");
        }
 
        if(i == size-1) string.append(queue[i] + "]");
        return string.toString();
    }
}