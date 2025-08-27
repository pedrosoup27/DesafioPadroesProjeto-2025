public class CodificaDesloca implements StrategyCodificador
{
    @Override
    public String codificar(String str)
    {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++)
        {
            resp[i] = (char)(Character.valueOf(aux[i])+1);
        }
        return(new String(resp));
    }

    @Override
    public String decodificar(String str)
    {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++)
        {
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }
}