package aksoy.cipher;

import javax.swing.*;
import java.awt.*;

public class EncView extends JFrame {
	private EncModel m;
	private EncController c;

	private JPanel selection;
	private JPanel changeAlphabetBox;
	private JPanel inputOutputBox;

	private JRadioButton subCipherR;
	private JRadioButton shiCipherR;
	private ButtonGroup radioGroup;

	private JTextField inputShift;
	private JTextField inputSubst;

	private JTextField text;
	private JLabel output;

	public EncView(EncController con, EncModel mod) {
		this.m=mod;
		this.c=con;
		this.setTitle("Ncrypt-Dcrypt");
		this.setMinimumSize(new Dimension(500, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.subCipherR = new JRadioButton("Substitution", true);
		this.shiCipherR = new JRadioButton("Shift Cipher");
		this.subCipherR.addActionListener(this.c);
		this.shiCipherR.addActionListener(this.c);
		this.radioGroup = new ButtonGroup();
		this.radioGroup.add(this.subCipherR);
		this.radioGroup.add(this.shiCipherR);
		
		this.selection = new JPanel();
		this.selection.setBorder(BorderFactory.createTitledBorder("Selection"));
		this.selection.add(this.subCipherR);
		this.selection.add(this.shiCipherR);
		this.selection.setMaximumSize(new Dimension(this.getWidth()-50,70));
		
		this.add(this.selection);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
