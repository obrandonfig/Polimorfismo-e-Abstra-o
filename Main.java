import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(
            "Maria Silva",
            "2024001",
            "maria@email.com",
            "Analise e desenvolvimento de sistemas"
        );
        Professor professor = new Professor(
            "Joao Souza",
            "P001",
            "joao@email.com",
            "Matematica"
        );

        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo(
            "Ana Costa",
            "F001",
            "ana@email.com",
            "Secretaria"
        );

        Pesquisador pesquisador = new Pesquisador(
            "Carlos Lima",
            "R001",
            "carlos@email.com",
            "Inteligência Artifical"
        );
    
aluno.setEndereco(new Endereco("Rua das Flores", "123", "Ipatinga"));

ArrayList<Pessoa> pessoas = new ArrayList<>();
pessoas.add(aluno);
pessoas.add(professor);
pessoas.add(funcionario);
pessoas.add(pesquisador);
for (Pessoa p : pessoas) {
    p.exibirDados();
    p.apresentarFuncao();
}

ArrayList<Notificavel> notificaveis = new ArrayList<>();
notificaveis.add(aluno);
notificaveis.add(professor);
notificaveis.add(pesquisador);

System.out.println();
for (Notificavel n : notificaveis) {
    n.notificar ("Reunião amanhã às 10h");
}

aluno.solicitarMatricula();
professor.registrarNota();
funcionario.realizarAtendimento();

    }
}


