package confeccionUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class UsoLayouts extends JFrame {

  private JPanel contentPane;
  private JTextField textField;
  private JTextField textField_1;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          UsoLayouts frame = new UsoLayouts();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public UsoLayouts() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1000, 700 );
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBounds(10, 10, 117, 106);
    contentPane.add(panel);
    panel.setLayout(null);
    
    JButton btnNewButton = new JButton("New button");
    btnNewButton.setBounds(10, 10, 85, 21);
    panel.add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("New button");
    btnNewButton_1.setBounds(10, 41, 85, 21);
    panel.add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("New button");
    btnNewButton_2.setBounds(10, 72, 85, 21);
    panel.add(btnNewButton_2);
    
    JPanel panel_1 = new JPanel();
    panel_1.setBackground(Color.ORANGE);
    panel_1.setBounds(137, 10, 117, 106);
    contentPane.add(panel_1);
    panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JButton btnNewButton_3 = new JButton("New button");
    panel_1.add(btnNewButton_3);
    
    JButton btnNewButton_4 = new JButton("New button");
    panel_1.add(btnNewButton_4);
    
    JButton btnNewButton_5 = new JButton("New button");
    panel_1.add(btnNewButton_5);
    
    JPanel panel_2 = new JPanel();
    panel_2.setBounds(264, 10, 194, 179);
    contentPane.add(panel_2);
    panel_2.setLayout(new BorderLayout(0, 0));
    
    JButton btnNewButton_6 = new JButton("New button");
    panel_2.add(btnNewButton_6, BorderLayout.NORTH);
    
    JButton btnNewButton_7 = new JButton("New button");
    panel_2.add(btnNewButton_7, BorderLayout.WEST);
    
    JButton btnNewButton_8 = new JButton("New button");
    panel_2.add(btnNewButton_8, BorderLayout.EAST);
    
    JButton btnNewButton_9 = new JButton("New button");
    panel_2.add(btnNewButton_9, BorderLayout.SOUTH);
    
    JLabel lblNewLabel = new JLabel("Absolute");
    lblNewLabel.setBounds(10, 126, 45, 13);
    contentPane.add(lblNewLabel);
    
    JLabel lblFlow = new JLabel("Flow");
    lblFlow.setBounds(137, 126, 45, 13);
    contentPane.add(lblFlow);
    
    JLabel lblBorder = new JLabel("Border");
    lblBorder.setBounds(264, 199, 45, 13);
    contentPane.add(lblBorder);
    
    JPanel panel_3 = new JPanel();
    panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.ORANGE, Color.ORANGE));
    panel_3.setBackground(Color.BLUE);
    panel_3.setBounds(468, 10, 194, 179);
    contentPane.add(panel_3);
    panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
    
    JButton btnNewButton_10 = new JButton("New button");
    panel_3.add(btnNewButton_10);
    
    JButton btnNewButton_11 = new JButton("New button");
    panel_3.add(btnNewButton_11);
    
    JButton btnNewButton_12 = new JButton("New button");
    panel_3.add(btnNewButton_12);
    
    JButton btnNewButton_13 = new JButton("New button");
    panel_3.add(btnNewButton_13);
    
    JLabel lblNewLabel_1 = new JLabel("Box");
    lblNewLabel_1.setBounds(468, 199, 194, 13);
    contentPane.add(lblNewLabel_1);
    
    JEditorPane dtrpnSe = new JEditorPane();
    dtrpnSe.setText("- La estructura de los Layouts se modifican por el constructor\r\n- En Grid puedo cambiar por el costructor las filas y columnas, dependiendo de eso se modifican los elementos");
    dtrpnSe.setBounds(10, 517, 548, 128);
    contentPane.add(dtrpnSe);
    
    JPanel panel_4 = new JPanel();
    panel_4.setBorder(new EmptyBorder(2, 2, 2, 2));
    panel_4.setBounds(672, 10, 194, 179);
    contentPane.add(panel_4);
    panel_4.setLayout(new GridLayout(1, 0, 2, 0));
    
    JButton btnNewButton_14 = new JButton("New button");
    panel_4.add(btnNewButton_14);
    
    JButton btnNewButton_15 = new JButton("New button");
    panel_4.add(btnNewButton_15);
    
    JButton btnNewButton_16 = new JButton("New button");
    panel_4.add(btnNewButton_16);
    
    JLabel lblGrid = new JLabel("Grid");
    lblGrid.setBounds(672, 199, 45, 13);
    contentPane.add(lblGrid);
    
    JPanel panel_5 = new JPanel();
    panel_5.setBounds(10, 149, 244, 179);
    contentPane.add(panel_5);
    panel_5.setLayout(new CardLayout(0, 0));
    
    JButton btnNewButton_17 = new JButton("1");
    panel_5.add(btnNewButton_17, "name_345922893338800");
    
    JButton btnNewButton_18 = new JButton("2");
    panel_5.add(btnNewButton_18, "name_345927067749400");
    
    JButton btnNewButton_19 = new JButton("3");
    panel_5.add(btnNewButton_19, "name_346029509071700");
    
    JLabel lblCard = new JLabel("Card");
    lblCard.setBounds(10, 338, 45, 13);
    contentPane.add(lblCard);
    
    JPanel panel_6 = new JPanel();
    panel_6.setBounds(264, 222, 318, 106);
    contentPane.add(panel_6);
    GridBagLayout gbl_panel_6 = new GridBagLayout();
    gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0};
    gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0};
    gbl_panel_6.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel_6.setLayout(gbl_panel_6);
    
    JButton btnNewButton_20 = new JButton("New button");
    GridBagConstraints gbc_btnNewButton_20 = new GridBagConstraints();
    gbc_btnNewButton_20.fill = GridBagConstraints.HORIZONTAL;
    gbc_btnNewButton_20.insets = new Insets(0, 0, 5, 5);
    gbc_btnNewButton_20.gridx = 0;
    gbc_btnNewButton_20.gridy = 0;
    panel_6.add(btnNewButton_20, gbc_btnNewButton_20);
    
    JButton btnNewButton_21 = new JButton("New button");
    GridBagConstraints gbc_btnNewButton_21 = new GridBagConstraints();
    gbc_btnNewButton_21.fill = GridBagConstraints.HORIZONTAL;
    gbc_btnNewButton_21.insets = new Insets(0, 0, 5, 5);
    gbc_btnNewButton_21.gridx = 1;
    gbc_btnNewButton_21.gridy = 1;
    panel_6.add(btnNewButton_21, gbc_btnNewButton_21);
    
    textField = new JTextField();
    GridBagConstraints gbc_textField = new GridBagConstraints();
    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField.gridwidth = 2;
    gbc_textField.insets = new Insets(0, 0, 0, 5);
    gbc_textField.gridx = 0;
    gbc_textField.gridy = 2;
    panel_6.add(textField, gbc_textField);
    textField.setColumns(10);
    
    JButton btnNewButton_22 = new JButton("New button");
    GridBagConstraints gbc_btnNewButton_22 = new GridBagConstraints();
    gbc_btnNewButton_22.anchor = GridBagConstraints.WEST;
    gbc_btnNewButton_22.gridx = 2;
    gbc_btnNewButton_22.gridy = 2;
    panel_6.add(btnNewButton_22, gbc_btnNewButton_22);
    
    JLabel lblNewLabel_2 = new JLabel("GridBag");
    lblNewLabel_2.setBounds(264, 338, 67, 13);
    contentPane.add(lblNewLabel_2);
    
    JPanel panel_7 = new JPanel();
    panel_7.setBounds(592, 222, 329, 179);
    contentPane.add(panel_7);
    panel_7.setLayout(new MigLayout("", "[85px][85px][85px]", "[21px][21px][21px]"));
    
    JButton btnNewButton_23 = new JButton("New button");
    panel_7.add(btnNewButton_23, "cell 0 0,alignx left,aligny top");
    
    JButton btnNewButton_24 = new JButton("New button");
    panel_7.add(btnNewButton_24, "cell 1 1,alignx left,aligny top");
    
    JButton btnNewButton_25 = new JButton("New button");
    panel_7.add(btnNewButton_25, "cell 2 2,alignx left,aligny top");
    
    JLabel lblMig = new JLabel("Mig");
    lblMig.setBounds(592, 411, 45, 13);
    contentPane.add(lblMig);
    
    JPanel panel_8 = new JPanel();
    panel_8.setBounds(10, 385, 572, 86);
    contentPane.add(panel_8);
    
    JButton btnNewButton_26 = new JButton("New button");
    
    JButton btnNewButton_27 = new JButton("New button");
    
    JButton btnNewButton_28 = new JButton("New button");
    
    JButton btnNewButton_29 = new JButton("New button");
    
    JButton btnNewButton_30 = new JButton("New button");
    
    textField_1 = new JTextField();
    textField_1.setColumns(10);
    GroupLayout gl_panel_8 = new GroupLayout(panel_8);
    gl_panel_8.setHorizontalGroup(
      gl_panel_8.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel_8.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_8.createSequentialGroup()
              .addComponent(btnNewButton_26)
              .addGap(18)
              .addComponent(btnNewButton_27)
              .addGap(18)
              .addComponent(btnNewButton_28))
            .addGroup(gl_panel_8.createSequentialGroup()
              .addComponent(btnNewButton_29)
              .addGap(18)
              .addComponent(btnNewButton_30)
              .addGap(18)
              .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
          .addContainerGap())
    );
    gl_panel_8.setVerticalGroup(
      gl_panel_8.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel_8.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
            .addComponent(btnNewButton_26)
            .addComponent(btnNewButton_27)
            .addComponent(btnNewButton_28))
          .addGap(18)
          .addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
            .addComponent(btnNewButton_29)
            .addComponent(btnNewButton_30)
            .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addContainerGap(177, Short.MAX_VALUE))
    );
    panel_8.setLayout(gl_panel_8);
    
    JLabel lblGroup = new JLabel("Group");
    lblGroup.setBounds(10, 481, 45, 13);
    contentPane.add(lblGroup);
  }
}
