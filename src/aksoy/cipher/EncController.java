package aksoy.cipher;

import java.awt.event.*;

public class EncController implements ActionListener {
	private EncView view;
	private EncModel model;

	public EncController() {
		this.model = new EncModel();
		this.view = new EncView(this, this.model);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
