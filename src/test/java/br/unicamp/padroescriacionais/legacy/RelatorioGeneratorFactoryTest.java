package br.unicamp.padroescriacionais.legacy;

import br.unicamp.padroescriacionais.legacy.domain.FormatoRelatorio;
import br.unicamp.padroescriacionais.legacy.generator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioGeneratorFactoryTest {

    @Test
    void deveCriarGeradorPdf() {

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(
                        FormatoRelatorio.PDF
                );

        assertInstanceOf(
                PdfRelatorioGenerator.class,
                generator
        );
    }

    @Test
    void deveCriarGeradorCsv() {

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(
                        FormatoRelatorio.CSV
                );

        assertInstanceOf(
                CsvRelatorioGenerator.class,
                generator
        );
    }

    @Test
    void deveCriarGeradorJson() {

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(
                        FormatoRelatorio.JSON
                );

        assertInstanceOf(
                JsonRelatorioGenerator.class,
                generator
        );
    }

    @Test
    void deveCriarGeradorXml() {

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(
                        FormatoRelatorio.XML
                );

        assertInstanceOf(
                XmlRelatorioGenerator.class,
                generator
        );
    }

    @Test
    void deveCriarGeradorHtml() {

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(
                        FormatoRelatorio.HTML
                );

        assertInstanceOf(
                HtmlRelatorioGenerator.class,
                generator
        );
    }
}