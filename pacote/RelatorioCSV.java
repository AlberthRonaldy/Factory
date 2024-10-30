package pacote;

public class RelatorioCSV implements iRelatorio {
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando relatorio em CSV: " + mensagem);
    }
}
