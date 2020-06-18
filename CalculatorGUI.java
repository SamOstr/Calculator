import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.util.Arrays;
import java.lang.Math;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;


public class CalculatorGUI{

    //int buttonText = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b0;
    JButton bAdd;
    JButton bSubtr;
    JButton bMult;
    JButton bDiv;
    JButton bEnter;
    JButton bClear;
    JButton bExp;
    JButton bDecimal;
    JButton bEvalSqrt;
    JButton bSqrt;
    JButton bSin;
    JButton bCos;
    JButton bTan;
    JButton bSinInv;
    JButton bCosInv;
    JButton bTanInv;
    JButton bEvalTrig;
    JButton bEvalInvTrig;
    JButton bAns;
    JButton bDel;
    JButton bPi;
    JButton bPercent;

    public String ans;
    public final double POSITIVE_ZERO = 0d;

    public void resetSqrt(){
        panel.remove(bEvalSqrt);
        panel.add(bEnter);
    }

    public void resetTrig(){
        panel.remove(bEvalTrig);
        panel.add(bEnter);
    }

    public void resetInvTrig(){
        panel.remove(bEvalInvTrig);
        panel.add(bEnter);
    }



    public CalculatorGUI(){
        frame = new JFrame();

        KeyListener listener = new KeyListener(){
            @Override
            public void keyPressed(KeyEvent event){
                if(String.valueOf(event.getKeyChar()).equals("1")){
                    label.setText(label.getText() + "1");
                }
                if(String.valueOf(event.getKeyChar()).equals("2")){
                    label.setText(label.getText() + "2");
                }
                if(String.valueOf(event.getKeyChar()).equals("3")){
                    label.setText(label.getText() + "3");
                }
                if(String.valueOf(event.getKeyChar()).equals("4")){
                    label.setText(label.getText() + "4");
                }
                if(String.valueOf(event.getKeyChar()).equals("5")){
                    label.setText(label.getText() + "5");
                }
                if(String.valueOf(event.getKeyChar()).equals("6")){
                    label.setText(label.getText() + "6");
                }
                if(String.valueOf(event.getKeyChar()).equals("7")){
                    label.setText(label.getText() + "7");
                }
                if(String.valueOf(event.getKeyChar()).equals("8")){
                    label.setText(label.getText() + "8");
                }
                if(String.valueOf(event.getKeyChar()).equals("9")){
                    label.setText(label.getText() + "9");
                }
                if(String.valueOf(event.getKeyChar()).equals("0")){
                    label.setText(label.getText() + "0");
                }
                if(String.valueOf(event.getKeyChar()).equals("+")){
                    label.setText(label.getText() + "+");
                }
                if(String.valueOf(event.getKeyChar()).equals("-")){
                    label.setText(label.getText() + "-");
                }
                if(String.valueOf(event.getKeyChar()).equals("*")){
                    label.setText(label.getText() + "*");
                }
                if(String.valueOf(event.getKeyChar()).equals("/")){
                    label.setText(label.getText() + "/");
                }
                if(String.valueOf(event.getKeyChar()).equals("\n")){
                    String var = evaluate(label.getText());
                    label.setText(var);
                    ans = var;
                }
                if(String.valueOf(event.getKeyChar()).equals("c")){
                    label.setText("\n");
                }
                if(String.valueOf(event.getKeyChar()).equals(".")){
                    label.setText(label.getText() + ".");
                }
                if(String.valueOf(event.getKeyChar()).equals("a")){
                    label.setText(label.getText() + ans);
                }
                if(String.valueOf(event.getKeyChar()).equals("\b")){
                    label.setText(label.getText().substring(0, label.getText().length()-1));
                }
                if(String.valueOf(event.getKeyChar()).equals("p")){
                    label.setText(label.getText() + Math.PI);
                }
                if(String.valueOf(event.getKeyChar()).equals("^")){
                    label.setText(label.getText() + "^");
                }
                if(String.valueOf(event.getKeyChar()).equals("%")){
                    label.setText(Double.toString(Double.parseDouble(label.getText())/100));
                }
            }
            @Override
            public void keyReleased(KeyEvent event){}
            @Override
            public void keyTyped(KeyEvent event){}
        };

        label = new JLabel("\n");
        label.setFont(new Font("Verdana", Font.PLAIN, 32));
        label.setHorizontalAlignment(SwingConstants.RIGHT);

        b1 = new JButton(new AbstractAction("1") {
            public void doClick(ActionEvent e) {
                label.setText(label.getText() + "1");
            }
            @Override
            public void actionPerformed(ActionEvent e){
                doClick(e);
            }
        });
        b2 = new JButton(new AbstractAction("2") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "2");
            }
        });
        b3 = new JButton(new AbstractAction("3") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "3");
            }
        });
        b4 = new JButton(new AbstractAction("4") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "4");
            }
        });
        b5 = new JButton(new AbstractAction("5") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "5");
            }
        });
        b6 = new JButton(new AbstractAction("6") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "6");
            }
        });
        b7 = new JButton(new AbstractAction("7") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "7");
            }
        });
        b8 = new JButton(new AbstractAction("8") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "8");
            }
        });
        b9 = new JButton(new AbstractAction("9") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "9");
            }
        });
        b0 = new JButton(new AbstractAction("0") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "0");
            }
        });
        bAdd = new JButton(new AbstractAction("+") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "+");
            }
        });
        bSubtr = new JButton(new AbstractAction("-") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "-");
            }
        });
        bMult = new JButton(new AbstractAction("*") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "*");
            }
        });
        bDiv = new JButton(new AbstractAction("/") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "/");
            }
        });
        bEnter = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var = evaluate(label.getText());
                label.setText(var);
                ans = var;
            }
        });
        bClear = new JButton(new AbstractAction("clear") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("\n");
            }
        });
        bExp = new JButton(new AbstractAction("^") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "^");
            }
        });
        bDecimal = new JButton(new AbstractAction(".") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + ".");
            }
        });
        bSin = new JButton(new AbstractAction("sin") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalTrig);
                label.setText("sin ");
                b1.addKeyListener(listener);
            }
        });
        bEvalTrig = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var = evaluate(label.getText());
                label.setText(var);
                ans = var;
                resetTrig();
            }
        });
        bCos = new JButton(new AbstractAction("cos") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalTrig);
                label.setText("cos ");
            }
        });
        bTan = new JButton(new AbstractAction("tan") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalTrig);
                label.setText("tan ");
            }
        });
        bEvalInvTrig = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var = evaluate(label.getText());
                label.setText(var);
                ans = var;
                resetInvTrig();
            }
        });
        bSinInv = new JButton(new AbstractAction("arcsin") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                label.setText("arcsin ");
            }
        });
        bCosInv = new JButton(new AbstractAction("arccos") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                label.setText("arccos ");
            }
        });
        bTanInv = new JButton(new AbstractAction("arctan") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                label.setText("arctan ");
            }
        });
        bAns = new JButton(new AbstractAction("ans") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + ans);
            }
        });
        bDel = new JButton(new AbstractAction("del") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText().substring(0, label.getText().length()-1));
            }
        });
        bPi = new JButton(new AbstractAction("π") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Math.PI);
            }
        });
        bPercent = new JButton(new AbstractAction("%") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(Double.toString(Double.parseDouble(label.getText())/100));
            }
        });
        bEvalSqrt = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var = evaluate(label.getText());
                label.setText(var);
                ans = var;
                resetSqrt();
            }
        });

        bSqrt = new JButton(new AbstractAction("√") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalSqrt);
                label.setText("√");
            }
        });

        b1.addKeyListener(listener);

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 3));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b0);
        panel.add(bDecimal);
        panel.add(bAdd);
        panel.add(bSubtr);
        panel.add(bMult);
        panel.add(bDiv);
        panel.add(bExp);
        panel.add(bSqrt);
        panel.add(bPercent);
        panel.add(bPi);
        panel.add(bSin);
        panel.add(bCos);
        panel.add(bTan);
        panel.add(bSinInv);
        panel.add(bCosInv);
        panel.add(bTanInv);
        panel.add(bAns);
        panel.add(bDel);
        panel.add(bEnter);


        /*frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                /*JButton typedButton = buttonMap.get(String.valueOf(e.getKeyChar()));
                if (typedButton!=null){
                    typedButton.doClick();
                }
                if(String.valueOf(e.getKeyChar())=="1"){
                    label.setText(label.getText() + "1");
                }
            }
            @Override
            public void keyReleased(KeyEvent e){}
        });*/

        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.NORTH);
        frame.add(bClear, BorderLayout.SOUTH);
        frame.setSize(325, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);

    }

    public static void main(String[] args) {
//        findCosList();
//        findTanList();
//        findReverseTanList();


        new CalculatorGUI();

    }

    public String eval2(String expression){
        //char[] temp = expression.toCharArray();
        char[] charList = expression.toCharArray(); //new char[temp.length-1];
        /*for (int i=1; i<temp.length; i++){
            charList[i-1]=temp[i];
        }*/
        char[] num1List = new char[0];
        int counter=0;
        while (counter < charList.length){
            if(charList[counter]=='+' || charList[counter]=='-' || charList[counter]=='/' || charList[counter]=='*' || charList[counter] ==
                    '^'){
                break;
            }
            num1List = Arrays.copyOf(num1List, num1List.length + 1);
            num1List[num1List.length-1] = charList[counter];
            counter++;
        }
        for(int i=0; i<charList.length; i++){
            if(charList[i]=='s' || charList[i]=='t'){
                for(int j=0; j<charList.length; j++){
                    if(charList[j]=='r'){
                        return evalInvTrig(expression);
                    }
                }
                return evalTrig(expression);
            }
        }
        String num1Str = new String(num1List);
        double num1 = Double.parseDouble(num1Str);
        char operator = charList[counter];

        char[] num2List = new char[0];
        counter++;
        while (counter < charList.length){
            num2List = Arrays.copyOf(num2List, num2List.length+1);
            num2List[num2List.length-1] = charList[counter];
            counter++;
        }
        String num2Str = new String(num2List);
        double num2 = Double.parseDouble(num2Str);

        double answer = 0;
        if (operator == '+'){
            answer = Add(num1, num2);
        }
        else if (operator == '-'){
            answer = Subtr(num1, num2);
        }
        else if (operator == '*'){
            answer = Mult(num1, num2);
        }
        else if (operator == '/'){
            answer = Div(num1, num2);
        }
        else if (operator == '^'){
            answer = Exp(num1, num2);
        }
        else{
            label.setText("something went wrong with the operator");
        }

        return Double.toString(answer);
    }

    public String evaluate(String expression){
        char[] numList = expression.toCharArray();
        for(int i=0; i<numList.length;i++){
            if(numList[i]==' '||numList[i]=='\n'){
                continue;
            }
            else if((!(isDigit(numList[i])||(isAlphabetic(numList[i]))))&&(!(numList[i]==' '||numList[i]=='\n'))){
                break;
            }
            else{
               return eval2(expression);
            }
        }
        String numStr = new String(numList);
        double num = Double.parseDouble(numStr.substring(1, numStr.length()));
        return Double.toString(Math.sqrt(num));
    }

    public String evalTrig(String expression){
        char[] temp = expression.toCharArray();
        char[] numList = new char[0];
        for(int i=4; i<temp.length; i++){
            numList = Arrays.copyOf(numList, numList.length + 1);
            numList[numList.length-1] = temp[i];
        }
        String numStr = new String(numList);
        Double num = Double.parseDouble(numStr);
        if(expression.substring(0, 3).equals("sin")){
            return Double.toString(round(Math.sin(Math.toRadians(num)), 15));
        }
        else if(expression.substring(0, 3).equals("cos")){
            return Double.toString(round(Math.cos(Math.toRadians(num)), 15));
        }
        else if(expression.substring(0, 3).equals("tan")){
            return Double.toString(round(Math.tan(Math.toRadians(num)), 15));
        }
        return "Error";
    }

    public String evalInvTrig(String expression){
        char[] temp = expression.toCharArray();
        char[] numList = new char[0];
        for(int i=7; i<temp.length; i++){
            numList = Arrays.copyOf(numList, numList.length + 1);
            numList[numList.length-1] = temp[i];
        }
        String numStr = new String(numList);
        double num = Double.parseDouble(numStr);
        if(expression.substring(3, 6).equals("sin")){
            return Double.toString(round(Math.toDegrees(Math.asin(num)), 2));
        }
        else if(expression.substring(3, 6).equals("cos")){
            return Double.toString(round(Math.toDegrees(Math.acos(num)), 2));
        }
        else if(expression.substring(3, 6).equals("tan")) {
            return Double.toString(round(Math.toDegrees(Math.atan(num)), 2));
        }
        return "Error";
    }

    public double Add(double num1, double num2){
        return num1+num2;
    }

    public double Subtr(double num1, double num2){
        return num1-num2;
    }

    public double Mult(double num1, double num2){
        return round(num1*num2, 2);
    }
    public double Div(double num1, double num2){
        return round(num1/num2, 2);
    }
    public double Exp(double num1, double num2){
        return round(Math.pow(num1, num2), 2);
    }

/*    public static void findCosList(){
        int j = sinList.length;
        for(int i=0; i<cosList.length; i++){
            cosList[j-1] = sinList[i];
            j = j-1;
        }
        for(int i=0; i<90; i++){
        }

    }

    public static void findTanList(){
        for(int i=0; i<90; i++){
            if(cosList[i]==0){
                tanList[i] = 2;
            }
            tanList[i] = sinList[i]/cosList[i];
        }
    }

    public static void findReverseTanList(){
        int j = 90;
        for(int i=0; i<90; i++){
            revTanList[j-1] = tanList[i];
            j = j-1;
        }
    }*/

    public double round(double x, int scale){
        return roundHelper(x, scale, BigDecimal.ROUND_HALF_UP);
    }

    public double roundHelper(double x, int scale, int roundingMethod){
        try{
            final double rounded = (new BigDecimal(Double.toString(x)).setScale(scale, roundingMethod)).doubleValue();
            return rounded== POSITIVE_ZERO ? POSITIVE_ZERO * x : rounded;
        } catch (NumberFormatException ex){
            if(Double.isInfinite(x)){
                return x;
            } else{
                return Double.NaN;
            }
        }
    }



}
