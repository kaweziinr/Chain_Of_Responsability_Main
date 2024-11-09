package teste;

//Manipula e lida com as solicita��es menores que 10
class ConcreteHandlerA extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicita��o for menor que 10, o manipulador A cuida da solicita��o
     if (request < 10) {
         System.out.println("Handler A tratou a solicita��o: " + request);
     } else if (nextHandler != null) {
         // Caso contr�rio, passa essa solicita��o para o pr�ximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
