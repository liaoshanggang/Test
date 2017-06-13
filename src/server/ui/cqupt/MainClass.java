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
	//文本区域
	private JTextArea textArea = new JTextArea();
	//启动按钮
	private JButton start = new JButton("启动");
	//停止按钮
	private JButton stop = new JButton("停止");
	//列表
	private List list = new List(35);
	//服务器
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
		setTitle("服务器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel contentPane = new JPanel();
	
		contentPane.setBackground(Color.gray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//内容面板
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
				if (JOptionPane.showConfirmDialog(null, "是否断开瑜当前客户端的连接") == JOptionPane.OK_OPTION) {
					server.deleteThread(item);
					deleteList(item);
					textArea.append("客户端" + item + "连接中断" + "\n");

				}

			}

		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			server = new Server(this);
			server.start();
			textArea.append("服务器启动" + "\n");
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
