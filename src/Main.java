import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int opMenu=0;
        while(opMenu!=7){
            System.out.println("===================================================");
            System.out.println("Seja bem-vindo/a ao Conversor de Moedas =]");
            System.out.print("1)Dólar =>> Peso argentino\n2)Peso argentino =>> Dólar\n3)Dólar =>> Real brasileiro\n4)Real brasileiro =>> Dólar\n5)Dólar =>> Peso colombiano\n6)Peso colombiano =>> Dólar\n7)Sair\n");
            System.out.println("===================================================");
            System.out.println("Escolha uma opção válida:");
            opMenu= leia.nextInt();
            if (opMenu != 7) {
                System.out.println("Digite o valor que deseja converter");
                double valor = leia.nextDouble();
                Conversor conversor = new Conversor();
                switch (opMenu){
                    case 1:
                        System.out.println((conversor.converte("USD","ARS", valor)));
                        break;
                    case 2:
                        System.out.println((conversor.converte("ARS","USD",valor)));
                        break;
                    case 3:
                        System.out.println((conversor.converte("USD","BRL",valor)));
                        break;
                    case 4:
                        System.out.println((conversor.converte("BRL","USD",valor)));
                        break;
                    case 5:
                        System.out.println((conversor.converte("USD","COP",valor)));
                        break;
                    case 6:
                        System.out.println((conversor.converte("COP","USD",valor)));
                        break;

                }
            }
        }

    }
}
