import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

class Data
{
    private int dia;
    private int mes;
    private int ano;

    private static Scanner scan = new Scanner(System.in);

    public Data() 
    {
        try 
        {
            entraAno();
            entraMes();
            entraDia();
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao entrar com a data: " + e.getMessage());
        }
        
    }

    public Data(int d, int m, int a) 
    {
        try 
        {
            entraAno(a);
            entraMes(m);
            entraDia(d);
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao entrar com a data: " + e.getMessage());
        }
    }

    public void entraDia(int d)
    {
        dia = d;
    }

    public void entraMes(int m)
    {
        mes = m;
    }

    public void entraAno(int a)
    {
        ano = a;
    }

    public void entraDia()
    {
        try 
        {
            System.out.print("Digite o dia: ");
            this.dia = scan.nextInt();

            switch(this.mes)
            {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    while(this.dia < 1 || this.dia > 31)
                    {
                        System.out.print("Dia invalido. Tente novamente: ");
                        this.dia = scan.nextInt();
                    }
                    break;
                
                case 4: case 6: case 9: case 11:
                    while(this.dia < 1 || this.dia > 30)
                    {
                        System.out.print("Dia invalido. Tente novamente: ");
                        this.dia = scan.nextInt();
                    }
                    break;

                case 2:
                    if(bissexto())
                    {
                        while(this.dia < 1 || this.dia > 29)
                        {
                            System.out.print("Dia invalido. Tente novamente: ");
                            this.dia = scan.nextInt();
                        }
                    }
                    else
                    {
                        while(this.dia < 1 || this.dia > 28)
                        {
                            System.out.print("Dia invalido. Tente novamente: ");
                            this.dia = scan.nextInt();
                        }
                    }
                    break;
                
                default:
                    System.out.println("Mes invalido.");
                    break;
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao entrar com o dia: " + e.getMessage());
            scan.nextLine(); 
        }

    }

    public void entraMes()
    {
        try 
        {
            System.out.print("Digite o mes: ");
            this.mes = scan.nextInt();

            while(this.mes < 1 || this.mes > 12)
            {
                System.out.print("Mes invalido. Tente novamente: ");
                this.mes = scan.nextInt();
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao entrar com o mes: " + e.getMessage());
            scan.nextLine(); 
        }
    }

    public void entraAno()
    {
        try 
        {
            System.out.print("Digite o ano: ");
            this.ano = scan.nextInt();
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao entrar com o ano: " + e.getMessage());
            scan.nextLine();
        }
    }

    public int retDia()
    {
        return this.dia;
    }

    public int retMes()
    {
        return this.mes;
    }

    public int retAno()
    {
        return this.ano;
    }

    public String mostra1()
    {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }

    public String mostra2()
    {
        String[] mesesPorExtenso = {"Janeiro", "Fevereiro", "Março", "Abril", 
                                    "Maio", "Junho", "Julho", "Agosto", 
                                    "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%d de %s de %d", this.dia, mesesPorExtenso[this.mes - 1], this.ano);
    }

    public boolean bissexto()
    {
        return this.ano % 4 == 0 ? true : false;
    }

    public int diasTranscorridos()
    {
        int[] diasPorMes = {31, (bissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTranscorridos = 0;

        for(int i = 0; i < this.mes - 1; i++) 
        {
            diasTranscorridos += diasPorMes[i];
        }

        diasTranscorridos += this.dia;

        return diasTranscorridos;
    }

    public void apresentaDataAtual()
    {
        try 
        {
            Date dataAtual = new Date();
            DateFormat formatoData = DateFormat.getDateInstance(DateFormat.FULL);
            System.out.println("Data atual: " + formatoData.format(dataAtual));
        } 
        catch (Exception e) 
        {
            System.out.println("Erro ao obter a data atual: " + e.getMessage());
        }
    }
}
