package Futebol.Matheus.Dcx;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface SistemaCampeonato {

    String cadatrarJogador(Jogador jogador) throws JaExisteJogadorExecption, JaExisteNumeroCamisaExecption;
    String cadastrarTime(Time time);
    String revomerJogador(String cpf) throws NaoExisteJogadorException;
    String alteraNumeroJogador(String nomeTime, String cpf, String numeroCamisa) throws TimeNaoExisteException, NaoExisteJogadorException, NumeroDeCamisaJaExisteException;
    List<Jogador> pesquisarJogadoresDoTime(String nomeTime) throws TimeNaoExisteException;
    void sairDoSistema();
    Object removerTime(Time time) throws TimeNaoRemovidoException;
    Collection<Jogador> getListaJogadores();
    Map<String, Time> getListaTimes();

}
