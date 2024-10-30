package pacote;

public class RelatorioPDF implements iRelatorio {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando relatorio em PDF: " + mensagem);
    }
}
