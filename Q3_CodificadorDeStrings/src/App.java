public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Codificador cod = new Codificador(new CodificaSimples());

        String aux = "Desafio Padroes de Projeto";
        System.out.println(aux);

        aux = cod.codifica(aux);
        System.out.println(aux);
        
        aux = cod.deCodifica(aux);
        System.out.println(aux);

        cod.setEstrategia(new CodificaDesloca());
        
        aux = cod.codifica(aux);
        System.out.println(aux);
        
        aux = cod.deCodifica(aux);
        System.out.println(aux);
    }
}