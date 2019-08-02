/**
 * Simple interest calculation and currency convertor application
 * 
 * @author Kumar Dhakal
 * @Email dhakalkumar10@gmail.com
 * (C) July 2019
 */

package assignment;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class SimpleInterest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2914964643050884634L;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblSimpleInterestCalculation;
	private JTextField textField_3;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleInterest frame = new SimpleInterest();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleInterest() {
		setTitle("Simple Interest and Currency Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrincipalp = new JLabel("Principal (P): ");
		lblPrincipalp.setBounds(12, 107, 109, 26);
		contentPane.add(lblPrincipalp);

		textField = new JTextField();
		textField.setBounds(150, 110, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Time (years):");
		lblNewLabel.setBounds(12, 145, 99, 19);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(150, 141, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblRateOfInterest = new JLabel("Interest Rate (R):");
		lblRateOfInterest.setBounds(12, 176, 154, 15);
		contentPane.add(lblRateOfInterest);

		textField_2 = new JTextField();
		textField_2.setBounds(150, 172, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		lblSimpleInterestCalculation = new JLabel("Simple Interest Calculation");
		lblSimpleInterestCalculation.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSimpleInterestCalculation.setForeground(new Color(0, 128, 0));
		lblSimpleInterestCalculation.setBounds(12, 43, 289, 34);
		contentPane.add(lblSimpleInterestCalculation);

		JLabel lblSimpleInteresti = new JLabel("Simple Interest (I): Rs");
		lblSimpleInteresti.setBounds(12, 265, 166, 19);
		contentPane.add(lblSimpleInteresti);

		JLabel label = new JLabel("");
		label.setBounds(177, 265, 99, 19);
		contentPane.add(label);

		JLabel lblAmounta = new JLabel("Amount (A):             Rs");
		lblAmounta.setBounds(12, 296, 166, 26);
		contentPane.add(lblAmounta);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(177, 298, 99, 19);
		contentPane.add(label_1);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float p = Float.valueOf(textField.getText());
				float t = Float.valueOf(textField_1.getText());
				float r = Float.valueOf(textField_2.getText());

				float i = (p * t * r) / 100.0f;
				label.setText(String.valueOf(i));
				label_1.setText(String.valueOf(p + i));
			}
		});
		btnCalculate.setBounds(149, 212, 117, 25);
		contentPane.add(btnCalculate);

		// CURRENCY CONVERSION

		JLabel lblCurrencyConversion = new JLabel("Currency Conversion");
		lblCurrencyConversion.setForeground(new Color(0, 128, 0));
		lblCurrencyConversion.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCurrencyConversion.setBounds(355, 50, 221, 21);
		contentPane.add(lblCurrencyConversion);

		JLabel lblCurrencyrs = new JLabel("Currency (Rs): ");
		lblCurrencyrs.setBounds(355, 107, 109, 21);
		contentPane.add(lblCurrencyrs);

		textField_3 = new JTextField();
		textField_3.setBounds(486, 107, 114, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblSelectCountry = new JLabel("Select Country :");
		lblSelectCountry.setBounds(355, 141, 114, 21);
		contentPane.add(lblSelectCountry);

		String[] countries = new String[] { "USA", "Australia", "India", "France", "Japan" };
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(487, 142, 113, 24);
		for (String c : countries) {
			comboBox.addItem(c);
		}
		contentPane.add(comboBox);

		JLabel lblConvertedCurrency = new JLabel("Converted Currency:");
		lblConvertedCurrency.setBounds(355, 227, 154, 26);
		contentPane.add(lblConvertedCurrency);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(523, 227, 88, 26);
		contentPane.add(label_2);

		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int commoBoxSelection = comboBox.getSelectedIndex();
				float amountToConvert = Float.valueOf(textField_3.getText());

				float convert = 1;
				switch (commoBoxSelection) {
				case 0:
					// NPR to USD
					convert = 0.009f;
					break;

				case 1:
					// NPR to AD
					convert = 0.013f;
					break;

				case 2:
					// NPR to IC
					convert = 1.6f;
					break;

				case 3:
					// NPR to FD
					convert = 0.0079f;
					break;

				case 4:
					// NPR to JY
					convert = 0.97f;
					break;

				}
				float value = convert * amountToConvert;
				label_2.setText(Float.toString(value));

				// label_2.setText(String.valueOf(value));

			}
		});
		btnConvert.setBounds(355, 190, 117, 25);
		contentPane.add(btnConvert);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 129, 21);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmResetAll = new JMenuItem("Reset All");
		mntmResetAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				label.setText("");
				label_1.setText("");
				label_2.setText("");
			}
		});
		mnFile.add(mntmResetAll);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnFile.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new About().setVisible(true);
			}
		});
		mnHelp.add(mntmAbout);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(355, 329, 78, 25);
		contentPane.add(btnClose);
		contentPane.add(getSeparator());
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBackground(Color.MAGENTA);
			separator.setBounds(311, 43, 12, 284);
		}
		return separator;
	}
}
