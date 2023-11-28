// package multithreading

/**
 * transfer
 */
class Transfer {
  public void sendMessages(String message) {
    System.out.println(message+" is sending");
    try {
      Thread.sleep(1000); // delay 1 detik
    } catch (InterruptedException e) {
      // TODO: handle exception
      e.printStackTrace();
    }
    System.out.println("message terkirim");
  }
}

/**
 * messageTransfer
 */
class MessageTransfer extends Thread{
  private String message;
  Transfer msgTransfer;
  public MessageTransfer(String msg, Transfer trans) {
    message = msg;
    msgTransfer = trans;
  }
  @Override
  public void run() {
    synchronized (msgTransfer) {
      msgTransfer.sendMessages(message); //kirim pesan pake thread
    }
  }  
}

public class syncThread {
  public static void main(String[] args) {
    Transfer transfer = new Transfer();
    MessageTransfer msg1 = new MessageTransfer("Hello", transfer);
    MessageTransfer msg2 = new MessageTransfer("world", transfer);
    MessageTransfer msg3 = new MessageTransfer("JAVA", transfer);

    msg1.start();
    msg2.start();
    msg3.start();    
  }
}
