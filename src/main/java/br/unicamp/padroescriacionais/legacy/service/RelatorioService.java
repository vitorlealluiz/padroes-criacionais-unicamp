package br.unicamp.padroescriacionais.legacy.service;

import br.unicamp.padroescriacionais.legacy.domain.FormatoRelatorio;
import br.unicamp.padroescriacionais.legacy.domain.Relatorio;
import br.unicamp.padroescriacionais.legacy.domain.TipoRelatorio;
import br.unicamp.padroescriacionais.legacy.generator.RelatorioGeneratorFactory;
import br.unicamp.padroescriacionais.legacy.generator.RelatorioGenerator;

import java.time.LocalDateTime;

public class RelatorioService {

    public Relatorio criarRelatorio(TipoRelatorio tipo) {

        String titulo = switch (tipo) {

            case VENDAS -> "Relatorio de Vendas";

            case ESTOQUE -> "Relatorio de Estoque";

            case CLIENTES -> "Relatorio de Clientes";
        };

        String conteudo =
                "Conteudo gerado automaticamente para " + titulo;

        return new Relatorio(
                titulo,
                conteudo,
                tipo,
                LocalDateTime.now()
        );
    }

    public String gerarRelatorio(
            TipoRelatorio tipo,
            FormatoRelatorio formato
    ) {

        Relatorio relatorio = criarRelatorio(tipo);

        RelatorioGenerator generator =
                RelatorioGeneratorFactory.criarGerador(formato);

        return generator.gerar(relatorio);
    }
}