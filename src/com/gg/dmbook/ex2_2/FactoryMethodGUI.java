package com.gg.dmbook.ex2_2;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class FactoryMethodGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2321922195285622094L;
	// 大的分隔面板
	private JSplitPane bigSplitPane;
	// 显示信息的面板
	private JScrollPane showInfoPane;
	// 按钮面板
	private JPanel btnPanel;
	//保险类型组合框
	private JComboBox<String> cmbInsuranceType, cmbHouseType;
	//类型面板
	private JLabel lblInsureType;
	//大小
	private Dimension minimumSize;
	//文本区域
	private JTextArea txtForInfo;

	//按钮上标识
	public static final String SHOW = "Show Info";
	public static final String EXIT = "Exit";
	//复选框上的标识
	public static final String BODYINJURE = "Body Injur Liability";
	public static final String COLLISION = "Collision Coverage";
	public static final String PERSONINJURE = "Personal Injury Protection";

	public FactoryMethodGUI() {
		super("Factory Method Pattern- Auto Insurance. ");
		//窗口大小
		minimumSize = new Dimension(130, 100);
		//设置选择面板
		setUpChoicePanel();
		//设置滑动面板
		setUpScrollPanes();
	}

	private void setUpChoicePanel() {
		cmbInsuranceType = new JComboBox<String>();
		//添加3项
		cmbInsuranceType.addItem(BODYINJURE);
		cmbInsuranceType.addItem(COLLISION);
		cmbInsuranceType.addItem(PERSONINJURE);

		lblInsureType = new JLabel("Insurance Types");

		// Create the open button
		//创建显示按钮
		JButton showInfoBtn = new JButton(SHOW);
		//设置void setMnemonic(int mnemonic) 设置当前模型上的键盘助记符。 
		showInfoBtn.setMnemonic(KeyEvent.VK_S);
		
		//退出按钮
		JButton exitButton = new JButton(EXIT);
		exitButton.setMnemonic(KeyEvent.VK_X);

		ButtonListener btnListener = new ButtonListener();
		// add action Listener
		//添加事件监听器
		showInfoBtn.addActionListener(btnListener);
		exitButton.addActionListener(btnListener);


		// ------------------------------------------------
		//按钮选择面板网格包布局
		GridBagLayout gridbag = new GridBagLayout();
		btnPanel = new JPanel();
		btnPanel.setLayout(gridbag);
		
		GridBagConstraints gbc = new GridBagConstraints();

		//按钮面板添加标签面板，组合框
		btnPanel.add(lblInsureType);
		btnPanel.add(cmbInsuranceType);
		btnPanel.add(showInfoBtn);
		btnPanel.add(exitButton);

		gbc.insets.top = 5;
		gbc.insets.bottom = 5;
		gbc.insets.left = 5;
		gbc.insets.right = 5;

		//行数
		gbc.gridx = 0;
		gbc.gridy = 0;
		gridbag.setConstraints(lblInsureType, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gridbag.setConstraints(cmbInsuranceType, gbc);

		gbc.insets.left = 2;
		gbc.insets.right = 2;
		gbc.insets.top = 15;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gridbag.setConstraints(showInfoBtn, gbc);
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.gridy = 5;
		gridbag.setConstraints(exitButton, gbc);
		// -----------------------------------------------
	}

	private void setUpScrollPanes() {
		txtForInfo = new JTextArea(
				"Auto insurance information will be shown here.", 20, 30);
		txtForInfo.setFont(new Font("Helvetica", Font.BOLD, 15));

		txtForInfo.setLineWrap(true);
		txtForInfo.setBackground(Color.pink);

		showInfoPane = new JScrollPane(txtForInfo);

		bigSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, showInfoPane,
				btnPanel);
		bigSplitPane.setDividerLocation(220);

		getContentPane().add(bigSplitPane);
		setSize(new Dimension(500, 300));
		setVisible(true);
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals(EXIT)) {
				System.exit(1);
			}
			if (ae.getActionCommand().equals(SHOW)) {
				String type = (String) cmbInsuranceType.getSelectedItem();
				PolicyProducer pp = null;
				String option = "";

				if (type.equals(BODYINJURE)) {
					option = "bodyInjure";
				} else if (type.equals(COLLISION)) {
					option = "collision";
				} else if (type.equals(PERSONINJURE)) {
					option = "personInjure";
				}

				AutoInsurance ai = PolicyProducer.getPolicyObj(option);
				String desc = ai.getInsurInfo();
				txtForInfo.setText(desc);
			}
		}
	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception evt) {
		}

		FactoryMethodGUI frame = new FactoryMethodGUI();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setSize(500, 420);
		frame.setVisible(true);
	}
}
