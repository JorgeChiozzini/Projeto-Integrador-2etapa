public class PessoaFisica {
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos
    public void ministrarAula(String materia) {
        System.out.println(nome + " está ministrando aula de " + materia);
    }

    public void matricularCurso(String curso) {
        System.out.println(nome + " está matriculando no curso de " + curso);
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("João Silva", "Rua ABC, 123", "123-456-7890", "joao@email.com");
        pessoa.ministrarAula("Matemática");
        pessoa.matricularCurso("Inglês");

        // Exemplo de impressão dos atributos
        System.out.println(pessoa);
    }
}
