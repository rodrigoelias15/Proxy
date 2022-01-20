import java.util.List;

public class PerfilProxy implements IPerfil{

    private Perfil perfil;
    private Integer idade;

    public PerfilProxy(Integer idade) {
        this.idade = idade;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.perfil == null) {
            this.perfil = new Perfil(this.idade);
        }
        return this.perfil.obterDadosPessoais();
    }

    @Override
    public List<Integer> obterFotos(Usuario usuario) {
        if(!usuario.isAmigo()){
            throw new IllegalArgumentException("Perfil Privado");
        }
        if (this.perfil == null) {
            this.perfil = new Perfil(this.idade);
        }
        return this.perfil.obterFotos(usuario);
    }
}
