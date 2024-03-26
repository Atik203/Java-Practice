import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Type;
import javax.swing.*;


 class Calculator implements ActionListener {

     Font font = new Font("sans-serif",Font.BOLD,20);

     JFrame frame = new JFrame("Calculator");
     JTextField textField = new JTextField();
     JButton[] numberButton = new JButton[10];
     JButton[] functionButton = new JButton[9];
     JButton addButton,subtractButton,mulButton,divButton;
     JButton decimalButton,equalButton,deleteButton,clearButton ,negativeButton;

     JPanel panel = new JPanel();

     double num1 = 0,num2 = 0, result=0 ;
     char operator;


     Calculator(){
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(450,600);
         frame.setLayout(null);

         textField.setBounds(50,30,350,70);
         textField.setFont(font);
         textField.setEditable(false);
         textField.setBackground(Color.white);

         addButton = new JButton("+");
         subtractButton = new JButton("-");
         mulButton = new JButton("*");
         divButton = new JButton("/");
         equalButton = new JButton("=");
         decimalButton = new JButton(".");
         deleteButton = new JButton("Delete");
         clearButton = new JButton("Clear");
         negativeButton = new JButton("(-)");

         functionButton[0] = addButton;
         functionButton[1] = subtractButton;
         functionButton[2] = mulButton;
         functionButton[3] = divButton;
         functionButton[4] = equalButton;
         functionButton[5] = decimalButton;
         functionButton[6] = deleteButton;
         functionButton[7] = clearButton;
         functionButton[8] = negativeButton;


         for(int i=0;i<9;i++){
             functionButton[i].addActionListener(this);
             functionButton[i].setFont(font);
             functionButton[i].setFocusable(false);
         }

         for(int i=0;i<10;i++){
                numberButton[i] = new JButton(String.valueOf(i));
                numberButton[i].addActionListener(this);
                numberButton[i].setFont(font);
                numberButton[i].setFocusable(false);
         }

         negativeButton.setBounds(50,480,100,50);
         deleteButton.setBounds(180,480,100,50);
         clearButton.setBounds(300,480,100,50);



         panel.setBounds(50,100,350,350);
         panel.setLayout(new GridLayout(4,4,10,10));
         panel.setBackground(Color.lightGray);

         panel.add(numberButton[1]);
         panel.add(numberButton[2]);
         panel.add(numberButton[3]);
         panel.add(addButton);

         panel.add(numberButton[4]);
         panel.add(numberButton[5]);
         panel.add(numberButton[6]);
         panel.add(subtractButton);

         panel.add(numberButton[7]);
         panel.add(numberButton[8]);
         panel.add(numberButton[9]);
         panel.add(mulButton);

         panel.add(numberButton[0]);
         panel.add(divButton);
         panel.add(decimalButton);
         panel.add(equalButton);


         frame.add(panel);
         frame.add(negativeButton);
         frame.add(clearButton);
         frame.add(deleteButton);
         frame.add(textField);
         frame.setVisible(true);
     }





    @Override
    public void actionPerformed(ActionEvent e) {

       for(int i=0;i<10;i++)
       {
           if(e.getSource() == numberButton[i])
           {
               textField.setText(textField.getText().concat(String.valueOf(i)));
           }
       }

       if(e.getSource() == decimalButton)
       {
           textField.setText(textField.getText().concat("."));
       }
       if(e.getSource() == addButton)
       {
           num1 = Double.parseDouble(textField.getText());
           operator = '+';
           textField.setText("");
//           textField.setText(textField.getText().concat("+"));

       }
         if(e.getSource() == subtractButton)
         {
              num1 = Double.parseDouble(textField.getText());
              operator = '-';
              textField.setText("");
         }
            if(e.getSource() == mulButton)
            {
                num1 = Double.parseDouble(textField.getText());
                operator = '*';
                textField.setText("");
            }
            if(e.getSource() == divButton)
            {
                num1 = Double.parseDouble(textField.getText());
                operator = '/';
                textField.setText("");
            }

            if(e.getSource() == equalButton)
            {
                num2 = Double.parseDouble(textField.getText());
                switch(operator)
                {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }

                textField.setText(String.valueOf((int)result));
                num1 = result;

            }

            if(e.getSource() == clearButton)
            {
                textField.setText("");
            }

            if(e.getSource() == deleteButton)
            {
                String str = textField.getText();
                textField.setText("");
                for(int i=0;i<str.length()-1;i++)
                {
                    textField.setText(textField.getText()+str.charAt(i));
                }
            }

          if(e.getSource() == negativeButton)
          {
              double temp = Double.parseDouble(textField.getText());
              temp*=-1;
              textField.setText(String.valueOf(temp));

          }
    }

     public static void main(String[] args) {
        new Calculator();
     }
}
