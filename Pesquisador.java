public class Pesquisador extends Pessoa implements Notificavel {
    
    private String linhaPesquisa;

    public Pesquisador(String nome, String matricula, String email, String linhaPesquisa) {
        super(nome, matricula, email);
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    @Override 
    public void apresentarFuncao() {
        System.out.println("Sou pesquisador na linha " + linhaPesquisa);
    }

    @Override 
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linha de pesquisa: " + linhaPesquisa);
    }

    @Override 
    public void notificar(String mensagem) {
        System.out.println("Notificação para o pesquisador " + getNome() + ": " + mensagem);
    }

    }