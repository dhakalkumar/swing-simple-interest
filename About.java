/**
 * About - Simple interest calculation and currency convertor application
 * 
 * @author Kumar Dhakal
 * @Email dhakalkumar10@gmail.com
 * (C) July 2019
 */

package assignment;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5928175064993874335L;
	private JPanel contentPane;
	private JLabel lblDhakalkumargmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setTitle("About ...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(280, 26, 170, 148);
		label.setIcon(new ImageIcon(new ImageIcon(About.class.getResource("/images/kumar.jpg")).getImage()
				.getScaledInstance(180, 170, Image.SCALE_DEFAULT)));

		label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(label);

		JLabel lblSimpleInterestAnd = new JLabel("Simple Interest and");
		lblSimpleInterestAnd.setForeground(new Color(46, 139, 87));
		lblSimpleInterestAnd.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSimpleInterestAnd.setBounds(12, 12, 185, 22);
		contentPane.add(lblSimpleInterestAnd);

		JLabel lblCurrencyConverterApplication = new JLabel("Currency Converter Application");
		lblCurrencyConverterApplication.setForeground(new Color(46, 139, 87));
		lblCurrencyConverterApplication.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCurrencyConverterApplication.setBounds(12, 46, 268, 22);
		contentPane.add(lblCurrencyConverterApplication);

		JLabel lblVersion = new JLabel("Version 1.0.0");
		lblVersion.setBounds(12, 73, 111, 22);
		contentPane.add(lblVersion);

		JLabel lblDesignedByKumar = new JLabel("Designed by: Kumar Dhakal");
		lblDesignedByKumar.setBounds(12, 141, 222, 15);
		contentPane.add(lblDesignedByKumar);

		JLabel lblEmailDhakalkukmargmailcom = new JLabel("Email: ");
		lblEmailDhakalkukmargmailcom.setBounds(12, 165, 46, 15);
		contentPane.add(lblEmailDhakalkukmargmailcom);

		JLabel lblCopyrightc = new JLabel("Copyright (C) 2019");
		lblCopyrightc.setBounds(12, 195, 150, 22);
		contentPane.add(lblCopyrightc);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(173, 226, 85, 32);
		contentPane.add(btnClose);
		contentPane.add(getLblDhakalkumargmailcom());
	}

	private JLabel getLblDhakalkumargmailcom() {
		if (lblDhakalkumargmailcom == null) {
			lblDhakalkumargmailcom = new JLabel("dhakalkumar10@gmail.com");
			lblDhakalkumargmailcom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblDhakalkumargmailcom.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					lblDhakalkumargmailcom.setText("<html><a href=''>dhakalkumar10@gmail.com</a></html>");
				}

				@Override
				public void mouseExited(MouseEvent e) {
					lblDhakalkumargmailcom.setText("dhakalkumar10@gmail.com");
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						URI url = new URI("mailto:dhakalkumar10@gmail.com");
						Desktop.getDesktop().browse(url);
					} catch (IOException | URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			lblDhakalkumargmailcom.setForeground(Color.BLUE);
			lblDhakalkumargmailcom.setBounds(67, 161, 202, 22);
		}
		return lblDhakalkumargmailcom;
	}
}
