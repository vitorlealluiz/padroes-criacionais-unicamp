package br.unicamp.padroescriacionais.legacy.generator;

import br.unicamp.padroescriacionais.legacy.domain.Relatorio;

public class HtmlRelatorioGenerator implements RelatorioGenerator {

    @Override
    public String gerar(Relatorio relatorio) {

        return """
                <html>
                    <body>
                        <h1>%s</h1>
                        <p>%s</p>
                    </body>
                </html>
                """.formatted(
                relatorio.getTitulo(),
                relatorio.getConteudo()
        );
    }
}