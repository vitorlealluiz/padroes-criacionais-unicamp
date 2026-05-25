package br.unicamp.padroescriacionais.legacy.generator;

import br.unicamp.padroescriacionais.legacy.domain.Relatorio;

public class XmlRelatorioGenerator implements RelatorioGenerator {

    @Override
    public String gerar(Relatorio relatorio) {

        return """
                <relatorio>
                    <titulo>%s</titulo>
                    <tipo>%s</tipo>
                    <data>%s</data>
                    <conteudo>%s</conteudo>
                </relatorio>
                """.formatted(
                relatorio.getTitulo(),
                relatorio.getTipo(),
                relatorio.getDataGeracao(),
                relatorio.getConteudo()
        );
    }
}