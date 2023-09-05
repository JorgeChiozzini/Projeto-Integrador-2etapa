public class PessoaJuridica {
    // Atributos
    private String nomeComercial;
    private String endereco;
    private String numeroCnpj;
    private String numeroContaCorrente;

    // Construtor
    public PessoaJuridica(String nomeComercial, String endereco, String numeroCnpj, String numeroContaCorrente) {
        this.nomeComercial = nomeComercial;
        this.endereco = endereco;
        this.numeroCnpj = numeroCnpj;
        this.numeroContaCorrente = numeroContaCorrente;
    }

    // Métodos
    public void matricularAluno(String nomeAluno) {
        System.out.println("Matriculando aluno " + nomeAluno);
    }

    public void fornecerServicos(String servico) {
        System.out.println("Fornecendo serviço de " + servico);
    }

    public void receberPagamentos(double valor) {
        System.out.println("Recebendo pagamento de R$" + valor);
    }

    // Getters e Setters (opcional)
    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCnpj() {
        return numeroCnpj;
    }

    public void setNumeroCnpj(String numeroCnpj) {
        this.numeroCnpj = numeroCnpj;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nomeComercial='" + nomeComercial + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numeroCnpj='" + numeroCnpj + '\'' +
                ", numeroContaCorrente='" + numeroContaCorrente + '\'' +
                '}';
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        PessoaJuridica empresa = new PessoaJuridica("Minha Escola", "Av. XYZ, 456", "12345678901234", "987654-0");
        empresa.matricularAluno("João Silva");
        empresa.fornecerServicos("Cursos de Matemática");
        empresa.receberPagamentos(1000.0);

        // Exemplo de impressão dos atributos
        System.out.println(empresa);
    }
}
