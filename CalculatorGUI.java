import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.Arrays;
import java.lang.Math;


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

    static double[] sinList = new double[]{0, 0.017452406437284, 0.034899496702501, 0.052335956242944, 0.069756473744125, 0.087155742747658, 0.104528463267653, 0.121869343405147, 0.139173100960065, 0.156434465040231, 0.17364817766693, 0.190808995376545, 0.207911690817759, 0.224951054343865, 0.241921895599668, 0.258819045102521, 0.275637355816999, 0.292371704722737, 0.309016994374947, 0.325568154457157, 0.342020143325669, 0.3583679495453, 0.374606593415912, 0.390731128489274, 0.4067366430758, 0.422618261740699, 0.438371146789077, 0.453990499739547, 0.469471562785891, 0.484809620246337, 0.5, 0.515038074910054, 0.529919264233205, 0.544639035015027, 0.559192903470747, 0.573576436351046, 0.587785252292473, 0.601815023152048, 0.615661475325658, 0.629320391049837, 0.642787609686539, 0.656059028990507, 0.669130606358858, 0.681998360062499, 0.694658370458997, 0.707106781186548, 0.719339800338651, 0.73135370161917, 0.743144825477394, 0.754709580222772, 0.766044443118978, 0.777145961456971, 0.788010753606722, 0.798635510047293, 0.809016994374947, 0.819152044288992, 0.829037572555042, 0.838670567945424, 0.848048096156426, 0.857167300702112, 0.866025403784439, 0.874619707139396, 0.882947592858927, 0.891006524188368, 0.898794046299167, 0.90630778703665, 0.913545457642601, 0.92050485345244, 0.927183854566787, 0.933580426497202, 0.939692620785908, 0.945518575599317, 0.951056516295154, 0.956304755963035, 0.961261695938319, 0.965925826289068, 0.970295726275996, 0.974370064785235, 0.978147600733806, 0.981627183447664, 0.984807753012208, 0.987688340595138, 0.99026806874157, 0.992546151641322, 0.994521895368273, 0.996194698091746, 0.997564050259824, 0.998629534754574, 0.999390827019096, 0.999847695156391, 1};
    static double[] cosList = new double[sinList.length];
    static double[] tanList = new double[sinList.length];
    static double[] revTanList = new double[sinList.length];

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

        label = new JLabel("\n");
        label.setFont(new Font("Verdana", Font.PLAIN, 32));
        label.setHorizontalAlignment(SwingConstants.RIGHT);


        //b1.getActionForKeyStroke(KeyStroke.getKeyStroke("1"));


        b1 = new JButton(new AbstractAction("1") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "1");
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
                label.setText(evaluate(label.getText()));
            }
        });
        bClear = new JButton(new AbstractAction("clear") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(" ");
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
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("sin ");
                }
            }
        });
        bEvalTrig = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(evalTrig(label.getText()));
                resetTrig();
            }
        });
        bCos = new JButton(new AbstractAction("cos") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalTrig);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("cos ");
                }
            }
        });
        bTan = new JButton(new AbstractAction("tan") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalTrig);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("tan ");
                }
            }
        });
        bEvalInvTrig = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(evalInvTrig(label.getText()));
                resetInvTrig();
            }
        });
        bSinInv = new JButton(new AbstractAction("arcsin") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("arcsin ");
                }
            }
        });
        bCosInv = new JButton(new AbstractAction("arccos") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("arccos ");
                }
            }
        });
        bTanInv = new JButton(new AbstractAction("arctan") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalInvTrig);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("arctan ");
                }
            }
        });


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

        bEvalSqrt = new JButton(new AbstractAction("enter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(evalSqrt(label.getText().substring(1, label.getText().length())));
                resetSqrt();
            }
        });

        bSqrt = new JButton(new AbstractAction("√") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(bEnter);
                panel.add(bEvalSqrt);
                if(label.getText()!=" "){
                    label.setText("Error");
                }
                else{
                    label.setText("√");
                }
            }
        });
        panel.add(bSqrt);
        panel.add(bSin);
        panel.add(bCos);
        panel.add(bTan);
        panel.add(bSinInv);
        panel.add(bCosInv);
        panel.add(bTanInv);
        panel.add(bEnter);


        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.NORTH);
        frame.add(bClear, BorderLayout.SOUTH);
        frame.setSize(325, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        findCosList();
        findTanList();
        findReverseTanList();

        new CalculatorGUI();
    }

    public String evaluate(String expression){
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
        String num1Str = new String(num1List);
        double num1 = Double.parseDouble(num1Str);
        char operator = charList[counter];

        char[] num2List = new char[0];
        while (++counter < charList.length){
            num2List = Arrays.copyOf(num2List, num2List.length+1);
            num2List[num2List.length-1] = charList[counter];
            counter++;
        }
        String num2Str = new String(num2List);
        double num2 = Double.parseDouble(num2Str);

        double ans = 0;
        if (operator == '+'){
            ans = Add(num1, num2);
        }
        else if (operator == '-'){
            ans = Subtr(num1, num2);
        }
        else if (operator == '*'){
            ans = Mult(num1, num2);
        }
        else if (operator == '/'){
            ans = Div(num1, num2);
        }
        else if (operator == '^'){
            ans = Exp(num1, num2);
        }
        else{
            label.setText("something went wrong with the operator");
        }

        return Double.toString(ans);
    }

    public String evalSqrt(String expression){
        char[] numList = expression.toCharArray();
        String numStr = new String(numList);
        double num = Double.parseDouble(numStr);
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
        int num = Integer.parseInt(numStr);
        System.out.println(num);
        System.out.println(expression.substring(0, 3));
        if(expression.substring(0, 3).equals("sin")){
            if(num<=90){
                return Double.toString(sinList[num]);
            }
            else if(num<=180){
                return Double.toString(cosList[num-90]);
            }
            else if(num<=270){
                return Double.toString(sinList[num-180]*-1);
            }
            else if(num<=360){
                return Double.toString(cosList[num-270]*-1);
            }
            return "Error";
        }
        else if(expression.substring(0, 3).equals("cos")){
            if(num<=90){
                return Double.toString(cosList[num]);
            }
            else if(num<=180){
                return Double.toString(sinList[num-90]*-1);
            }
            else if(num<=270){
                return Double.toString(cosList[num-180]*-1);
            }
            else if(num<=360){
                return Double.toString(sinList[num-270]);
            }
            return "Error";
        }
        else if(expression.substring(0, 3).equals("tan")){
            if(num<=90){
                return Double.toString(tanList[num]);
            }
            else if(num<=180){
                return Double.toString(revTanList[num-90]*-1);
            }
            else if(num<=270){
                return Double.toString(tanList[num-180]);
            }
            else if(num<=360){
                return Double.toString(revTanList[num-270]*-1);
            }
            return "Error";
        }
        else{
            return "Error";
        }
    }

    public String evalInvTrig(String expression){
        char[] temp = expression.toCharArray();
        char[] numList = new char[0];
        for(int i=4; i<temp.length; i++){
            numList = Arrays.copyOf(numList, numList.length + 1);
            numList[numList.length-1] = temp[i];
        }
        String numStr = new String(numList);
        int num = Integer.parseInt(numStr);
        if(expression.substring(3, 6).equals("sin")){
            if(num>=0){
                for(int i=0; i<90; i++){
                    if(num==sinList[i]){
                        return Integer.toString(i);
                    }
                    else{
                        return "Error";
                    }
                }
            }
            else{
                num = num*-1;
                for(int i=0; i<90; i++){
                    if(num==sinList[i]){
                        return Integer.toString(i*-1);
                    }
                    else{
                        return "Error";
                    }
                }
            }
        }
        else if(expression.substring(3, 6).equals("cos")){
            if(num>=0){
                for(int i=0; i<90; i++){
                    if(num==cosList[i]){
                        return Integer.toString(i);
                    }
                    else{
                        return "Error";
                    }
                }
            }
            else{
                num = num*-1;
                for(int i=0; i<90; i++){
                    if(num==sinList[i]){
                        return Integer.toString(i+90);
                    }
                    else{
                        return "Error";
                    }
                }
            }
        }
        else if(expression.substring(3, 6).equals("tan")) {
            if (num >= 0) {
                for (int i = 0; i < 90; i++) {
                    if (num == tanList[i]) {
                        return Integer.toString(i);
                    } else {
                        return "Error";
                    }
                }
            } else {
                num = num * -1;
                for (int i = 0; i < 90; i++) {
                    if (num == tanList[i]) {
                        return Integer.toString(i * -1);
                    } else {
                        return "Error";
                    }
                }
            }
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
        return num1*num2;
    }
    public double Div(double num1, double num2){
        return (num1/num2);
    }
    public double Exp(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static void findCosList(){
        int j = sinList.length;
        for(int i=0; i<cosList.length; i++){
            cosList[j-1] = sinList[i];
            j = j-1;
        }
        for(int i=0; i<90; i++){
            System.out.print(cosList[i] + ", ");
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
    }
}
