public class Usuario {
    private static long nextId = 1; // Contador estático para gerar IDs incrementais.
    private long id;
    private String nome;
    private int TipoUsuario; // Referência para o objeto TipoUsuario

    public Usuario(String nome, int TipoUsuario) {
        this.id = nextId++; // Atribui o próximo ID disponível e incrementa o contador.
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    // Métodos para atualizar o nome e tipo de usuário
    public void atualizar(String nome, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    // Método para simular a inativação do usuário
    public boolean inativar() {
        return true;
    }

    // Métodos de acesso para id, nome e tipoUsuario
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
}
