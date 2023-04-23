package inheritance.exercises.exercise04;

public class TesteQuestao04 {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(1);
        PessoaFisica pessoaFisica = new PessoaFisica(1, "João", departamento);
        pessoaFisica.setCpf("123456789-00");
        departamento.addPessoa(pessoaFisica);
        System.out.println("Pessoa Física: " + pessoaFisica.nome + " - CPF: " + pessoaFisica.getCpf());
        System.out.println("Pessoas no departamento: " + departamento.pessoas.size());
    }
}
