package teste;

//Manipula e lida com as solicita��es maiores ou iguais a 20
class ConcreteHandlerC extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicita��o for maior ou igual a 20, o manipulador C cuida da solicita��o
     if (request >= 20) {
         System.out.println("Handler C tratou a solicita��o: " + request);
     } else if (nextHandler != null) {
         // Caso contr�rio, passa essa solicita��o para o pr�ximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
