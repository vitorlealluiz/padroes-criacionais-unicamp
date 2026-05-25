package br.unicamp.padroescriacionais.legacy.domain;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private String nomeEmpresa;
    private String ambiente;
    private String diretorioExportacao;
    private boolean debugAtivo;

    private ConfiguracaoSistema() {
        this.nomeEmpresa = "Empresa XPTO Ltda.";
        this.ambiente = "DEV";
        this.diretorioExportacao = "/tmp/relatorios";
        this.debugAtivo = true;
    }

    public static ConfiguracaoSistema getInstance() {

        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }

        return instancia;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getDiretorioExportacao() {
        return diretorioExportacao;
    }

    public boolean isDebugAtivo() {
        return debugAtivo;
    }

    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }
}