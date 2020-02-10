
package semester_project_1;

import java.util.Stack;
import java.lang.String;

/**
 *Student : Kristina Upadhaya
 *Class   : CS 2336.501
 *Due Date: April 15, 2018
 *Semester Project 1
 *Purpose : This program will allow user to perform programmer calculation.
 * 
 */
public class Programmer_Calculator extends javax.swing.JFrame {
    
    //Declaring variables
    static int modCtr = 0;
    static int up= 0;
    double number, answer;
    int cal;
    
    // This method performs arithmetic calculation
    public void Calculation_Part(){
        
        switch(cal){
            case 1: //Case 1 performs addition
                answer = number + Double.parseDouble(jTextField1.getText()); //Converts String into Double
                jTextField1.setText(Double.toString(answer)); //Converts Double into String
                //jTextField1.setText("");
                break;
            case 2: //Case 2 performs subtraction
                answer = number - Double.parseDouble(jTextField1.getText()); //Converts String into Double
                jTextField1.setText(Double.toString(answer)); //Converts Double into String
                break;    
            case 3: //Case 3 performs multiplication
                answer = number * Double.parseDouble(jTextField1.getText()); //Converts String into Double
                jTextField1.setText(Double.toString(answer)); //Converts Double into String
                break; 
            case 4: //Case 4 performs division
                answer = number / Double.parseDouble(jTextField1.getText()); //Converts String into Double
                jTextField1.setText(Double.toString(answer)); //Converts Double into String
                break;
                
            case 5: //Case 5 performs MOD
                answer = number % Double.parseDouble(jTextField1.getText()); //Convert String into Double
                jTextField1.setText(Double.toString(answer)); //Converts Double into String
                break;
        
        }
    
    }
    //This method changes the Lsh and Rsh buttons to RoL and RoR when you press UpArrow button 
    public void pressUpArrow(){
        int x = up % 2; //0, 1, 2
        
        switch(x){
            case 0: 
                Lsh.setText("RoL");
                Rsh.setText("RoR");
                break;  
            case 1: 
                Lsh.setText("Lsh");
                Rsh.setText("Rsh");
                break;
            default:
                break;
        }
        
    }
    // This method enables all the button when you pressed Hex, Dec, Oct, and Bin buttons individually as user desired
    public void restBut(){
     
        //Enable decimal button when you press Hex button
        Decimal.setEnabled(true);
        
        //Enable A, B, C, D, E, F, decimal when you press DEC button
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        Decimal.setEnabled(true);
         
        //Enable A, B, C, D, E, F, decimal, eight, nine when you press Oct button
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        Decimal.setEnabled(true);
        Eight.setEnabled(true);
        Nine.setEnabled(true);
       
        //Enable A, B, C, D, E, F, decimal, 2-9 when you press Bin button
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        Decimal.setEnabled(true);
        Nine.setEnabled(true);
        Eight.setEnabled(true);
        Seven.setEnabled(true);
        Six.setEnabled(true);
        Five.setEnabled(true);
        Four.setEnabled(true);
        Three.setEnabled(true);
        Two.setEnabled(true); 
    }
    
    public void QWordMode(){

    }
     public void DWordMode(){
    
    }
      public void WordMode(){
    
    }
    public void ByteMode(){
    
    }
    
    //set method for conversion of Hexadecimal, decimal, octal, and binary
    public void setHDOB(){
        try{
            String numberInput = jTextField1.getText();
            int numI= (int)Double.parseDouble(numberInput);
    
            jTextField2.setText(Integer.toHexString(numI));
         
            jTextField3.setText(Integer.toString(numI));
       
            jTextField4.setText(Integer.toOctalString(numI));
      
            jTextField5.setText(Integer.toBinaryString(numI));
            
     }
      catch(Exception e){
           jTextField2.setText("");
           jTextField5.setText("");
           jTextField3.setText("");
           jTextField4.setText("");
      }
    }

   
   
    public Programmer_Calculator() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        FullKeyboard = new javax.swing.JButton();
        BitTogglingKeyboard = new javax.swing.JButton();
        QWORD = new javax.swing.JButton();
        MS = new javax.swing.JButton();
        M = new javax.swing.JButton();
        Lsh = new javax.swing.JButton();
        UpArrow = new javax.swing.JButton();
        A = new javax.swing.JButton();
        C = new javax.swing.JButton();
        E = new javax.swing.JButton();
        LeftBracket = new javax.swing.JButton();
        Rsh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Xor = new javax.swing.JButton();
        Not = new javax.swing.JButton();
        And = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        B = new javax.swing.JButton();
        D = new javax.swing.JButton();
        F = new javax.swing.JButton();
        RightBracket = new javax.swing.JButton();
        Backspace = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Addition = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Subtraction = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Multiplication = new javax.swing.JButton();
        PlusMinusCalculation = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Decimal = new javax.swing.JButton();
        EqualSigns = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HEX = new javax.swing.JButton();
        DEC = new javax.swing.JButton();
        OCT = new javax.swing.JButton();
        BIN = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        FullKeyboard.setBackground(new java.awt.Color(203, 203, 203));
        FullKeyboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semester_project_1/ttttttttttttttttttttttttttttttttttttttttttttt.PNG"))); // NOI18N
        FullKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullKeyboardActionPerformed(evt);
            }
        });

        BitTogglingKeyboard.setBackground(new java.awt.Color(203, 203, 203));
        BitTogglingKeyboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kristi lenovo\\Desktop\\yyyyyyyyyyyyyyyyyyyyyyy.PNG")); // NOI18N
        BitTogglingKeyboard.setBorderPainted(false);
        BitTogglingKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitTogglingKeyboardActionPerformed(evt);
            }
        });

        QWORD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QWORD.setText("QWORD");
        QWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QWORDActionPerformed(evt);
            }
        });

        MS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MS.setText("MS");

        M.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        M.setText("M");

        Lsh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lsh.setText("Lsh");
        Lsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LshActionPerformed(evt);
            }
        });

        UpArrow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UpArrow.setText("↑");
        UpArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpArrowActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        LeftBracket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LeftBracket.setText("(");
        LeftBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftBracketActionPerformed(evt);
            }
        });

        Rsh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rsh.setText("Rsh");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Or");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Xor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Xor.setText("Xor");

        Not.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Not.setText("Not");

        And.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        And.setText("And");

        Mod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mod.setText("Mod");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        RightBracket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RightBracket.setText(")");
        RightBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightBracketActionPerformed(evt);
            }
        });

        Backspace.setFont(new java.awt.Font("Wingdings", 1, 18)); // NOI18N
        Backspace.setText("");
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });

        CE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        Seven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Eight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Nine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Addition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Addition.setText("+");
        Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionActionPerformed(evt);
            }
        });

        Four.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Six.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Subtraction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Subtraction.setText("-");
        Subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractionActionPerformed(evt);
            }
        });

        One.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Division.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Division.setText("÷");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });

        Multiplication.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Multiplication.setText("*");
        Multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationActionPerformed(evt);
            }
        });

        PlusMinusCalculation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlusMinusCalculation.setText("±");
        PlusMinusCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusMinusCalculationActionPerformed(evt);
            }
        });

        Zero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Decimal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Decimal.setText(".");
        Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecimalActionPerformed(evt);
            }
        });

        EqualSigns.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EqualSigns.setText("=");
        EqualSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualSignsActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        HEX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HEX.setText("HEX");
        HEX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HEXActionPerformed(evt);
            }
        });

        DEC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DEC.setText("DEC");
        DEC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECActionPerformed(evt);
            }
        });

        OCT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OCT.setText("OCT");
        OCT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        OCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCTActionPerformed(evt);
            }
        });

        BIN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BIN.setText("BIN");
        BIN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BINActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Programmer");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semester_project_1/aaaaaaaaaaaaaaaaaaaaaa.PNG"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LeftBracket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(E, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(A, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpArrow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FullKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RightBracket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BitTogglingKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Backspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(QWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Xor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Not, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(And, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Subtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Four, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(One, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(PlusMinusCalculation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Two, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Five, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Zero, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EqualSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Addition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HEX, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(DEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HEX, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OCT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BIN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BitTogglingKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Lsh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Rsh, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(And, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Not, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Xor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Division, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addition, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EqualSigns, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Zero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LeftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlusMinusCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Decimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        jTextField1.setText(jTextField1.getText() + "A");
        
       
    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        jTextField1.setText(jTextField1.getText() + "C");
        
    }//GEN-LAST:event_CActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        jTextField1.setText(jTextField1.getText() + "E");
        
    }//GEN-LAST:event_EActionPerformed

    private void LeftBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftBracketActionPerformed
        jTextField1.setText(jTextField1.getText() + "(");
        
    }//GEN-LAST:event_LeftBracketActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LshActionPerformed

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceActionPerformed
        //Declaring length and num variables
        //get method to retrieve the current text in the text field
        //length() method is used to return the length of the string.
        //length()-1, this substract 1 from length.
        //Declare String keeep
        
        int length = jTextField1.getText().length();
        int num = jTextField1.getText().length() - 1;
        String keep;
        
        //Using if/else statement to check the length
        //StringBuilder creates empty string builder that stores Strings.
        
        if(length > 0){
            
            //Creating an object name end of StringBuilder
            //get method called jTextField2.getText() is used to store the value of text field in StringBuilder end
            StringBuilder end = new StringBuilder(jTextField1.getText());
            end.deleteCharAt(num);     //this method is use to delete a single character from specific position
            keep = end.toString();     //it converts StringBuilder end into String as TextField only take String value
            jTextField1.setText(keep);  //keep variable set in setText() method.
       setHDOB();
        }
        
    }//GEN-LAST:event_BackspaceActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        jTextField1.setText("0");
        setHDOB();
    }//GEN-LAST:event_CEActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
        setHDOB();
    }//GEN-LAST:event_SevenActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jTextField1.setText("");
        jLabel1.setText("");
        setHDOB();
    }//GEN-LAST:event_ClearActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
        setHDOB();
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
        setHDOB();
    }//GEN-LAST:event_NineActionPerformed

    private void AdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionActionPerformed
        number = Double.parseDouble(jTextField1.getText()); //Converts string into double
        cal = 1; //Calling case 1 switch statement
        jTextField1.setText("");//Clearing text field
        jLabel1.setText(number + "+"); //displaying current number and plus sign on label
    }//GEN-LAST:event_AdditionActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
        setHDOB();
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
         jTextField1.setText(jTextField1.getText() + "5");
         setHDOB();
    }//GEN-LAST:event_FiveActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
        setHDOB();
    }//GEN-LAST:event_SixActionPerformed

    private void SubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractionActionPerformed
        number = Double.parseDouble(jTextField1.getText()); //Converts string into double
        cal = 2; //Calling case 2 switch statement
        jTextField1.setText("");//Clearing text field
        jLabel1.setText(number + "-"); //displaying current number and minus sign on label
    }//GEN-LAST:event_SubtractionActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
        setHDOB();
    }//GEN-LAST:event_OneActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
         jTextField1.setText(jTextField1.getText() + "2");
         setHDOB();
    }//GEN-LAST:event_TwoActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
         jTextField1.setText(jTextField1.getText() + "3");
         setHDOB();
    }//GEN-LAST:event_ThreeActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        number = Double.parseDouble(jTextField1.getText()); //Converts string into double
        cal = 4; //Calling case 4 switch statement
        jTextField1.setText("");//Clearing text field
        jLabel1.setText(number + "/"); //displaying current number and division sign on label
    }//GEN-LAST:event_DivisionActionPerformed

    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicationActionPerformed
       number = Double.parseDouble(jTextField1.getText()); //Converts string into double
        cal = 3; //Calling case 3 switch statement
        jTextField1.setText("");//Clearing text field
        jLabel1.setText(number + "*"); //displaying current number and multiplication sign on label
    }//GEN-LAST:event_MultiplicationActionPerformed

    private void PlusMinusCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusMinusCalculationActionPerformed
        double plusMinus = Double.parseDouble(String.valueOf(jTextField1.getText()));
        plusMinus = plusMinus * (-1);
        jTextField1.setText(String.valueOf(plusMinus));
    }//GEN-LAST:event_PlusMinusCalculationActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
         jTextField1.setText(jTextField1.getText() + "0");
         setHDOB();
    }//GEN-LAST:event_ZeroActionPerformed

    private void DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecimalActionPerformed
         jTextField1.setText(jTextField1.getText() + ".");
         
    }//GEN-LAST:event_DecimalActionPerformed

    private void EqualSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualSignsActionPerformed
        Calculation_Part(); //Calling calculation part method
        jLabel1.setText("");
        setHDOB();
    }//GEN-LAST:event_EqualSignsActionPerformed

    private void HEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HEXActionPerformed
        restBut();        //initComponents();
        jTextField1.setText(jTextField1.getText());
        Decimal.setEnabled(false);
        //run();
        
    }//GEN-LAST:event_HEXActionPerformed

    private void DECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECActionPerformed
        restBut();
        jTextField1.setText(jTextField1.getText());
        
        //Disable A B C D E F and decimal when you press DEC button
        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        E.setEnabled(false);
        F.setEnabled(false);
        Decimal.setEnabled(false);
         
    }//GEN-LAST:event_DECActionPerformed
      
    private void QWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QWORDActionPerformed
       
        int choice1 = modCtr % 4;//0,1,2,3
        
        //switching the jbuttons.
        switch(choice1){
            case 0:
                QWORD.setText("QWORD");
                break;
            case 1:
                QWORD.setText("DWORD");
                break;
            case 2:
                QWORD.setText("WORD");
                break;
            case 3:
                QWORD.setText("BYTE");
                break;
            default:
                break;           
        }
        modCtr++;
        
    }//GEN-LAST:event_QWORDActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        number = Double.parseDouble(jTextField1.getText()); //Converts string into double
        cal = 5; //Calling case 5 switch statement
        jTextField1.setText("");//Clearing text field
        jLabel1.setText(number + " MOD "); //displaying current number and MOD sign on label
    }//GEN-LAST:event_ModActionPerformed

    private void UpArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpArrowActionPerformed
           pressUpArrow();
           up++;
           
    }//GEN-LAST:event_UpArrowActionPerformed

    private void OCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCTActionPerformed
        restBut();
        jTextField1.setText(jTextField1.getText());
        
        //Disable A, B, C, D, E, F, decimal, eight, nine when you press DEC button
        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        E.setEnabled(false);
        F.setEnabled(false);
        Decimal.setEnabled(false);
        Eight.setEnabled(false);
        Nine.setEnabled(false);
       
        
    }//GEN-LAST:event_OCTActionPerformed

    private void BINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BINActionPerformed
        restBut();
        jTextField1.setText(jTextField1.getText());
        
        //Disable A, B, C, D, E, F, decimal, 2-9 when you press DEC button
        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        E.setEnabled(false);
        F.setEnabled(false);
        Decimal.setEnabled(false);
        Nine.setEnabled(false);
        Eight.setEnabled(false);
        Seven.setEnabled(false);
        Six.setEnabled(false);
        Five.setEnabled(false);
        Four.setEnabled(false);
        Three.setEnabled(false);
        Two.setEnabled(false);
        
    }//GEN-LAST:event_BINActionPerformed

    private void RightBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightBracketActionPerformed
       jTextField1.setText(jTextField1.getText() + ")");
    }//GEN-LAST:event_RightBracketActionPerformed

    private void BitTogglingKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitTogglingKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BitTogglingKeyboardActionPerformed

    private void FullKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullKeyboardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        jTextField1.setText(jTextField1.getText() + "D");
    }//GEN-LAST:event_DActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        jTextField1.setText(jTextField1.getText() + "F");
    }//GEN-LAST:event_FActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        jTextField1.setText(jTextField1.getText() + "B");
    }//GEN-LAST:event_BActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programmer_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programmer_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton Addition;
    private javax.swing.JButton And;
    private javax.swing.JButton B;
    private javax.swing.JButton BIN;
    private javax.swing.JButton Backspace;
    private javax.swing.JButton BitTogglingKeyboard;
    private javax.swing.JButton C;
    private javax.swing.JButton CE;
    private javax.swing.JButton Clear;
    private javax.swing.JButton D;
    private javax.swing.JButton DEC;
    private javax.swing.JButton Decimal;
    private javax.swing.JButton Division;
    private javax.swing.JButton E;
    private javax.swing.JButton Eight;
    private javax.swing.JButton EqualSigns;
    private javax.swing.JButton F;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton FullKeyboard;
    private javax.swing.JButton HEX;
    private javax.swing.JButton LeftBracket;
    private javax.swing.JButton Lsh;
    private javax.swing.JButton M;
    private javax.swing.JButton MS;
    private javax.swing.JButton Mod;
    private javax.swing.JButton Multiplication;
    private javax.swing.JButton Nine;
    private javax.swing.JButton Not;
    private javax.swing.JButton OCT;
    private javax.swing.JButton One;
    private javax.swing.JButton PlusMinusCalculation;
    private javax.swing.JButton QWORD;
    private javax.swing.JButton RightBracket;
    private javax.swing.JButton Rsh;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Subtraction;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton UpArrow;
    private javax.swing.JButton Xor;
    private javax.swing.JButton Zero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
