package teste;

//Manipula e lida com as solicitações entre 10 e 20
class ConcreteHandlerB extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicitação for entre 10 e 20, o manipulador B cuida da solicitação
     if (request >= 10 && request < 20) {
         System.out.println("Handler B tratou a solicitação: " + request);
     } else if (nextHandler != null) {
         // Caso contrário, passa essa solicitação para o próximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
