package _06_GUI;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name");
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));

        JOptionPane.showMessageDialog(null,"Hello " + name);

        JOptionPane.showMessageDialog(null, "Your age is " + age);

        JOptionPane.showMessageDialog(null, "Your height is "+ height +"cm");
    }
}
