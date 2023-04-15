/*
 * Created by JFormDesigner on Thu Apr 13 10:28:02 ICT 2023
 */

package GUI;

import DAO.NhomHome;
import entity1.Nhom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ASUS
 */
public class PhanQuyenForm extends JFrame {
	public PhanQuyenForm() {
		
		initComponents();
		
		
		
	}

	public void ChonPhanQuyen(ActionEvent e) {

	}

	public JLabel getLabel1() {
		return label1;
	}

	private void createUIComponents() {
		// TODO: add custom component creation code here
	}

	private void label1MouseClicked(MouseEvent e) {
		System.out.println("clicked");
	}

	public JLabel getTenNhanVien() {
		return tenNhanVien;
	}

	private void label1MouseMoved(MouseEvent e) {
		System.out.println("hovvvv");
	}
	

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - lai loc
		scrollPane1 = new JScrollPane();
		panel2 = new JPanel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		headerPanel = new JPanel();
		personalImage = new JLabel();
		tenNhanVien = new JLabel();
		label1 = new JLabel();
		label3 = new JLabel();

		//======== this ========
		setTitle("B\u1ea3ng ph\u00e2n quy\u1ec1n");
		setBackground(new Color(0xcae3e7));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setType(Window.Type.POPUP);
		setFocusableWindowState(false);
		setIconImage(new ImageIcon(getClass().getResource("/GUI/image/29.jpg")).getImage());
		Container contentPane = getContentPane();

		//======== scrollPane1 ========
		{
			scrollPane1.setAutoscrolls(true);
			scrollPane1.setDoubleBuffered(true);
			scrollPane1.setVerifyInputWhenFocusTarget(false);
			scrollPane1.setBorder(null);
			scrollPane1.setFocusable(false);

			//======== panel2 ========
			{
				panel2.setBackground(new Color(0xcae3e7));
				panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
				. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
				. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
				awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder( )) )
				; panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
				) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
				;

				//======== panel1 ========
				{
					panel1.setBackground(new Color(0xcae3e7));
					panel1.setLayout(new GridLayout(6, 1, 34, 30));

					//---- button1 ----
					button1.setText("S\u1ea2N PH\u1ea8M");
					button1.setBackground(new Color(0xf7fdef));
					button1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button1.setForeground(new Color(0xff6666));
					button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 5f));
					button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button1.setAutoscrolls(true);
					button1.setDefaultCapable(false);
					button1.setFocusable(false);
					button1.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button1);

					//---- button2 ----
					button2.setText("H\u00d3A \u0110\u01a0N");
					button2.setBackground(new Color(0xf7fdef));
					button2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button2.setForeground(new Color(0xff6666));
					button2.setFont(button2.getFont().deriveFont(button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 5f));
					button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button2.setAutoscrolls(true);
					button2.setFocusable(false);
					button2.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button2);

					//---- button3 ----
					button3.setText("T\u00c0I KHO\u1ea2N");
					button3.setBackground(new Color(0xf7fdef));
					button3.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button3.setForeground(new Color(0xff6666));
					button3.setFont(button3.getFont().deriveFont(button3.getFont().getStyle() | Font.BOLD, button3.getFont().getSize() + 5f));
					button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button3.setAutoscrolls(true);
					button3.setFocusable(false);
					button3.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button3);

					//---- button4 ----
					button4.setText("NH\u1eacP H\u00c0NG");
					button4.setBackground(new Color(0xf7fdef));
					button4.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button4.setForeground(new Color(0xff6666));
					button4.setFont(button4.getFont().deriveFont(button4.getFont().getStyle() | Font.BOLD, button4.getFont().getSize() + 5f));
					button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button4.setAutoscrolls(true);
					button4.setFocusable(false);
					button4.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button4);

					//---- button5 ----
					button5.setText("TH\u1ed0NG K\u00ca");
					button5.setBackground(new Color(0xf7fdef));
					button5.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button5.setForeground(new Color(0xff6666));
					button5.setFont(button5.getFont().deriveFont(button5.getFont().getStyle() | Font.BOLD, button5.getFont().getSize() + 5f));
					button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button5.setAutoscrolls(true);
					button5.setFocusable(false);
					button5.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button5);

					//---- button6 ----
					button6.setText("NH\u00d3M");
					button6.setBackground(new Color(0xf7fdef));
					button6.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, Color.orange, null));
					button6.setForeground(new Color(0xff6666));
					button6.setFont(button6.getFont().deriveFont(button6.getFont().getStyle() | Font.BOLD, button6.getFont().getSize() + 5f));
					button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					button6.setAutoscrolls(true);
					button6.setFocusable(false);
					button6.addActionListener(e -> ChonPhanQuyen(e));
					panel1.add(button6);
				}

				//======== headerPanel ========
				{
					headerPanel.setBackground(new Color(0xf4f5f6));
					headerPanel.setFocusable(false);
					headerPanel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.orange, Color.orange, null, null));

					//---- tenNhanVien ----
					tenNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
					tenNhanVien.setForeground(new Color(0x333333));
					tenNhanVien.setFont(tenNhanVien.getFont().deriveFont(tenNhanVien.getFont().getStyle() | Font.BOLD, tenNhanVien.getFont().getSize() + 5f));

					GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
					headerPanel.setLayout(headerPanelLayout);
					headerPanelLayout.setHorizontalGroup(
						headerPanelLayout.createParallelGroup()
							.addGroup(headerPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(personalImage, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(tenNhanVien, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(361, Short.MAX_VALUE))
					);
					headerPanelLayout.setVerticalGroup(
						headerPanelLayout.createParallelGroup()
							.addGroup(headerPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(personalImage, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(headerPanelLayout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addComponent(tenNhanVien, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(106, Short.MAX_VALUE))
					);
				}

				//---- label1 ----
				label1.setIcon(new ImageIcon(getClass().getResource("/GUI/image/icons8-create-80.png")));
				label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				label1.setText("CREATE");
				label1.setBackground(new Color(0x99ff99));
				label1.setOpaque(true);
				label1.setBorder(new BevelBorder(BevelBorder.RAISED));
				label1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						label1MouseClicked(e);
					}
				});
				label1.addMouseMotionListener(new MouseMotionAdapter() {
					@Override
					public void mouseMoved(MouseEvent e) {
						label1MouseMoved(e);
					}
				});

				//---- label3 ----
				label3.setText("CREATE");
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 4f));
				label3.setForeground(new Color(0x00cc33));

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap(25, Short.MAX_VALUE)
							.addGroup(panel2Layout.createParallelGroup()
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 579, GroupLayout.PREFERRED_SIZE)
							.addGap(31, 31, 31))
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
								.addGroup(panel2Layout.createSequentialGroup()
									.addGap(44, 44, 44)
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(6, 6, 6))
				);
			}
			scrollPane1.setViewportView(panel2);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 756, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 27, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}
	
	public JPanel getPanel2() {
		return panel2;
	}

	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}



	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - lai loc
	private JScrollPane scrollPane1;
	private JPanel panel2;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JPanel headerPanel;
	private JLabel personalImage;
	private JLabel tenNhanVien;
	private JLabel label1;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	public JLabel getPersonalImage() {
		return personalImage;
	}

	public void setPersonalImage(JLabel personalImage) {
		this.personalImage = personalImage;
	}




	
}
