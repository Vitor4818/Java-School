public class Professor extends Pessoa{
    String registro;
    int disciplinas;

    public Professor(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }


    @Override
    public void exibirInformacoes() {
        System.out.println();
    }
}
