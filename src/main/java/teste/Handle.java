package teste;

//Classe abstrata Handler define a interface para todos os manipuladores
abstract class Handler {
 // Referencia o pr�ximo manipulador
 protected Handler nextHandler;

 // Define qual � o pr�ximo manipulador
 public void setNextHandler(Handler nextHandler) {
     this.nextHandler = nextHandler;
 }

 // Esse m�todo deve ser implementado pelos manipuladores para cuidar da solicita��o
 public abstract void handleRequest(int request);
}
