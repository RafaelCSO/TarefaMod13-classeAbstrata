public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaf = new PessoaFisica();
        pessoaf.setNome("Rafael");
        pessoaf.setId(12345678);
        pessoaf.setCpf(175278893L);

        System.out.println(" nome: " + pessoaf.getNome() + " id: " + pessoaf.getId());
        System.out.println("cpf: " + pessoaf.getCpf());


        PessoaJuridica pessoaj = new PessoaJuridica();
        pessoaj.setNome("Rafael");
        pessoaj.setId(12345678);
        pessoaj.setCnpj(159753456L);

        System.out.println(" nome: " + pessoaj.getNome() + " id: " + pessoaj.getId());
        System.out.println( "cnpj: " + pessoaj.getCnpj());

    }
}