
import javax.swing.JOptionPane;
public class Ejercio_No6 {
    public static void main(String args[]) {
       
        int N;
          N=Short.parseShort(JOptionPane.showInputDialog("INGRESE UN NUMERO PARA SABER SI ES PAR O IMPAR"));
   
          if (N%2==0){
           JOptionPane.showMessageDialog(null,"El numero: "  + N  + " Es par");
         } else  {
           JOptionPane.showMessageDialog(null,"El numero: " +  N  + " Es Impar");
          }
    }
}
    

