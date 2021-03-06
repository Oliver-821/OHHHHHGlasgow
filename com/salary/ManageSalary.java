/*
 * ManageSalary.java
 *
 * Created on __DATE__, __TIME__
 */

package com.salary;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import com.dto.Salary;
import com.instrumentframe.InstrumentTableFrame;
import com.model.ComboModel;
import com.model.InstrumentModel;
import com.model.SalaryModel;

/**
 * 
 * @author __USER__
 */
public class ManageSalary extends javax.swing.JInternalFrame {

	/** Creates new form ManageSalary */

	public ManageSalary(JDesktopPane desktop) {
		this.desktop = desktop;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		employerid = new javax.swing.JComboBox();
		level = new javax.swing.JComboBox();
		jLabel3 = new javax.swing.JLabel();
		money = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		searchbutton = new javax.swing.JButton();
		addbutton = new javax.swing.JButton();
		cancelbutton = new javax.swing.JButton();
		uptbutton = new javax.swing.JButton();
		deletebutton = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		search = new javax.swing.JComboBox();
		jLabel6 = new javax.swing.JLabel();

		setForeground(java.awt.Color.white);

		jLabel1.setText("\u5458\u5de5\u5de5\u53f7");

		jLabel2.setText("\u5de5\u8d44\u7ea7\u522b");

		ComboModel com = new ComboModel();
		
		
		String[] employ = com.combo("select id from employer");
		employerid.setModel(new javax.swing.DefaultComboBoxModel(employ));
		
		//??????????
		search.setModel(new javax.swing.DefaultComboBoxModel(employ));
		search.setEditable(true);
		money.setText("1000");
		money.setEditable(false);

		level.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1??", "2??", "3??", "4??", "5??", "6??", "7??", "??????", "???߼?" }));
		level.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				levelActionPerformed(evt);
			}
		});
	
		
		jLabel3.setText("\u5de5\u8d44\u91d1\u989d");

		jLabel4.setText("\u5143/\u6708");

		searchbutton.setText("\u641c\u7d22");
		searchbutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchbuttonActionPerformed(evt);
			}
		});

		addbutton.setText("\u65b0\u589e");
		addbutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addbuttonActionPerformed(evt);
			}
		});

		cancelbutton.setText("\u53d6\u6d88");
		cancelbutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelbuttonActionPerformed(evt);
			}
		});

		uptbutton.setText("\u4fee\u6539");
		uptbutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				uptbuttonActionPerformed(evt);
			}
		});

		deletebutton.setText("\u5220\u9664");
		deletebutton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deletebuttonActionPerformed(evt);
			}
		});

		jLabel5.setText("\u6309\u5458\u5de5\u53f7\u67e5\u627e");

		jLabel6.setText("\u5458\u5de5\u5de5\u8d44\u7ba1\u7406");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(35, 35, 35)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								level,
																								0,
																								130,
																								Short.MAX_VALUE)
																						.addComponent(
																								employerid,
																								0,
																								130,
																								Short.MAX_VALUE)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												deletebutton)
																										.addGroup(
																												layout
																														.createSequentialGroup()
																														.addComponent(
																																money,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																82,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																														.addComponent(
																																jLabel4))
																										.addComponent(
																												cancelbutton)))
																		.addGap(
																				50,
																				50,
																				50))
														.addComponent(addbutton)
														.addComponent(uptbutton)))
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel6)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				search,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				78,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(18, 18, 18).addComponent(
												searchbutton).addContainerGap(
												28, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel6)
										.addGap(14, 14, 14)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																search,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																searchbutton))
										.addGap(18, 18, 18)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																employerid,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																level,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																money,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addGap(43, 43, 43)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(addbutton)
														.addComponent(
																deletebutton))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(uptbutton)
														.addComponent(
																cancelbutton))
										.addContainerGap(56, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	// GEN-END:initComponents
	// ɾ????????Ϣ
	private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {
		String eid = search.getSelectedItem().toString();
		SalaryModel smodel = new SalaryModel();
		Salary salary = smodel.queryOne(eid);
		if (salary.getLevel() == null) {
			JOptionPane.showMessageDialog(this, "???޴?Ա????????Ϣ");
			return;
		}
		int yes = JOptionPane
				.showConfirmDialog(null, "ȷ??ɾ??'" + eid + "'?Ź?????Ϣ??");
		if (yes == 0) {
			boolean flag = smodel.DelSalary(eid);
			if (flag == true) {
				JOptionPane.showMessageDialog(this, "ɾ???ɹ?");
				this.dispose();
				desktop.removeAll();
				SalaryTableFrame tableframe = new SalaryTableFrame();
				desktop.add(tableframe);
				tableframe.setVisible(true);
				tableframe.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "ɾ??ʧ??");
			}
		}
	}

	private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	// ???¹?????Ϣ
	private void uptbuttonActionPerformed(java.awt.event.ActionEvent evt) {
		if (money.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "??????Ա???Ĺ???");
			return;
		}
		SalaryModel smodel = new SalaryModel();
		if (smodel.queryOne(employerid.getSelectedItem().toString()).getLevel() == null) {
			JOptionPane.showMessageDialog(this, "???޴?Ա????????Ϣ");
			return;
		}
		Salary s = new Salary();
		s.setEmployerid(employerid.getSelectedItem().toString());
		s.setLevel(level.getSelectedItem().toString());
		s.setMoney(Float.parseFloat(money.getText()));
		boolean flag = smodel.uptSalary(s, employerid.getSelectedItem()
				.toString());
		if (flag) {
			JOptionPane.showMessageDialog(this, "?޸?Ա?????ʳɹ?");
			this.dispose();
			desktop.removeAll();
			SalaryTableFrame tableframe = new SalaryTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "?޸?Ա??????ʧ??");
		}
	}

	// ????Ա???Ĺ???ˮƽ
	private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {
		String eid = search.getSelectedItem().toString();
		SalaryModel smodel = new SalaryModel();
		Salary salary = smodel.queryOne(eid);
		if (salary.getLevel() == null) {
			JOptionPane.showMessageDialog(this, "???޴?Ա????????Ϣ");
			return;
		}
		employerid.setSelectedItem(search.getSelectedItem().toString());
		level.setSelectedItem(salary.getLevel());
		money.setText(salary.getMoney() + "");
	}

	// ???ù??ʼ???
	private void levelActionPerformed(java.awt.event.ActionEvent evt) {
		int str = level.getSelectedIndex();
		if (str <= 6) {
			money.setEditable(false);
			money.setText(str * 500 + 1000 + "");
		}else{
			money.setEditable(true);
		}
	}

	// ????Ա???Ĺ?????Ϣ
	private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {
		if (money.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "??????Ա???Ĺ???");
			return;
		}
		SalaryModel smodel = new SalaryModel();
		if (smodel.queryOne(employerid.getSelectedItem().toString()).getLevel() != null) {
			JOptionPane.showMessageDialog(this, "??Ա???Ĺ????Ѿ??????ù?");
			return;
		}
		Salary s = new Salary();
		s.setEmployerid(employerid.getSelectedItem().toString());
		s.setLevel(level.getSelectedItem().toString());
		s.setMoney(Float.parseFloat(money.getText()));
		boolean flag = smodel.addSalary(s);
		if (flag) {
			JOptionPane.showMessageDialog(this, "????Ա?????ʳɹ?");
			this.dispose();
			desktop.removeAll();
			SalaryTableFrame tableframe = new SalaryTableFrame();
			desktop.add(tableframe);
			tableframe.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "????Ա??????ʧ??");
		}
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton addbutton;
	private javax.swing.JButton cancelbutton;
	private javax.swing.JButton deletebutton;
	private javax.swing.JComboBox employerid;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JComboBox level;
	private javax.swing.JTextField money;
	private javax.swing.JComboBox search;
	private javax.swing.JButton searchbutton;
	private javax.swing.JButton uptbutton;
	private JDesktopPane desktop;
	// End of variables declaration//GEN-END:variables

}