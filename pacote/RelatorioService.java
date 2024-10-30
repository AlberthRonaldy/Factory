package pacote;

public class RelatorioService {

    public void enviarNotificacao(RelatorioFactory factory, String mensagem) {
        iRelatorio relatorio = factory.criarRelatorio();
        relatorio.enviar(mensagem);
    }

}
