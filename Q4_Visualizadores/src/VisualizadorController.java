public class VisualizadorController{
    private FonteDeDados fonteDeDados;
    private VisualizadorDeMedia visualizadorDeMedia;
    private VisualizadorDeSomatorio visualizadorDeSomatorio;
    private VisualizadorDeDesvioPadrao visualizadorDeDesvioPadrao;
    private boolean mediaAtivada = false;
    private boolean somatorioAtivado = false;
    private boolean dpAtivado = false;


public VisualizadorController(FonteDeDados fonte){
    this.fonteDeDados = fonte;
    this.visualizadorDeMedia = new VisualizadorDeMedia();
    this.visualizadorDeSomatorio = new VisualizadorDeSomatorio();
    this.visualizadorDeDesvioPadrao = new VisualizadorDeDesvioPadrao();
    System.out.println("\n Todos os visualizadores foram iniciados em 'desligado'");
    
}

public void ligarVisualizador(int opcao){
    if(opcao == -1 && !somatorioAtivado){
        fonteDeDados.addObserver(visualizadorDeSomatorio);
        somatorioAtivado = true;
        System.out.println("Visualizador de somatorio ligado");

    }
    else if( opcao == -2 && !mediaAtivada){
        fonteDeDados.addObserver(visualizadorDeMedia);
        mediaAtivada = true;
         System.out.println("Visualizador de media ligado");
    }
    else if(opcao == -3 && !dpAtivado){
        fonteDeDados.addObserver(visualizadorDeDesvioPadrao);
        dpAtivado = true;
        System.out.println("Visualizador de desvio padrao ligado");
    }
    else{
        System.out.println("Comando invalido ou visualizador ja esta ligado");
    }
    
}


public void desligarVisualizador(int opcao){
    if(opcao == -1 && somatorioAtivado){
        fonteDeDados.removeObserver(visualizadorDeSomatorio);
        somatorioAtivado = false;
        System.out.println("Visualizador de somatorio desligado");

    }
    else if( opcao == -2 && mediaAtivada){
        fonteDeDados.removeObserver(visualizadorDeMedia);
        mediaAtivada = false;
        System.out.println("Visualizador de media desligado");
    }
    else if(opcao == -3 && dpAtivado){
        fonteDeDados.removeObserver(visualizadorDeDesvioPadrao);
        dpAtivado = false;
        System.out.println("Visualizador de desvio padrao desligado");
    }
    else{
        System.out.println("Comando invalido ou visualizador ja esta desligado");
    }
}
}

