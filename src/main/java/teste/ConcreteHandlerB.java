package teste;

//Manipula e lida com as solicita��es entre 10 e 20
class ConcreteHandlerB extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicita��o for entre 10 e 20, o manipulador B cuida da solicita��o
     if (request >= 10 && request < 20) {
         System.out.println("Handler B tratou a solicita��o: " + request);
     } else if (nextHandler != null) {
         // Caso contr�rio, passa essa solicita��o para o pr�ximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
