package pacote;

public class FactoryPDF extends RelatorioFactory {

    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
