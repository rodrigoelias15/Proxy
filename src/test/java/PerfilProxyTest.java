import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PerfilProxyTest {
    
    @BeforeEach
    void setUp() {
        BD.addPerfil(new Perfil("Maria", "solteira", "Descrição do perfil", 25, 41));
        BD.addPerfil(new Perfil("João", "casado", "Descrição do perfil", 38, 14));
    }

    @Test
    void deveRetornarDadosPessoaisPerfil() {
        PerfilProxy perfil = new PerfilProxy(38);
        assertEquals(Arrays.asList("João", "Descrição do perfil", "casado"), perfil.obterDadosPessoais());
    }

    @Test
    void deveRetonarQuantidadeFotosPerfil() {
        Usuario Usuario = new Usuario("Maria", true);
        PerfilProxy perfil = new PerfilProxy(25);

        assertEquals(Arrays.asList(41), perfil.obterFotos(Usuario));
    }

    @Test
    void deveRetonarExcecaoPerfilPrivadoUsuarioNaoAutorizadoObterFotos() {
        try {
            Usuario Usuario = new Usuario("Joana", false);
            PerfilProxy perfil = new PerfilProxy(2);
            perfil.obterFotos(Usuario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Perfil Privado", e.getMessage());
        }
    }
}