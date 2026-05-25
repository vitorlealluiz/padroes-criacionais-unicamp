package br.unicamp.padroescriacionais.legacy;

import br.unicamp.padroescriacionais.legacy.domain.ConfiguracaoSistema;
import br.unicamp.padroescriacionais.legacy.service.ConfiguracaoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoSistemaTest {

    @Test
    void configuracaoServiceDeveRetornarConfiguracaoNaoNula() {

        ConfiguracaoService service =
                new ConfiguracaoService();

        assertNotNull(service.getConfiguracao());

        assertFalse(
                service.getConfiguracao()
                        .getNomeEmpresa()
                        .isBlank()
        );
    }

    @Test
    void deveRetornarMesmaInstancia() {

        ConfiguracaoSistema c1 =
                ConfiguracaoSistema.getInstance();

        ConfiguracaoSistema c2 =
                ConfiguracaoSistema.getInstance();

        assertSame(c1, c2);
    }

    @Test
    void alteracaoDeveRefletirNaMesmaInstancia() {

        ConfiguracaoSistema config1 =
                ConfiguracaoSistema.getInstance();

        ConfiguracaoSistema config2 =
                ConfiguracaoSistema.getInstance();

        config1.setAmbiente("PROD");

        assertEquals("PROD", config2.getAmbiente());
    }
}