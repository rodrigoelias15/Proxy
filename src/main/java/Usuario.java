public class Usuario {
    private String nome;
    private boolean amigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAmigo() {
        return amigo;
    }

    public void setAmigo(boolean amigo) {
        this.amigo = amigo;
    }

    public Usuario(String nome, boolean amigo) {
        this.nome = nome;
        this.amigo = amigo;
    }
}
