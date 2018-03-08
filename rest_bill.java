
//The list of imports required for the program
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class rest_bill extends javax.swing.JFrame {
    //Declaration of all the variables required in the program
    int samosaCounter=0,eggPuffCounter=0,vegPuffCounter=0,pizzaCounter=0;
    //Declaration of constants
    final int samosaCost = 15;
    final int eggPuffCost = 25;
    final int vegPuffCost = 20;
    final int pizzaCost = 80;

    //Custom defined Exceptions
    class OutOfStock extends Exception
    {
        OutOfStock(String s)
        {
            JOptionPane.showMessageDialog(null,s +" Out of stock","Limited Stock",JOptionPane.WARNING_MESSAGE);
        }
    }   

    //Calculate call the costs in the program
    void calculate()
    {
        costSamosa.setText(""+samosaCounter*samosaCost);
        costVpuff.setText(""+vegPuffCounter*vegPuffCost);
        costEpuff.setText(""+eggPuffCounter*eggPuffCost);
        costPizza.setText(""+pizzaCounter*pizzaCost);
        costTotal.setText(""+(samosaCounter*samosaCost+vegPuffCounter*vegPuffCost+eggPuffCounter*eggPuffCost+pizzaCounter*pizzaCost));
    }

    //Constructor to intialize swing comonents and clock
    public rest_bill() {
        initComponents();

      //New Thread started for Clock using anonymous inner classes
        new Thread()
        {
            public void run()
            {
                while(true)
                {
                    Calendar calendar = new GregorianCalendar();
                    
                    int hour = calendar.get(Calendar.HOUR);
                    int min = calendar.get(Calendar.MINUTE);
                    int second =calendar.get(Calendar.SECOND);
                    int AM_PM = calendar.get(Calendar.AM_PM);
                    String A_P;
                   
                    if(AM_PM==1)
                        A_P="PM";
                    else
                        A_P="AM";
                        
                    String time = Integer.toString(hour)+":"+Integer.toString(min)+":"+Integer.toString(second)+" "+A_P;
                    clock.setText(time);
                   
                }
            }
        }.start();
    }

    
    //Method to initialize all the components in jFrame                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        decSamosa = new javax.swing.JButton();
        incSamosa = new javax.swing.JButton();
        decVpuff = new javax.swing.JButton();
        incVpuff = new javax.swing.JButton();
        decEpuff = new javax.swing.JButton();
        incEpuff = new javax.swing.JButton();
        decPizza = new javax.swing.JButton();
        incPizza = new javax.swing.JButton();
        qtySamosa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyVpuff = new javax.swing.JTextField();
        qtyEpuff = new javax.swing.JTextField();
        qtyPizza = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costSamosa = new javax.swing.JLabel();
        costVpuff = new javax.swing.JLabel();
        costEpuff = new javax.swing.JLabel();
        costPizza = new javax.swing.JLabel();
        GenBill = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        costTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("SnackShack Billing Service ");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Samosa");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("Veg Puff");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText("Egg Puff");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setText("Pizza");

        decSamosa.setBackground(new java.awt.Color(0, 204, 204));
        decSamosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        decSamosa.setText("-");
        decSamosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decSamosaActionPerformed(evt);
            }
        });

        incSamosa.setBackground(new java.awt.Color(0, 204, 204));
        incSamosa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        incSamosa.setText("+");
        incSamosa.setToolTipText("");
        incSamosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incSamosaActionPerformed(evt);
            }
        });

        decVpuff.setBackground(new java.awt.Color(0, 204, 204));
        decVpuff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        decVpuff.setText("-");
        decVpuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decVpuffActionPerformed(evt);
            }
        });

        incVpuff.setBackground(new java.awt.Color(0, 204, 204));
        incVpuff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        incVpuff.setText("+");
        incVpuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incVpuffActionPerformed(evt);
            }
        });

        decEpuff.setBackground(new java.awt.Color(0, 204, 204));
        decEpuff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        decEpuff.setText("-");
        decEpuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decEpuffActionPerformed(evt);
            }
        });

        incEpuff.setBackground(new java.awt.Color(0, 204, 204));
        incEpuff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        incEpuff.setText("+");
        incEpuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incEpuffActionPerformed(evt);
            }
        });

        decPizza.setBackground(new java.awt.Color(0, 204, 204));
        decPizza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        decPizza.setText("-");
        decPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decPizzaActionPerformed(evt);
            }
        });

        incPizza.setBackground(new java.awt.Color(0, 204, 204));
        incPizza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        incPizza.setText("+");
        incPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incPizzaActionPerformed(evt);
            }
        });

        qtySamosa.setEditable(false);
        qtySamosa.setText("0");
        qtySamosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtySamosaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Quantity");

        qtyVpuff.setEditable(false);
        qtyVpuff.setText("0");

        qtyEpuff.setEditable(false);
        qtyEpuff.setText("0");

        qtyPizza.setEditable(false);
        qtyPizza.setText("0");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Cost");

        costSamosa.setText("0");

        costVpuff.setText("0");

        costEpuff.setText("0");

        costPizza.setText("0");

        GenBill.setBackground(new java.awt.Color(51, 51, 51));
        GenBill.setForeground(new java.awt.Color(255, 255, 255));
        GenBill.setText("Generate Bill");
        GenBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenBillActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Total :");

        costTotal.setText("0");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setText("Cost/unit");

        jLabel15.setText("Rs 15");

        jLabel16.setText("Rs 20");

        jLabel17.setText("Rs 25");

        jLabel18.setText("Rs 80");

        Reset.setBackground(new java.awt.Color(51, 51, 51));
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Menu Items");

        clock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("00:00:00");

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Time");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        // Group Layout generated using Netbeans IDE 8.2
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(GenBill)
                                .addGap(18, 18, 18)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(decSamosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(decVpuff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(decEpuff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(decPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(incSamosa))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(incEpuff, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(incVpuff, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(incPizza))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addGap(51, 51, 51)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtySamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyEpuff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyVpuff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costVpuff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costEpuff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(qtySamosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(costSamosa))
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(incSamosa)
                                    .addComponent(decSamosa)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyVpuff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costVpuff)
                            .addComponent(incVpuff)
                            .addComponent(decVpuff)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(clock)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(decEpuff)
                    .addComponent(incEpuff)
                    .addComponent(costEpuff)
                    .addComponent(qtyEpuff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(decPizza)
                    .addComponent(incPizza)
                    .addComponent(costPizza)
                    .addComponent(qtyPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(GenBill)
                    .addComponent(jLabel12)
                    .addComponent(costTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(23, 23, 23))
        );

        pack();
    }                                                          
    //When generate bill button is clicked 
    private void GenBillActionPerformed(java.awt.event.ActionEvent evt) {                                      
        int i;
        FileWriter fw =null;
        BufferedWriter bw=null;
        
        try
        {
          String Restaurant_name = "****SnackShack****";
          fw = new FileWriter("Bill.txt");
          bw = new BufferedWriter(fw);
          bw.write(Restaurant_name);
          bw.newLine();
          bw.write("------------------");
          bw.newLine();
          bw.write("   [INVOICE]");
          bw.newLine();
          bw.write("Time: "+clock.getText());
          bw.newLine();
          bw.write("------------------");
          bw.newLine();
          bw.write("Item\t"+"Qty\t"+"Cost");
          bw.newLine();
          if(!(qtySamosa.getText().equals("0")))
          {
              bw.write("Samosa\t"+qtySamosa.getText()+"\t"+costSamosa.getText());
               bw.newLine();
          }
           if(!(qtyPizza.getText().equals("0")))
          {
              bw.write("Pizza\t"+qtyPizza.getText()+"\t"+costPizza.getText());
               bw.newLine();
          }
            if(!(qtyVpuff.getText().equals("0")))
          {
              bw.write("V.puff\t"+qtyVpuff.getText()+"\t"+costVpuff.getText());
               bw.newLine();
          }
             if(!(qtyEpuff.getText().equals("0")))
          {
              bw.write("E.puff\t"+qtyEpuff.getText()+"\t"+costEpuff.getText());
               bw.newLine();
          } 
              bw.write("------------------");
               bw.newLine();
             bw.write("Total   \t"+costTotal.getText());
               bw.newLine();
              bw.write("------------------");
              JOptionPane.showMessageDialog(null,"Bill succesfully generated","Print recipt",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e)
        {
          JOptionPane.showMessageDialog(null,"I/O Exception Occured","IO Exception",JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
        finally 
            {
                try {
                    if (bw != null)
			bw.close();

		if (fw != null)
			fw.close();

		    } 
                catch (IOException ex) 
                {
                  ex.printStackTrace();
		}
            }
    }                                                             

    private void incSamosaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //When the '+' button for Samosa is clicked 
         try
                {
                    samosaCounter++;
                    if(samosaCounter>5)
                        throw new OutOfStock("Samosa");//Error thrown if more than 5 samosas ordered
                }
                catch(OutOfStock e)
                {
                    samosaCounter--;
                }
                qtySamosa.setText(""+samosaCounter);
                calculate();
        
    }       
     private void decSamosaActionPerformed(java.awt.event.ActionEvent evt) {                                          
          //When the '-' button for Samosa is clicked 
                       samosaCounter--;
                if(samosaCounter<=0)
                {
                    samosaCounter = 0;
                }
                qtySamosa.setText(""+samosaCounter);
                calculate();
    }                                                     

    private void incVpuffActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //When the '+' button for Veg puff is clicked 
         try
                {
                    vegPuffCounter++;
                    if(vegPuffCounter>5)
                        throw new OutOfStock("Veg puff ");//Error thrown if more than 5 veg puffs ordered
                }
                catch(OutOfStock e)
                {
                    vegPuffCounter--;
                }
                qtyVpuff.setText(""+vegPuffCounter);
                calculate();
                
    }          
      private void decVpuffActionPerformed(java.awt.event.ActionEvent evt) {                                         
       //When the '-' button for Veg puff is clicked  
         vegPuffCounter--;
                if(vegPuffCounter<=0)
                {
                    vegPuffCounter = 0;
                }
                qtyVpuff.setText(""+vegPuffCounter);
                calculate();
    }                                   

private void incEpuffActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //When the '+' button for Egg puff is clicked 
         try
                {
                    eggPuffCounter++;
                    if(eggPuffCounter>5)
                        throw new OutOfStock("egg puff");  //Error thrown if more than 5 egg puffs ordered
                }
                catch(OutOfStock e)
                {
                    eggPuffCounter--;
                }
                qtyEpuff.setText(""+eggPuffCounter);
                calculate();
    }                                        
   
    private void decEpuffActionPerformed(java.awt.event.ActionEvent evt) {                                         
       //When the '-' button for Egg puff is clicked 
         eggPuffCounter--;
                if(eggPuffCounter<=0)
                {
                    eggPuffCounter = 0;
                }
                qtyEpuff.setText(""+eggPuffCounter);
                calculate();
    }                                        

private void incPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                         
      //When the '+' button for Pizza is clicked
        try
                {
                    pizzaCounter++;
                    if(pizzaCounter>5)
                        throw new OutOfStock("pizza");  //Error thrown if more than 5 Pizzas ordered
                }
                catch(OutOfStock e)
                {
                    pizzaCounter--;
                }
                qtyPizza.setText(""+pizzaCounter);
                calculate();
    }
    private void decPizzaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //When the '-' button for Pizza is clicked 
         pizzaCounter--;
                if(pizzaCounter<=0)
                {
                    pizzaCounter = 0;
                }
                qtyPizza.setText(""+pizzaCounter);
                calculate();
    }                                        

                                            

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // To bring all the GUI components to their initial state
        costEpuff.setText("0");
        costVpuff.setText("0");
        costPizza.setText("0");
        costSamosa.setText("0");
        qtySamosa.setText("0");
        qtyVpuff.setText("0");
        qtyEpuff.setText("0");
        qtyPizza.setText("0");
        costTotal.setText("0");
        samosaCounter=eggPuffCounter=vegPuffCounter=pizzaCounter=0;
        
    }                                     

    private void qtySamosaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rest_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rest_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rest_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rest_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rest_bill().setVisible(true);
            }
        });
    }

    // Variables declaration                   
    private javax.swing.JButton GenBill;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel costEpuff;
    private javax.swing.JLabel costPizza;
    private javax.swing.JLabel costSamosa;
    private javax.swing.JLabel costTotal;
    private javax.swing.JLabel costVpuff;
    private javax.swing.JButton decEpuff;
    private javax.swing.JButton decPizza;
    private javax.swing.JButton decSamosa;
    private javax.swing.JButton decVpuff;
    private javax.swing.JButton incEpuff;
    private javax.swing.JButton incPizza;
    private javax.swing.JButton incSamosa;
    private javax.swing.JButton incVpuff;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField qtyEpuff;
    private javax.swing.JTextField qtyPizza;
    private javax.swing.JTextField qtySamosa;
    private javax.swing.JTextField qtyVpuff;
    // End of variables declaration                   
}
