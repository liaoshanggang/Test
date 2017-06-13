package server.ui.cqupt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import net.cqupt.Server;

public class MainClass extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�ı�����
	private JTextArea textArea = new JTextArea();
	//������ť
	private JButton start = new JButton("����");
	//ֹͣ��ť
	private JButton stop = new JButton("ֹͣ");
	//�б�
	private List list = new List(35);
	//������
	private Server server;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainClass() {
		setTitle("������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel contentPane = new JPanel();
	
		contentPane.setBackground(Color.gray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//�������
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		panel.add(start);
		start.addActionListener(this);

		panel.add(stop);
		stop.addActionListener(this);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JPanel right = new JPanel();
		right.add(new JScrollPane(list));
		getContentPane().add(right, BorderLayout.EAST);
		
		list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String item = list.getSelectedItem();
				if (JOptionPane.showConfirmDialog(null, "�Ƿ�Ͽ�褵�ǰ�ͻ��˵�����") == JOptionPane.OK_OPTION) {
					server.deleteThread(item);
					deleteList(item);
					textArea.append("�ͻ���" + item + "�����ж�" + "\n");

				}

			}

		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			server = new Server(this);
			server.start();
			textArea.append("����������" + "\n");
			start.setEnabled(false);
		}
		if (e.getSource() == stop) {
			if (server != null)
				server.interrupt();
			System.exit(0);
		}
	}

	public void addList(String client) {
		list.add(client);
	}

	public void deleteList(String item) {
		list.remove(item);
	}

	public void setTextArea(String str) {
		textArea.append(str + "\n");
	}

}
