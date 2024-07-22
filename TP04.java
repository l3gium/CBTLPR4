public class TP04 
{
    public static void main(String[] args)
    {
        Data d2 = new Data(10, 11, 2005);

        System.out.println("Ano: " + d2.retAno());
        System.out.println("Mes: " + d2.retMes());
        System.out.println("Dia: " + d2.retDia() + "\n");

        System.out.print(d2.mostra1() + "\n");
        System.out.print(d2.mostra2() + "\n");
        System.out.print(d2.diasTranscorridos() + "\n");
        d2.apresentaDataAtual();

        // Data d1 = new Data();

        // System.out.println("Ano: " + d1.retAno());
        // System.out.println("Mes: " + d1.retMes());
        // System.out.println("Dia: " + d1.retDia());
    }
}
