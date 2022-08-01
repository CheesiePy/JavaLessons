
import javax.swing.*;
import java.awt.*;

public class Calc{
    public static void main(String[] args) {
        // יצירת החלונית
        JFrame window = new JFrame();
        // X גורמת לחלונית להיסגר בלחיצה על
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // הגדרת גודל החלונית
        window.setSize(400, 280);
        // רכיב שלא נראה על המסך ובתוכו נשים את כל הרכיבים
        JPanel panel = new JPanel();
        // הוספת הפאנל לחלונית
        window.add(panel);

        // יצירת תיבת הטקסט
        JTextField textF = new JTextField(40);
        // הצבת תיבת הטקסט על החלון
        panel.add(textF);

        // יצירת כפתורים
        JButton buttonAdd = new JButton("+");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        JButton buttonMinus = new JButton("-");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");

        JButton buttonNultiple = new JButton("*");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JButton buttonClear = new JButton("Clear");
        JButton button0 = new JButton("0");
        JButton buttonDot = new JButton(".");
        JButton buttonDivide = new JButton("/");

        JButton buttonEqual = new JButton("=");
        // אורך ורוחב לכפתור
        button1.setPreferredSize(new Dimension(80, 30));
        button2.setPreferredSize(new Dimension(80, 30));
        button3.setPreferredSize(new Dimension(80, 30));
        buttonAdd.setPreferredSize(new Dimension(80, 30));

        button4.setPreferredSize(new Dimension(80, 30));
        button5.setPreferredSize(new Dimension(80, 30));
        button6.setPreferredSize(new Dimension(80, 30));
        buttonMinus.setPreferredSize(new Dimension(80, 30));

        button7.setPreferredSize(new Dimension(80, 30));
        button8.setPreferredSize(new Dimension(80, 30));
        button9.setPreferredSize(new Dimension(80, 30));
        buttonNultiple.setPreferredSize(new Dimension(80, 30));

        buttonClear.setPreferredSize(new Dimension(80, 30));
        button0.setPreferredSize(new Dimension(80, 30));
        buttonDot.setPreferredSize(new Dimension(80, 30));
        buttonDivide.setPreferredSize(new Dimension(80, 30));

        buttonEqual.setPreferredSize(new Dimension(340, 30));
        // צבע רקע לכפתור
        button1.setBackground(Color.red);
        button2.setBackground(Color.red);
        button3.setBackground(Color.red);
        buttonAdd.setBackground(Color.red);

        button4.setBackground(Color.red);
        button5.setBackground(Color.red);
        button6.setBackground(Color.red);
        buttonMinus.setBackground(Color.red);

        button7.setBackground(Color.red);
        button8.setBackground(Color.red);
        button9.setBackground(Color.red);
        buttonNultiple.setBackground(Color.red);

        buttonClear.setBackground(Color.red);
        button0.setBackground(Color.red);
        buttonDot.setBackground(Color.red);
        buttonDivide.setBackground(Color.red);

        buttonEqual.setBackground(Color.blue);

        // ארועים על הכפתורים
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            // מעבר עכבר
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setBackground(Color.GREEN);

            }
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button1.setBackground(Color.BLUE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setBackground(Color.red);
            }
        });

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            // מעבר עכבר
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2.setBackground(Color.red);
            }
        });

        // הוספת הכפתורים על הפאנל
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonAdd);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMinus);

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonNultiple);

        panel.add(buttonClear);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonDivide);

        panel.add(buttonEqual);

        // האם להציג את החלונית בהפעלת התוכנית
        window.setVisible(true);
    }
}
