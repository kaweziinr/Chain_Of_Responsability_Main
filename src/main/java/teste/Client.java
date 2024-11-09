package teste;

//Classe que configura os manipuladores e envia as solicita��es
public class Client {
 public static void main(String[] args) {
     // Cria os manipuladores
     Handler handlerA = new ConcreteHandlerA();
     Handler handlerB = new ConcreteHandlerB();
     Handler handlerC = new ConcreteHandlerC();

     // Configura a cadeia
     handlerA.setNextHandler(handlerB);
     handlerB.setNextHandler(handlerC);

     // Solicita��o do valor 5, se for menor que 10, ser� feita pelo Handler A
     System.out.println("Enviando solicita��o de 5");
     handlerA.handleRequest(5);

     // Solicita��o do valor 15, se for entre 10 e 20, ser� feita pelo Handler B
     System.out.println("\nEnviando solicita��o de 15");
     handlerA.handleRequest(15);

     // Solicita��o do valor 25, se maior que 20, ser� tratada pelo Handler C
     System.out.println("\nEnviando solicita��o de 25");
     handlerA.handleRequest(25);
 }
}
