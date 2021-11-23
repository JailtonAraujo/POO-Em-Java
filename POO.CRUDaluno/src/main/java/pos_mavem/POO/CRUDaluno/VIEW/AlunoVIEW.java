package pos_mavem.POO.CRUDaluno.VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

public class AlunoVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNomeDoPai;
	private JLabel lblNomeDaMe;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblDataDaMatricula;
	private JLabel lblNomeDaEscola;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblSerieMatriculado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoVIEW frame = new AlunoVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlunoVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dados Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 0, 672, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 85, 182, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 37, 48, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 22, 15, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(10, 68, 33, 14);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 165, 23, 14);
		panel.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 184, 130, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(10, 116, 23, 14);
		panel.add(lblRg);
		
		textField = new JTextField();
		textField.setBounds(10, 134, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("DATA DE NASCIMENTO:");
		lblId.setBounds(233, 67, 122, 14);
		panel.add(lblId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(233, 84, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(233, 37, 189, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		lblNomeDoPai = new JLabel("NOME DO PAI:");
		lblNomeDoPai.setBounds(233, 21, 77, 14);
		panel.add(lblNomeDoPai);
		
		textField_6 = new JTextField();
		textField_6.setBounds(233, 134, 189, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		lblNomeDaMe = new JLabel("NOME DA MÃE:");
		lblNomeDaMe.setBounds(233, 115, 77, 14);
		panel.add(lblNomeDaMe);
		
		textField_8 = new JTextField();
		textField_8.setBounds(473, 39, 189, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		lblNomeDaEscola = new JLabel("NOME DA ESCOLA:");
		lblNomeDaEscola.setBounds(474, 22, 100, 14);
		panel.add(lblNomeDaEscola);
		
		textField_9 = new JTextField();
		textField_9.setBounds(473, 85, 120, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		lblSerieMatriculado = new JLabel("SERIE MATRICULADO:");
		lblSerieMatriculado.setBounds(473, 66, 120, 14);
		panel.add(lblSerieMatriculado);
		
		textField_7 = new JTextField();
		textField_7.setBounds(473, 133, 120, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		lblDataDaMatricula = new JLabel("DATA DA MATRICULA:");
		lblDataDaMatricula.setBounds(473, 116, 109, 14);
		panel.add(lblDataDaMatricula);
	}
}
