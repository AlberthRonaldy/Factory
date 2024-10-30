package pacote;

public class RelatorioExcel implements iRelatorio{
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando relatorio em Excel: " + mensagem);
    }
}
