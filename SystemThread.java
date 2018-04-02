
import java.util.NoSuchElementException;

class WTDispatcher
{
  Agenda agenda = null;

  public WTDispatcher (){
    try {
      this.agenda = new Agenda();
    } catch(Exception e) {
      System.err.println("Cannot erad agenda: " + e.getMessage());
      System.exit(1);
    }
  }

  public void connect()
  {
    try {
      while (true) {
        String endpoint = this.agenda.read();
        System.out.println("Endpoint: " + endpoint);

        
      }
    }
    catch(NoSuchElementException nsee) {
      System.out.println("No more endpoints.");
    }
    catch(Exception e) {
      System.err.println("Failed to connect: " + e.getMessage());
    }
  }
}
