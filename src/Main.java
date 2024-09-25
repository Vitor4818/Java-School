public class Main {
    public static void main(String[] args) {
        Aluno vitor = new Aluno("Vitor", "vitor@gmail.com", "1234235");
        Aluno vitor3 = new Aluno("Vitor", "vitor@gmail.com", "1234235");
        Professor regys = new Professor("regys", "asdasd@sada.com", "234234232434");
        regys.darNota(vitor, 8.6);
        System.out.println(vitor.getNota());
        System.out.println(vitor3.getNota());

    }
}