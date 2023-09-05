public class Fornecedor {
    // Atributos
    private String nomeComercial;
    private String endereco;
    private String telefone;
    private String cnpj;

    // Construtor
    public Fornecedor(String nomeComercial, String endereco, String telefone, String cnpj) {
        this.nomeComercial = nomeComercial;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }

    // Métodos
    public void receberFinanceiro(double valor) {
        System.out.println(nomeComercial + " recebeu um pagamento de R$" + valor);
    }

    public void pagarFinanceiro(double valor) {
        System.out.println(nomeComercial + " realizou um pagamento de R$" + valor);
    }

    public void cadastrarUsuario(String nomeUsuario) {
        System.out.println(nomeComercial + " cadastrou o usuário " + nomeUsuario);
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Fornecedor{" +
                "nomeComercial='" + nomeComercial + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornex Ltda.", "Av. Principal, 123", "987-654-3210", "12345678901234");
        fornecedor.receberFinanceiro(1500.0);
        fornecedor.pagarFinanceiro(800.0);
        fornecedor.cadastrarUsuario("joao_silva");

        // Exemplo de impressão dos atributos
        System.out.println(fornecedor);
    }
}
