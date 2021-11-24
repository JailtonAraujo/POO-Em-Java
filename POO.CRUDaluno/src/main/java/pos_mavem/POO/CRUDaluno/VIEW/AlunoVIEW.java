package pos_mavem.POO.CRUDaluno.VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import pos_mavem.POO.CRUDaluno.Controllers.AlunoController;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.Window.Type;

public class AlunoVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField TextRg;
	private JTextField TextNome;
	private JTextField TextCPF;
	private JTextField TextNomeDoPai;
	private JTextField TextDataNascimento;
	private JTextField TextID;
	private JLabel lblNomeDoPai;
	private JLabel lblNomeDaMe;
	private JTextField TextNomeDaMae;
	private JTextField TextDataMatricula;
	private JLabel lblDataDaMatricula;
	private JLabel lblNomeDaEscola;
	private JTextField TextNomeDaEscola;
	private JTextField TextSerieMatriculado;
	private JLabel lblSerieMatriculado;
	private JTable TableAlunos;

	/**
	 * Launch the application.
	 */
	
	private final AlunoController controller;
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
		setForeground(Color.GRAY);
		setResizable(false);
		setTitle("ALUNO");
		this.controller = new AlunoController(this);
		
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
		
		TextNome = new JTextField();
		TextNome.setBounds(10, 85, 182, 20);
		panel.add(TextNome);
		TextNome.setColumns(10);
		
		TextID = new JTextField();
		TextID.setEditable(false);
		TextID.setBounds(10, 37, 48, 20);
		panel.add(TextID);
		TextID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		lblNewLabel.setBounds(10, 22, 15, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 10));
		lblNome.setBounds(10, 68, 48, 14);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 10));
		lblCpf.setBounds(10, 165, 23, 14);
		panel.add(lblCpf);
		
		TextCPF = new JTextField();
		TextCPF.setBounds(10, 184, 130, 20);
		panel.add(TextCPF);
		TextCPF.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Arial", Font.BOLD, 10));
		lblRg.setBounds(10, 116, 23, 14);
		panel.add(lblRg);
		
		TextRg = new JTextField();
		TextRg.setBounds(10, 134, 130, 20);
		panel.add(TextRg);
		TextRg.setColumns(10);
		
		JLabel lblId = new JLabel("DATA DE NASCIMENTO:");
		lblId.setFont(new Font("Arial", Font.BOLD, 10));
		lblId.setBounds(233, 67, 122, 14);
		panel.add(lblId);
		
		TextDataNascimento = new JTextField();
		TextDataNascimento.setBounds(233, 84, 86, 20);
		panel.add(TextDataNascimento);
		TextDataNascimento.setColumns(10);
		
		TextNomeDoPai = new JTextField();
		TextNomeDoPai.setBounds(233, 37, 189, 20);
		panel.add(TextNomeDoPai);
		TextNomeDoPai.setColumns(10);
		
		lblNomeDoPai = new JLabel("NOME DO PAI:");
		lblNomeDoPai.setFont(new Font("Arial", Font.BOLD, 10));
		lblNomeDoPai.setBounds(233, 21, 77, 14);
		panel.add(lblNomeDoPai);
		
		TextNomeDaMae = new JTextField();
		TextNomeDaMae.setBounds(233, 134, 189, 20);
		panel.add(TextNomeDaMae);
		TextNomeDaMae.setColumns(10);
		
		lblNomeDaMe = new JLabel("NOME DA MÃE:");
		lblNomeDaMe.setFont(new Font("Arial", Font.BOLD, 10));
		lblNomeDaMe.setBounds(233, 115, 77, 14);
		panel.add(lblNomeDaMe);
		
		TextNomeDaEscola = new JTextField();
		TextNomeDaEscola.setBounds(473, 39, 189, 20);
		panel.add(TextNomeDaEscola);
		TextNomeDaEscola.setColumns(10);
		
		lblNomeDaEscola = new JLabel("NOME DA ESCOLA:");
		lblNomeDaEscola.setFont(new Font("Arial", Font.BOLD, 10));
		lblNomeDaEscola.setBounds(474, 22, 100, 14);
		panel.add(lblNomeDaEscola);
		
		TextSerieMatriculado = new JTextField();
		TextSerieMatriculado.setBounds(473, 85, 120, 20);
		panel.add(TextSerieMatriculado);
		TextSerieMatriculado.setColumns(10);
		
		lblSerieMatriculado = new JLabel("SERIE MATRICULADO:");
		lblSerieMatriculado.setFont(new Font("Arial", Font.BOLD, 10));
		lblSerieMatriculado.setBounds(473, 66, 120, 14);
		panel.add(lblSerieMatriculado);
		
		TextDataMatricula = new JTextField();
		TextDataMatricula.setBounds(473, 133, 120, 20);
		panel.add(TextDataMatricula);
		TextDataMatricula.setColumns(10);
		
		lblDataDaMatricula = new JLabel("DATA DA MATRICULA:");
		lblDataDaMatricula.setFont(new Font("Arial", Font.BOLD, 10));
		lblDataDaMatricula.setBounds(473, 116, 109, 14);
		panel.add(lblDataDaMatricula);
		
		JButton BtnLimpar = new JButton("LIMPAR");
		BtnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.LimparCampos();
			}
		});
		BtnLimpar.setBounds(526, 193, 89, 23);
		panel.add(BtnLimpar);
		
		JButton BtnSalvar = new JButton("SALVAR");
		BtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.Cadastrar();
			}
		});
		BtnSalvar.setBounds(31, 238, 89, 33);
		contentPane.add(BtnSalvar);
		
		JButton BtnExcluir = new JButton("EXCLUIR");
		BtnExcluir.setBounds(185, 238, 89, 33);
		contentPane.add(BtnExcluir);
		
		JButton BtnEditar = new JButton("EDITAR");
		BtnEditar.setBounds(376, 238, 89, 33);
		contentPane.add(BtnEditar);
		
		JButton BtnAtualizar = new JButton("AUTALIZAR");
		BtnAtualizar.setBounds(538, 238, 103, 33);
		contentPane.add(BtnAtualizar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Rela\u00E7\u00E3o De Alunos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 296, 672, 325);
		contentPane.add(scrollPane);
		
		TableAlunos = new JTable();
		TableAlunos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "CPF", "SERIE", "ESCOLA"
			}
		));
		scrollPane.setViewportView(TableAlunos);
		
		controller.CarregarTabela();
	}

	public JTextField getTextRg() {
		return TextRg;
	}

	public void setTextRg(JTextField textRg) {
		TextRg = textRg;
	}

	public JTextField getTextNome() {
		return TextNome;
	}

	public void setTextNome(JTextField textNome) {
		TextNome = textNome;
	}

	public JTextField getTextCPF() {
		return TextCPF;
	}

	public void setTextCPF(JTextField textCPF) {
		TextCPF = textCPF;
	}

	public JTextField getTextNomeDoPai() {
		return TextNomeDoPai;
	}

	public void setTextNomeDoPai(JTextField textNomeDoPai) {
		TextNomeDoPai = textNomeDoPai;
	}

	public JTextField getTextDataNascimento() {
		return TextDataNascimento;
	}

	public void setTextDataNascimento(JTextField textDataNascimento) {
		TextDataNascimento = textDataNascimento;
	}

	public JTextField getTextID() {
		return TextID;
	}

	public void setTextID(JTextField textID) {
		TextID = textID;
	}

	public JTextField getTextNomeDaMae() {
		return TextNomeDaMae;
	}

	public void setTextNomeDaMae(JTextField textNomeDaMae) {
		TextNomeDaMae = textNomeDaMae;
	}

	public JTextField getTextDataMatricula() {
		return TextDataMatricula;
	}

	public void setTextDataMatricula(JTextField textDataMatricula) {
		TextDataMatricula = textDataMatricula;
	}

	public JTextField getTextNomeDaEscola() {
		return TextNomeDaEscola;
	}

	public void setTextNomeDaEscola(JTextField textNomeDaEscola) {
		TextNomeDaEscola = textNomeDaEscola;
	}

	public JTextField getTextSerieMatriculado() {
		return TextSerieMatriculado;
	}

	public void setTextSerieMatriculado(JTextField textSerieMatriculado) {
		TextSerieMatriculado = textSerieMatriculado;
	}

	public JTable getTableAlunos() {
		return TableAlunos;
	}

	public void setTableAlunos(JTable tableAlunos) {
		TableAlunos = tableAlunos;
	}
	
	
}
