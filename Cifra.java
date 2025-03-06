import java.util.Scanner;

public class Cifra
{
public static void main (String [] args)
{
Scanner teclado = new Scanner (System.in);
System.out.print("\f");

int resposta;

System.out.println();
System.out.println("------------------------------------------------");
System.out.println("--------------CRIPTOGRAFIA EM JAVA--------------");
System.out.println("------------------------------------------------");
System.out.println();
System.out.println("Digite tres frases a serem criptografadas e depois tente descobrir o padrao.");
System.out.println();

do
{
    
System.out.print("Digite a primeira frase a ser criptografada: ");
String frase1 = teclado.nextLine();

System.out.print("Digite a segunda frase a ser criptografada: ");
String frase2 = teclado.nextLine();

System.out.print("Digite a terceira frase a ser criptografada: ");
String frase3 = teclado.nextLine();

System.out.println();
System.out.println("Aqui estao as tres frases originais:");
System.out.println();
System.out.println(frase1);
System.out.println(frase2);
System.out.println(frase3);
System.out.println();

String minuscula1 = frase1.toLowerCase();
String minuscula2 = frase2.toLowerCase();
String minuscula3 = frase3.toLowerCase();

String frase1cripto = metodoCriptografia(minuscula1);
String frase2cripto = metodoCriptografia(minuscula2);
String frase3cripto = metodoCriptografia(minuscula3);

System.out.println("Aqui estao as tres frases criptografadas:");
System.out.println();
System.out.println(frase1cripto);
System.out.println(frase2cripto);
System.out.println(frase3cripto);

System.out.println();
System.out.println("------------------------------------------------");
System.out.println();

System.out.println("O que deseja fazer agora?");
System.out.println();
System.out.println("(1) ---> Testar tres novas frases a serem criptografadas");
System.out.println("(2) ---> Tentar acertar qual o metodo de criptografia utilizado");
System.out.println("(3) ---> Ver a resposta do metodo");
System.out.println();
System.out.print("Digite o numero correspondente a sua escolha:  ");
resposta = teclado.nextInt();
System.out.println();
System.out.println("------------------------------------------------");
System.out.println();

teclado.nextLine();

} while (resposta == 1);

int acerto;

if (resposta == 2)
    {
    System.out.println("Aqui estão algumas opcoes de cifras que podem ter sido utilizadas:");  
    System.out.println();
    System.out.println("(1) ---> Substituição de letra com deslocamentos fixos");
    System.out.println("(2) ---> Substituição de letra com deslocamentos variaveis");
    System.out.println("(3) ---> Alfabeto espelhado");
    System.out.println("(4) ---> Texto reverso");
    System.out.println("(5) ---> Cifra de Cesar");
    
    do {
        System.out.println();
        System.out.print("Digite aqui sua resposta: ");
        acerto = teclado.nextInt();
        
        System.out.println();
        if (acerto == 2) 
            {
                System.out.println("Parabens! Resposta correta!");
            }
        else
            {
                System.out.println("Resposte incorreta! Tente novamente!");
            }
    } while (acerto != 2);
    }
    
if (resposta == 3)
    {
    System.out.println("Certo! Aqui esta a explicacao da cifra:");
    }

System.out.println();
System.out.println("------------------------------------------------");
System.out.println();
System.out.println("Nessa cifra, por padrao o deslocamento das letras e apenas um");
System.out.println("Ou seja, se voce digitar a letra A, o programa retornara a letra B");
System.out.println("Porem, a cada palavra que e digitada, ou a cada vez que a barra de espaco e usada, esse padrao muda");
System.out.println("Entao, toda vez que a barra de espaco e pressionada, esse deslocamento aumenta uma unidade");
System.out.println("Fazendo assim com que a letra A, que antes retornaria B, agora retorne C e assim sucessivamente a cada espaco");
System.out.println();
System.out.println("------------------------------------------------");
System.out.println("----------------- FIM DA CIFRA -----------------");
System.out.println("------------------------------------------------");

}

public static String metodoCriptografia(String minuscula)

{
StringBuilder sb = new StringBuilder();   
int contador = 1;

for (int i = 0; i < minuscula.length(); i++)

{
    char caractere = minuscula.charAt(i);
    
if (caractere == ' ')
{
    contador++;
    sb.append(caractere);    
}
    else if (Character.isLetter(caractere))
    {
        char charLetra = (char) (caractere + contador);
        
        charLetra = Character.toUpperCase(charLetra);
        
        sb.append(charLetra);
    }

    else if (Character.isDigit(caractere))
    {
        char charNumero = (char) (caractere + contador);
        
        sb.append(charNumero);
    }
    else 
    {
        sb.append(caractere);
    }
        
}

String resultado = sb.toString();

return resultado;
    
}
    
}
