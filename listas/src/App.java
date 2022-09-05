public class App {
    public static void main(String[] args) throws Exception {
        ListaDeInteiro lista = new ListaDeInteiro(5);

        lista.adicionaInicio(5);
        lista.adicionaFinal(4);
        lista.adicionaFinal(3);
        lista.removeInicio();
        lista.removeFinal();
        System.out.println(lista);
    }
}
