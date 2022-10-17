public class Aluno{
    String nome;
    String ra;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Aluno(String nome, String  ra) {
        this.setNome(nome);
        this.setRa(ra);
    }


    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();

        string.append("Dados do aluno:\n");
        string.append("Nome:");
        string.append(this.getNome() + "\n");
        string.append("RA:");
        string.append(this.getRa() + "\n");
        return string.toString();
    }

}