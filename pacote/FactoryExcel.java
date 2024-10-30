package pacote;

public class FactoryExcel extends RelatorioFactory {

    @Override
    public iRelatorio criarRelatorio() {
        return new RelatorioExcel();
    }
}
