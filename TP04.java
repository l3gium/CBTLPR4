public class TP04 
{
    public static void main(String[] args)
    {
        Data d2 = new Data(10, 11, 2005);

        System.out.println("Ano: " + d2.retAno());
        System.out.println("Mes: " + d2.retMes());
        System.out.println("Dia: " + d2.retDia() + "\n");

        System.out.print("Bissexto: "+ d2.bissexto() + "\n");
        System.out.print(d2.mostra1() + "\n");
        System.out.print(d2.mostra2() + "\n");
        System.out.print(d2.diasTranscorridos());
        System.out.print("\n");
        System.out.print("\n");
       
        Data d1 = new Data();

        System.out.println("\nAno: " + d1.retAno());
        System.out.println("Mes: " + d1.retMes());
        System.out.println("Dia: " + d1.retDia() + "\n");

        System.out.print("Bissexto: " + d1.bissexto() + "\n");
        System.out.print(d1.mostra1() + "\n");
        System.out.print(d1.mostra2() + "\n");
        System.out.print(d1.diasTranscorridos() + "\n");

        d1.apresentaDataAtual();
    }
}
