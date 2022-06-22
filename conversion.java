import javax.swing.*;

public class conversion {

    public static  void main (String arg []){

        double pesosColombianos = 1;
        double bolivares = 00012;

        double Pc = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese la cantida de pesos colombianos a bolivares"));

        double calcular = Pc * bolivares;
        JOptionPane.showMessageDialog(null,"la conversion de Pc a bolivares es :" + calcular);
    }
}

