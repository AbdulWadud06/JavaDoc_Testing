
public class Patient {

   public String name;
   public int PNR;
   public Patient next;

   public Patient(String na, int nr) {
      name = na;
      PNR = nr;

   }

   public Patient getNext() {

      return next;
   }

   public void setNext(Patient p) {

      next = p;
   }

   public String toString() {

      return name + "Besitzt die Nummer" + PNR;
   }
}
