package exercicio3_polimorfismo;
import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            contato.exibirDetalhes();
        }
    }

    public PessoaFisica buscarPorCPF(String cpf) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaFisica && ((PessoaFisica) contato).getCpf().equals(cpf)) {
                return (PessoaFisica) contato;
            }
        }
        return null;
    }

    public PessoaJuridica buscarPorCNPJ(String cnpj) {
        for (Contato contato : contatos) {
            if (contato instanceof PessoaJuridica && ((PessoaJuridica) contato).getCnpj().equals(cnpj)) {
                return (PessoaJuridica) contato;
            }
        }
        return null;
    }
}
