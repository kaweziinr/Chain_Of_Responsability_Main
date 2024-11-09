package teste;

//Classe que configura os manipuladores e envia as solicitações
public class Client {
 public static void main(String[] args) {
     // Cria os manipuladores
     Handler handlerA = new ConcreteHandlerA();
     Handler handlerB = new ConcreteHandlerB();
     Handler handlerC = new ConcreteHandlerC();

     // Configura a cadeia
     handlerA.setNextHandler(handlerB);
     handlerB.setNextHandler(handlerC);

     // Solicitação do valor 5, se for menor que 10, será feita pelo Handler A
     System.out.println("Enviando solicitação de 5");
     handlerA.handleRequest(5);

     // Solicitação do valor 15, se for entre 10 e 20, será feita pelo Handler B
     System.out.println("\nEnviando solicitação de 15");
     handlerA.handleRequest(15);

     // Solicitação do valor 25, se maior que 20, será tratada pelo Handler C
     System.out.println("\nEnviando solicitação de 25");
     handlerA.handleRequest(25);
 }
}
