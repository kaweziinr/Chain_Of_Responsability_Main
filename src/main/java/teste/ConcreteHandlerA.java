package teste;

//Manipula e lida com as solicitações menores que 10
class ConcreteHandlerA extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicitação for menor que 10, o manipulador A cuida da solicitação
     if (request < 10) {
         System.out.println("Handler A tratou a solicitação: " + request);
     } else if (nextHandler != null) {
         // Caso contrário, passa essa solicitação para o próximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
