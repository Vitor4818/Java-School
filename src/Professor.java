public class Professor extends Pessoa{
    String registro;
    int disciplinas;

    public Professor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }

    public void darNota(Aluno aluno, double nota){
        aluno.setNota(nota);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: "+ getNome()+"\nRegistro: "+getRegistro());
    }

    public int getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(int disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
