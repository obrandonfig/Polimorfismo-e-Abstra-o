public class Professor extends Pessoa implements Notificavel {

    private String area;

    public Professor(String nome, String matricula, String email, String area) {
        super(nome, matricula, email);
        this.area = area;
    }
    
    public String getArea() {
        return area;
    }

    public void registrarNota() {
        System.out.println(" ");
        System.out.println("Nota registrada com sucesso!");
    }

@Override
     public void apresentarFuncao() {
        System.out.println("Sou professor da area " + area);
     }

     @Override 
     public void exibirDados() {
     super.exibirDados();
     System.out.println("Area: " + area);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificacao para o professor " + getNome() + ": " + mensagem);
    }
}

