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
	private JLabel shiftLabel;
	private JLabel substLabel;
	private JPanel inpShiftPanel;
	private JPanel inpSubstPanel;
	private JButton applyChangeB;

	private JTextField text;
	private JTextField output;
	private JButton encrypt;
	private JButton decrypt;

	public EncView(EncController con, EncModel mod) {
		this.m = mod;
		this.c = con;
		this.setTitle("Ncrypt-Dcrypt");
		this.setMinimumSize(new Dimension(350, 500));
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
		this.selection.setBorder(BorderFactory.createTitledBorder("Encryption Method"));
		this.selection.add(this.subCipherR);
		this.selection.add(this.shiCipherR);
		this.selection.setMinimumSize(new Dimension(this.getWidth(), 60));
		this.selection.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));

		this.changeAlphabetBox = new JPanel();
		this.changeAlphabetBox.setBorder(BorderFactory.createTitledBorder("Alphabet Settings"));
		this.changeAlphabetBox.setMinimumSize(new Dimension(this.getWidth(), 100));
		this.changeAlphabetBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));
		this.changeAlphabetBox.setLayout(new GridLayout(3, 1));

		this.substLabel = new JLabel("Substitution: ");
		this.inputSubst = new JTextField();

		this.inpSubstPanel = new JPanel();
		this.inpSubstPanel.setLayout(new GridLayout(1, 2));
		this.inpSubstPanel.add(this.substLabel);
		this.inpSubstPanel.add(this.inputSubst);

		this.shiftLabel = new JLabel("Shifting: ");
		this.inputShift = new JTextField();
		this.inputShift.setEditable(false);

		this.inpShiftPanel = new JPanel();
		this.inpShiftPanel.setLayout(new GridLayout(1, 2));
		this.inpShiftPanel.add(this.shiftLabel);
		this.inpShiftPanel.add(this.inputShift);

		this.applyChangeB = new JButton("Apply");
		this.applyChangeB.addActionListener(this.c);
		JPanel applyPanel = new JPanel();
		applyPanel.setLayout(new GridLayout(1, 3));
		applyPanel.add(new Container());
		applyPanel.add(this.applyChangeB);
		applyPanel.add(new Container());

		this.changeAlphabetBox.add(this.inpSubstPanel);
		this.changeAlphabetBox.add(this.inpShiftPanel);
		this.changeAlphabetBox.add(applyPanel);

		this.inputOutputBox = new JPanel();
		this.inputOutputBox.setBorder(BorderFactory.createTitledBorder("Input & Output"));
		this.inputOutputBox.setLayout(new GridLayout(4, 1));

		this.text = new JTextField();
		JLabel textLabel = new JLabel("Input: ");
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(1, 2));
		textPanel.add(textLabel);
		textPanel.add(this.text);

		this.output = new JTextField("");
		JLabel outLabel = new JLabel("Output: ");
		JPanel outPanel = new JPanel();
		outPanel.setLayout(new GridLayout(1, 2));
		outPanel.add(outLabel);
		outPanel.add(this.output);
		this.output.setEditable(false);

		this.encrypt = new JButton("Encrypt");
		this.encrypt.addActionListener(this.c);
		this.decrypt = new JButton("Decrypt");
		this.decrypt.addActionListener(this.c);

		this.inputOutputBox.add(textPanel);
		this.inputOutputBox.add(outPanel);
		this.inputOutputBox.add(this.encrypt);
		this.inputOutputBox.add(this.decrypt);

		this.add(this.selection);
		this.add(this.changeAlphabetBox);
		this.add(this.inputOutputBox);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public boolean isApplyChange(Object s) {
		if (s == this.applyChangeB)
			return true;
		return false;
	}

	public boolean isEncrypt(Object s) {
		if (s == this.encrypt)
			return true;
		return false;
	}

	public boolean isDecrypt(Object s) {
		if (s == this.decrypt)
			return true;
		return false;
	}
}
