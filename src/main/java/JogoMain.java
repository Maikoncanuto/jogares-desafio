public class JogoMain {

    public static void main(String[] args){

        Jogador jogador1 = new Jogador("tony.stark", 145, 125, 100, Boolean.FALSE);
        Jogador jogador2 = new Jogador("thanos", 125, 150, 100, Boolean.TRUE);

        CampoBatalha campoBatalha = new CampoBatalha();

        /***
         * Com resultado do jogo vc poderá retornar esse objeto para o endpoint
         */
        ResultadoJogo resultadoJogo = campoBatalha.batalha(jogador1, jogador2);

        System.out.println("Vencedor: " + resultadoJogo.getJogadorVencedor().getNickname());
        System.out.println("Perdedor: " + resultadoJogo.getJogadorPerdedor().getNickname());

        resultadoJogo.getLogBatalha().forEach(System.out::println);
    }

}
