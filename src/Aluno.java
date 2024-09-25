public class Aluno extends Pessoa{
    String matricula;
    String curso;
    double nota;

    public Aluno(String nome, String email, String cpf) {
        super(nome, email, cpf);
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do aluno: "+getNome() +"\nMatricula: "+ getMatricula()+"\nCurso: "+getCurso());

    }



    public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
