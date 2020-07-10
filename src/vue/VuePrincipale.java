package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controleur.Controleur;
import controleur.Controleur;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class VuePrincipale {
	Controleur controleur;
	public JFrame frame;
	private JTextField fichierSource;
	private JTextField fichierSortie;
	private JTextField critere;
	private JTextField fichierReste;
	private JTextField ligneStart;
	private JTextField ligneStop;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VuePrincipale window = new VuePrincipale();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void setContoleur(Controleur c) {
		this.controleur = c;
	}

	/**
	 * Create the application.
	 * @param controleur 
	 */
	public VuePrincipale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("fichier \u00E0 traiter");
		lblNewLabel.setBounds(10, 11, 85, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fichier de sortie");
		lblNewLabel_1.setBounds(240, 11, 109, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fichierSource = new JTextField();
		fichierSource.setBounds(10, 36, 206, 20);
		frame.getContentPane().add(fichierSource);
		fichierSource.setColumns(10);
		
		fichierSortie = new JTextField();
		fichierSortie.setBounds(240, 36, 189, 20);
		frame.getContentPane().add(fichierSortie);
		fichierSortie.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("crit\u00E8re");
		lblNewLabel_2.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("garder");
		rdbtnNewRadioButton.setBounds(61, 63, 67, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("exclure");
		rdbtnNewRadioButton_1.setBounds(130, 63, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		critere = new JTextField();
		critere.setBounds(10, 92, 206, 20);
		frame.getContentPane().add(critere);
		critere.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("sauver le reste");
		chckbxNewCheckBox.setBounds(240, 63, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		fichierReste = new JTextField();
		fichierReste.setBounds(240, 92, 189, 20);
		frame.getContentPane().add(fichierReste);
		fichierReste.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ligne d\u00E9but");
		lblNewLabel_3.setBounds(10, 123, 85, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ligne fin");
		lblNewLabel_4.setBounds(240, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		ligneStart = new JTextField();
		ligneStart.setBounds(10, 148, 86, 20);
		frame.getContentPane().add(ligneStart);
		ligneStart.setColumns(10);
		
		ligneStop = new JTextField();
		ligneStop.setBounds(240, 148, 86, 20);
		frame.getContentPane().add(ligneStop);
		ligneStop.setColumns(10);
		
		JButton btnNewButton = new JButton("Lancer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 179, 89, 70);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(109, 179, 320, 70);
		frame.getContentPane().add(panel);
	}
}
