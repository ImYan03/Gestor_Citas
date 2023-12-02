package MenuAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import ToolsMethods.Tools;
import ToolsMethods.Ventana;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PacientesShow extends JFrame implements Ventana {
	boolean ventanaAbierta;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	Tools T = new Tools();
	String Name,Proname,Email,Phone,Date,ID;
	@SuppressWarnings("unused")
	private JMenuAdmin instanciaJMenuAdmin; 	

	/**
	 * Create the frame.
	 */
	public PacientesShow(JMenuAdmin instanciaJMenuAdmin) {
		this.instanciaJMenuAdmin = instanciaJMenuAdmin;
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 247, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		DefaultTableModel modelo = T.MostrarTablaPacientes();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\search (1).png"));
		lblNewLabel.setBounds(378, 12, 31, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 366, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 346, 355);
		table.setModel(modelo);
		JTableHeader header = table.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
        headerRenderer.setBackground(Color.BLUE); 
        headerRenderer.setForeground(Color.WHITE);
        Color gris = new Color(200,200,200);
        table.setGridColor(gris);
        header.setDefaultRenderer(new CustomHeaderRenderer());        
		panel.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 346, 358);
		panel.add(scrollPane);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				remove(table);
				DefaultTableModel modelo2 = T.ShowPacientesByNombre(textField.getText());
				table = new JTable();
				table.setBounds(10, 11, 346, 355);
				table.setModel(modelo2);
				JTableHeader header = table.getTableHeader();
		        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
		        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER); 
		        headerRenderer.setBackground(Color.BLUE); 
		        headerRenderer.setForeground(Color.WHITE);
		        Color gris = new Color(200,200,200);
		        table.setGridColor(gris);
		        header.setDefaultRenderer(new CustomHeaderRenderer());        
				panel.add(table);
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(10, 11, 346, 358);
				panel.add(scrollPane);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		textField.setFont(new Font("Roboto", Font.PLAIN, 13));
		textField.setBorder(null);
		textField.setBackground(new Color(247, 247, 247));
		textField.setBounds(408, 13, 194, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedrow = table.getSelectedRow();
				if(selectedrow >= 0 && selectedrow < modelo.getRowCount()) {
					int id = (int) modelo.getValueAt(selectedrow, 0);
					T.EliminarDatosPacientes(id);
					modelo.removeRow(selectedrow);
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\delete.png"));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 11));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(6, 34, 74));
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(365, 338, 246, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	int selectedrow = table.getSelectedRow();
				
				if(selectedrow != -1) {
					
					Object IdObj = modelo.getValueAt(selectedrow, 0);
					    int Id = -1;
					    if (IdObj instanceof Integer) {
					        Id = (Integer) IdObj;
					    }

					    Name = (String) modelo.getValueAt(selectedrow, 1);
					    Proname = (String) modelo.getValueAt(selectedrow, 2);
					    Email = (String) modelo.getValueAt(selectedrow, 3);
					    Object phoneObj = modelo.getValueAt(selectedrow, 4);
					    Phone = phoneObj != null ? phoneObj.toString() : "";
					    Date = (String) modelo.getValueAt(selectedrow, 5);
					    Object IDObj = modelo.getValueAt(selectedrow, 6);
					    ID = IDObj != null ? IDObj.toString() : "";
					    PacientesEdit edit = new PacientesEdit();
						edit.setName(Name);
						edit.setProname(Proname);
						edit.setEmail(Email);
						edit.setPhone(Phone);
						edit.setDate(Date);
						edit.setID(ID);
						edit.setid(Id);
						edit.ShowVentana();	
						edit.setInstanciaJMenuAdmin(instanciaJMenuAdmin);
				}
				
				
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edita.png"));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Roboto", Font.BOLD, 11));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(6, 34, 74));
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBounds(365, 301, 246, 32);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 64));
		separator.setBounds(378, 45, 222, 2);
		contentPane.add(separator);
		
		 addWindowListener((WindowListener) new WindowAdapter() {
	            @Override
	            public void windowOpened(WindowEvent e) {
	                instanciaJMenuAdmin.DisableWindows();
	            }

	            @Override
	            public void windowClosing(WindowEvent e) {
	                instanciaJMenuAdmin.EnableWindows();
	            }
	        });
		
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		this.setVisible(true);
	}
	
	 public boolean isVentanaAbierta() {
	        return ventanaAbierta;
	    }
}
