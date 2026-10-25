public class Aluno extends Pessoa implements Notificavel{

    private String curso;

    public Aluno(String nome, String matricula, String email, String curso) {
        super(nome, matricula, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;

    }

    public void solicitarMatricula() {
        System.out.println(" ");
        System.out.println("Matrícula solicitada com sucesso!");
        
    }

    @Override
    public void apresentarFuncao() {
        System.out.println("Sou aluno do curso " + curso);
    }

    @Override 
    public void exibirDados() {
        super.exibirDados() ;
        System.out.println("Curso: " + curso);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para o aluno " + getNome() + ": " + mensagem);
    }
}
