package br.johnatas.srcvendavalidador;



public class RedisDataSource {

    @Test
    @DisplayName("Deve efetuar uma consulta com sucesso de uma request")
    void deveConsultarComSucessoUmIdDeRequest() throws Exception {
        RequestVenda requestVenda = DataUtil.getRequestVenda();
    }
}