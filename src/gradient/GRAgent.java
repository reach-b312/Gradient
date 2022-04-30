package gradient;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import javax.swing.JOptionPane;

public class GRAgent extends Agent {
  @Override
  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new GRBehaviour());
  } 

  private class GRBehaviour extends Behaviour {
    int cont=0;
    @Override
    public void action() {
            Gradient GR = new Gradient();
            GR.Beta0();
            GR.Beta1();
            System.out.println("");
            GR.Error();
            System.out.println("");
            GR.predict();
    } 
    @Override
    public boolean done() {
      if (cont == 1)
        return true;
      else
	return false;
    }
   @Override
    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}