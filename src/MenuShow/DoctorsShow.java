package MenuShow;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import MenuAdmin.JMenuAdmin;
import ToolsMethods.Tools;
import ToolsMethods.Ventana;

public class DoctorsShow extends JFrame implements Ventana {

	boolean ventanaAbierta;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	Tools T = new Tools();
	String Name,Proname,Email,Phone,Date,ID;
	@SuppressWarnings("unused")
	private JMenuAdmin instancia; 	
<<<<<<< HEAD
	DefaultTableModel modelo = T.MostrarTabla("Doctor");
	Color azul = new Color(10, 59, 129);
	Color blanco = new Color(255, 255, 255);
=======
	DefaultTableModel modelo = T.MostrarTablaPacientes();

>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e

	/**
	 * Create the frame.
	 */
	public DoctorsShow(JMenuAdmin instanciaJMenuAdmin) {
		this.instancia = instanciaJMenuAdmin;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(10, 59, 129));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\search (2).png"));
		lblNewLabel.setBounds(422, 11, 31, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 412, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 346, 355);
		table.setModel(modelo);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(4, 28, 62));
		scrollPane.setBounds(0, 0, 412, 380);
		panel.add(scrollPane);
		
		
		textField = new JTextField();
		
		textField.setForeground(new Color(255, 255, 255));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
<<<<<<< HEAD
				modelo = T.FilterTable(textField.getText(),"Doctor","Nombre");
=======
				modelo = T.ShowPacientesByNombre(textField.getText());
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
				table.setModel(modelo);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		textField.setFont(new Font("Roboto", Font.PLAIN, 13));
		textField.setBorder(null);
		textField.setBackground(new Color(10, 59, 129));
		textField.setBounds(452, 13, 150, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(422, 45, 178, 2);
		contentPane.add(separator);
		
		JPanel UpdatePanel = new JPanel();
		UpdatePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				update();
			}
		});
		UpdatePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		UpdatePanel.setBackground(new Color(10, 59, 129));
		UpdatePanel.setBounds(412, 72, 198, 41);
		contentPane.add(UpdatePanel);
		UpdatePanel.setLayout(null);
		
		JLabel PictureUp = new JLabel("");
		PictureUp.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edit.png"));
		PictureUp.setBounds(62, 4, 32, 34);
		UpdatePanel.add(PictureUp);
		
		JLabel lblNewLabel_1 = new JLabel("Update");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(95, 14, 46, 14);
		UpdatePanel.add(lblNewLabel_1);
		
		JLabel PictureAzul = new JLabel("");
		PictureAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\editAzul.png"));
		PictureAzul.setBounds(62, 4, 32, 34);
		UpdatePanel.add(PictureAzul);
		
<<<<<<< HEAD
		T.pintarPanelYLabel(UpdatePanel, lblNewLabel_1, PictureUp, blanco, azul);
=======
		T.pintarPanelYLabel(UpdatePanel, lblNewLabel_1, PictureUp, PictureAzul);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
		JPanel DeletePanel = new JPanel();
		DeletePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				delete();
			}
		});
		DeletePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DeletePanel.setBackground(new Color(10, 59, 129));
		DeletePanel.setBounds(412, 118, 198, 40);
		contentPane.add(DeletePanel);
		DeletePanel.setLayout(null);
		
		JLabel PictureDe = new JLabel("");
		PictureDe.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\bin.png"));
		PictureDe.setBounds(61, 3, 32, 34);
		DeletePanel.add(PictureDe);
		
		JLabel lblNewLabel_1_1 = new JLabel("Delete");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(96, 14, 46, 14);
		DeletePanel.add(lblNewLabel_1_1);
		
		JLabel PictureDeAzul = new JLabel("");
		PictureDeAzul.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\binazul.png"));
		PictureDeAzul.setBounds(61, 3, 32, 34);
		DeletePanel.add(PictureDeAzul);
		
<<<<<<< HEAD
		T.pintarPanelYLabel(DeletePanel, lblNewLabel_1_1, PictureDe, blanco, azul);
=======
		T.pintarPanelYLabel(DeletePanel, lblNewLabel_1_1, PictureDe, PictureDeAzul);
>>>>>>> c98c74815a353642cf1fb6126b8bb41d88be4a2e
		
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
	 
	 void delete() {
		
	 }
	 
	 void update() {
	
	 }
	 
	}


