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
		if (this.view.isApplyChange(e.getSource())) {
			if (this.view.isSubstSelected()) {
				this.model.change(this.view.getSubstInp());
			} else {
				this.model.change(this.view.getShiftInp());
			}
		} else if (this.view.isReset(e.getSource())) {
			this.model.reset();
		} else if (this.view.isEncrypt(e.getSource())) {
			this.view.setOutput(this.model.encrypt(this.view.getInput()));
		} else if (this.view.isDecrypt(e.getSource())) {
			this.view.setOutput(this.model.decrypt(this.view.getInput()));
		} else if (this.view.isSubst(e.getSource())) {
			this.view.setChangeLayout(EncModel.MODE_SUBST);
		} else if (this.view.isShift(e.getSource())) {
			this.view.setChangeLayout(EncModel.MODE_SHIFT);
		}
	}
}
