
package exercicio3_polimorfismo;


public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-00", "Rua A, 123", "10/05/1990");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ Ltda", "12.345.678/0001-99", "Av. B, 456", 500000.00);

        agenda.adicionarContato(pf);
        agenda.adicionarContato(pj);

        System.out.println("Lista de Contatos:");
        agenda.listarContatos();

        System.out.println("Buscando por CPF 123.456.789-00:");
        PessoaFisica encontradoPF = agenda.buscarPorCPF("123.456.789-00");
        if (encontradoPF != null) encontradoPF.exibirDetalhes();

        System.out.println("Buscando por CNPJ 12.345.678/0001-99:");
        PessoaJuridica encontradoPJ = agenda.buscarPorCNPJ("12.345.678/0001-99");
        if (encontradoPJ != null) encontradoPJ.exibirDetalhes();
    }
}
