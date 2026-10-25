public class FuncionarioAdministrativo extends Pessoa {

    private String setor;

    public FuncionarioAdministrativo(String nome, String matricula, String email, String setor) {
        super(nome, matricula, email);   
        this.setor = setor;              
    }

    public String getSetor() {
        return setor;
    }

    public void realizarAtendimento() {
        System.out.println(" ");
        System.out.println("Atendimento realizado com sucesso!");
    }

    @Override
    public void apresentarFuncao() {
        System.out.println("Trabalho no setor " + setor);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: " + setor);
    }
}
