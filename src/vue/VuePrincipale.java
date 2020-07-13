package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controleur.Controleur;
import controleur.Controleur;

import javax.swing.ButtonGroup;
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
	private JRadioButton radioGarder;
	private JRadioButton radioExclure;
	private JCheckBox saveReste;
	private ButtonGroup boutonGroup = new ButtonGroup() ;
	
	public String getSource() {
		return fichierSource.getText();
	}
	public String getCritere() {
		return critere.getText();
	}
	public String getSortie() {
		return fichierSortie.getText();
	}
	public String getReste() {
		return fichierReste.getText();
	}
	public String getStart() {
		return ligneStart.getText();
	}
	public String getStop() {
		return ligneStop.getText();
	}
	public boolean getGarder() {
		return radioGarder.isSelected();
	}
	public boolean getExclure() {
		return radioExclure.isSelected();
	}
	public boolean getSaveReste() {
		return saveReste.isSelected();
	}

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
		
		radioGarder = new JRadioButton("garder");
		radioGarder.setBounds(61, 63, 67, 23);
		frame.getContentPane().add(radioGarder);
		
		radioExclure = new JRadioButton("exclure");
		radioExclure.setBounds(130, 63, 109, 23);
		frame.getContentPane().add(radioExclure);
		
		boutonGroup.add(radioExclure);
		boutonGroup.add(radioGarder);
		
		critere = new JTextField();
		critere.setBounds(10, 92, 206, 20);
		frame.getContentPane().add(critere);
		critere.setColumns(10);
		
		saveReste = new JCheckBox("sauver le reste");
		saveReste.setBounds(240, 63, 97, 23);
		frame.getContentPane().add(saveReste);
		
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
				controleur.lancerAnalyse();
			}
		});
		btnNewButton.setBounds(10, 179, 89, 70);
		frame.getContentPane().add(btnNewButton);
	}
}
