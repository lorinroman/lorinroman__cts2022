package prototype.main;

import prototype.clase.Autobuz;
import prototype.clase.Tramvai;

public class Program {

    public void main(String[] args) throws CloneNotSupportedException {
         Autobuz autobuz = new Autobuz("Andrei");
         Tramvai tramvai = new Tramvai("Mihai");

         Autobuz autobuz_copy = (Autobuz) autobuz.copy();
         Tramvai tramvai_copy = (Tramvai) tramvai.copy();

         System.out.println(autobuz);
         System.out.println(tramvai);
         System.out.println(autobuz_copy);
         System.out.println(tramvai_copy);




    }
}
