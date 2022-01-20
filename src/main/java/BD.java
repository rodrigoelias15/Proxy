import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Perfil> perfis = new HashMap<>();

    public static Perfil getPerfil(Integer idade) {
        return perfis.get(idade);
    }

    public static void addPerfil(Perfil perfil) {
        perfis.put(perfil.getIdade(), perfil);
    }
}
