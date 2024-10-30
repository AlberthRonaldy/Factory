package pacote;

public class FactoryCSV extends RelatorioFactory {

    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
