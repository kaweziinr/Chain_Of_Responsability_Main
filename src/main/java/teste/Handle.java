package teste;

//Classe abstrata Handler define a interface para todos os manipuladores
abstract class Handler {
 // Referencia o próximo manipulador
 protected Handler nextHandler;

 // Define qual é o próximo manipulador
 public void setNextHandler(Handler nextHandler) {
     this.nextHandler = nextHandler;
 }

 // Esse método deve ser implementado pelos manipuladores para cuidar da solicitação
 public abstract void handleRequest(int request);
}
