public class Usuario {
    long id;
    String nome;
    int idTipoUsuario; // Referência para o objeto TipoUsuario

    public Usuario(int id, String nome, int idTipoUsuario) {
        this.id = id;
        this.nome = nome;
        this.idTipoUsuario = idTipoUsuario;
    }

    // Métodos para atualizar o nome e tipo de usuário
    public void atualizar(String nome, int idTipoUsuario) {
        this.nome = nome;
        this.idTipoUsuario = idTipoUsuario;
    }

    // Método para simular a inativação do usuário
    public boolean inativar() {
        return true;
    }
}
