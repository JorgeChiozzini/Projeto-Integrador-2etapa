public class Aluno {
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String nomeCurso;

    // Construtor
    public Aluno(String nome, String endereco, String telefone, String nomeCurso) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nomeCurso = nomeCurso;
    }

    // Métodos
    public void acessarMaterial() {
        System.out.println(nome + " está acessando o material do curso de " + nomeCurso);
    }

    public void consultarNota(String disciplina) {
        System.out.println(nome + " está consultando a nota na disciplina de " + disciplina);
    }

    public void consultarFrequencia() {
        System.out.println(nome + " está consultando a frequência no curso de " + nomeCurso);
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                '}';
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria Silva", "Rua ABC, 123", "123-456-7890", "Matemática");
        aluno.acessarMaterial();
        aluno.consultarNota("Cálculo");
        aluno.consultarFrequencia();

        // Exemplo de impressão dos atributos
        System.out.println(aluno);
    }
}
