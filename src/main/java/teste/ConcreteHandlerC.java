package teste;

//Manipula e lida com as solicitações maiores ou iguais a 20
class ConcreteHandlerC extends Handler {
 @Override
 public void handleRequest(int request) {
     // Se a solicitação for maior ou igual a 20, o manipulador C cuida da solicitação
     if (request >= 20) {
         System.out.println("Handler C tratou a solicitação: " + request);
     } else if (nextHandler != null) {
         // Caso contrário, passa essa solicitação para o próximo manipulador
         nextHandler.handleRequest(request);
     }
 }
}
