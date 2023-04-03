import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);
    public void Atividade() {
    System.out.println("Informe o seu Nome:");
    String nome = sc.nextLine();
    System.out.println("Informe sua Idade:");
    int idade = sc.nextInt();
    System.out.println("Informe seu Gênero (Feminino = 1 / Masculino = 2):");
    int sexo = sc.nextInt();
     System.out.println("Informe sua Altura (ex: 1,80):");
    double altura = sc.nextDouble();
    System.out.println("Informe seu Peso:");
    double peso = sc.nextDouble();
    double pesoIdeal =0;
    double pesoMeta = 0;
    //Calcular peso Ideal
    if (sexo==1) { pesoIdeal = (62.1*altura)-44.7; System.out.printf("Seu Peso Ideal é "+pesoIdeal+"   "); }
else if (sexo==2) {pesoIdeal = (72.7*altura)-58; System.out.printf("Seu Peso Ideal é "+pesoIdeal+"    ");}
    else {System.out.println("Gênero Inválido!!");}
    
   if (pesoIdeal>peso) {pesoMeta = pesoIdeal-peso; System.out.printf("Você Precisará Ganhar "+pesoMeta+" quilos.     ");}
   else if (peso>pesoIdeal) {pesoMeta = peso-pesoIdeal; System.out.printf("Você Precisará Emagrecer "+pesoMeta+" quilos.    ");}
   else {System.out.println("Você está com Peso Ideal     ");}
     
    //Calcular IMC
    double imc = peso/(altura*altura);
    System.out.printf("Seu IMC é "+imc);
    
    //Atividade Recomendado
    if (imc>27) { System.out.println("O Treino sugerido foi uma Atividade Leve.");
         }
    else if (imc>27&&imc>20) {System.out.println("O Treino sugerido foi uma Atividade Moderada.");}
    else if (imc<=20) {System.out.println("O Treino sugerido foi uma Atividade Difícil");}

    //Faixa Etaria
    double faixaEtaria = 0;
    if (idade>=16&&idade<=25) {faixaEtaria = 1;}
    else if (idade>25&&idade<=35) {faixaEtaria = 2;}
    else if (idade>35&&idade<=45) {faixaEtaria = 3;}
    else if (idade>45&&idade<=55) {faixaEtaria = 4;}
    else if (idade>55&&idade<=65) {faixaEtaria = 5;}
    else if (idade>65) {faixaEtaria = 6;}
    else {System.out.println("Idade Inválida!!");}

    //atividades
    if (faixaEtaria==1) {System.out.println("Você poderá Praticar: Musculação Moderada / Musculação Leve / Luta / Dança / Ioga");
    }
    else if (faixaEtaria==2) {System.out.println("Você poderá Praticar: Musculação Intensa / Musculação Moderada / Luta / Corrida / Dança / Ioga");}
    else if (faixaEtaria==3) {System.out.println("Você poderá Praticar: Musculação Intensa / Musculação Moderada / Luta / Dança / Corrida / Ioga");}
    else if (faixaEtaria==4) {System.out.println("Você poderá Praticar: Musculação Moderada / Musculação Leve / Luta / Dança / Ioga / Corrida / Pilates");}
    else if (faixaEtaria==5) {System.out.println("Você poderá Praticar: Musculação Leve / Dança / Pilates / Corrida / Ioga");}
    else if (faixaEtaria==6) {System.out.println("Você poderá Praticar: Musculação Leve / Dança / Pilates / Ioga");}
    }
}
    