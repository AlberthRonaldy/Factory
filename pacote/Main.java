package pacote;

public class Main {

    public static void main(String[] args) {

        RelatorioService service = new RelatorioService();

        service.enviarNotificacao(new FactoryCSV(), "Arquivo CSV enviado!");

        service.enviarNotificacao(new FactoryPDF(), "Arquivo PDF enviado!");

        service.enviarNotificacao(new FactoryExcel(), "Arquivo Excel enviado!");

    }
}
