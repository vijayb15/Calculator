import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame  {


    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, mul, div, sub, equal, clear;
    TextField t1;

    Calculator() {
        setBackground(Color.BLACK);
        TextField t1 = new TextField("0");
        t1.setBounds(200, 130, 225, 40);
        Button b1 = new Button("1");
        b1.setBounds(200, 190, 45, 45);
        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "1";
                t1.setText(s);
            }
        };
        b1.addActionListener(a1);
        Button b2 = new Button("2");
        b2.setBounds(260, 190, 45, 45);
        ActionListener a2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "2";
                t1.setText(s);
            }
        };
        b2.addActionListener(a2);
        Button b3 = new Button("3");
        b3.setBounds(320, 190, 45, 45);
        ActionListener a3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "3";
                t1.setText(s);
            }
        };
        b3.addActionListener(a3);
        Button add = new Button("+");
        add.setBounds(380, 190, 45, 45);
        ActionListener aa = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "+";
                t1.setText(s);
            }
        };
        add.addActionListener(aa);
        Button b4 = new Button("4");
        b4.setBounds(200, 240, 45, 45);
        ActionListener a4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "4";
                t1.setText(s);
            }
        };
        b4.addActionListener(a4);
        Button b5 = new Button("5");
        b5.setBounds(260, 240, 45, 45);
        ActionListener a5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "5";
                t1.setText(s);
            }
        };
        b5.addActionListener(a5);
        Button b6 = new Button("6");
        b6.setBounds(320, 240, 45, 45);
        ActionListener a6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "6";
                t1.setText(s);
            }
        };
        b6.addActionListener(a6);
        Button sub = new Button("-");
        sub.setBounds(380, 240, 45, 45);
        ActionListener as = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "-";
                t1.setText(s);
            }
        };
        sub.addActionListener(as);
        Button b7 = new Button("7");
        b7.setBounds(200, 300, 45, 45);
        ActionListener a7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "7";
                t1.setText(s);
            }
        };
        b7.addActionListener(a7);
        Button b8 = new Button("8");
        b8.setBounds(260, 300, 45, 45);
        ActionListener a8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "8";
                t1.setText(s);
            }
        };
        b8.addActionListener(a8);
        Button b9 = new Button("9");
        b9.setBounds(320, 300, 45, 45);
        ActionListener a9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "9";
                t1.setText(s);
            }
        };
        b9.addActionListener(a9);
        Button mul = new Button("x");
        mul.setBounds(380, 300, 45, 45);
        ActionListener am = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "x";
                t1.setText(s);
            }
        };
        mul.addActionListener(am);
        Button b0 = new Button("0");
        b0.setBounds(200, 360, 45, 45);
        ActionListener a0 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "0";
                t1.setText(s);
            }
        };
        b0.addActionListener(a0);
        Button div = new Button("%");
        div.setBounds(260, 360, 45, 45);
        ActionListener ad = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                s += "%";
                t1.setText(s);
            }
        };
        div.addActionListener(ad);
        Button clear = new Button("C");
        clear.setBounds(320, 360, 45, 45);
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("0");
            }
        };
        clear.addActionListener(ac);
        Button equal = new Button("=");
        equal.setBounds(380, 360, 45, 45);
        ActionListener ae = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int a,b,i;
              char op = '+';
              String ex = t1.getText();
              String ta = "",tb = "";
              for(i = 0;i < ex.length();i++){
                  if(Character.isDigit(ex.charAt(i))){
                      ta += ex.charAt(i);

                  }
                  else {
                      op = ex.charAt(i);
                      break;
                  }
              }
              tb = ex.substring(i+1);
              a = Integer.parseInt(ta);
              b = Integer.parseInt(tb);
              int res = 0;
              switch(op) {
                  case '+':
                      res = a+b;
                      break;
                  case '-':
                      res = a-b;
                      break;
                  case 'x':
                      res = a*b;
                      break;
                  case '%':
                      res = a/b;
                      break;

              }
              t1.setText(String.valueOf(res));
            }
        };
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        equal.addActionListener(ae);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(equal);
        add(clear);
        setSize(700, 700);
        setLayout(null);
        setTitle("Calc");
        setVisible(true);


    }


    public static void main (String[]args){

        Calculator c = new Calculator();

    }
}

