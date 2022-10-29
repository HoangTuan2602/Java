package goi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUI_Insert extends JFrame {

	private JPanel contentPane;
	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_price;
	private JTextField txt_amount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Insert frame = new GUI_Insert();
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
	public GUI_Insert() {
		setTitle("Insert");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(45, 53, 75, 13);
		contentPane.add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txt_id.setBounds(130, 50, 219, 19);
		contentPane.add(txt_id);
		txt_id.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txt_name.setColumns(10);
		txt_name.setBounds(130, 84, 219, 19);
		contentPane.add(txt_name);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(45, 87, 75, 13);
		contentPane.add(lblName);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCompany.setBounds(45, 128, 75, 13);
		contentPane.add(lblCompany);
		
		txt_price = new JTextField();
		txt_price.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txt_price.setColumns(10);
		txt_price.setBounds(130, 155, 219, 19);
		contentPane.add(txt_price);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPrice.setBounds(45, 158, 75, 13);
		contentPane.add(lblPrice);
		
		txt_amount = new JTextField();
		txt_amount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txt_amount.setColumns(10);
		txt_amount.setBounds(130, 192, 219, 19);
		contentPane.add(txt_amount);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount.setBounds(45, 195, 75, 13);
		contentPane.add(lblAmount);
		
		JComboBox cb_company = new JComboBox();
		cb_company.setFont(new Font("Times New Roman", Font.BOLD, 12));
		cb_company.setModel(new DefaultComboBoxModel(new String[] {"Company...", "a", "b", "c", "d", "e", "f", "g", "h"}));
		cb_company.setBounds(130, 125, 219, 19);
		contentPane.add(cb_company);
		
		JButton btn_insert = new JButton("Insert");
		btn_insert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String ID = txt_id.getText();
				String Name = txt_name.getText();
				String Company = cb_company.getSelectedItem().toString();
				double Price = Double.parseDouble(txt_price.getText());
				double Amount = Double.parseDouble(txt_amount.getText());
				Process_Refrigerator pr = new Process_Refrigerator();
				
				if (pr.insertRefrigerator(ID, Name, Company, Price, Amount))
					JOptionPane.showMessageDialog(contentPane, "Thêm thành công");
				else
					JOptionPane.showMessageDialog(contentPane, "Thêm không thành công");
			}
		});
		btn_insert.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_insert.setBounds(160, 263, 91, 25);
		contentPane.add(btn_insert);
	}
}
