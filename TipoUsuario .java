public class TipoUsuario {
    private static int nextId = 1; // Contador estático para gerar IDs incrementais.
    private int id;
    private String cargo;

    public TipoUsuario(String cargo) {
        this.id = nextId++; // Atribui o próximo ID disponível e incrementa o contador.
        this.cargo = cargo;
    }

    // Métodos de acesso para id e cargo
    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }
}
