package view.produto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class CadastroProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField txtRecebeDescricao;
	private JTextField textField;
	private JTextField txtReferencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProdutos frame = new CadastroProdutos();
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
	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblLinha = new JLabel("Linha");
		lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblColeo = new JLabel("Cole\u00E7\u00E3o");
		lblColeo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnIncluiProduto = new JButton("");
		btnIncluiProduto.setBackground(Color.WHITE);
		btnIncluiProduto.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/add324_24.png")));
		
		JComboBox comboBoxGrupo = new JComboBox();
		
		JComboBox comboBoxLinha = new JComboBox();
		
		JButton btnIncluiLinha = new JButton("");
		btnIncluiLinha.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/add324_24.png")));
		btnIncluiLinha.setBackground(Color.WHITE);
		
		JButton btnIncluiMaterial = new JButton("");
		btnIncluiMaterial.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/add324_24.png")));
		btnIncluiMaterial.setBackground(Color.WHITE);
		
		JComboBox comboBoxMaterial = new JComboBox();
		
		JButton btnIncluiModelo = new JButton("");
		btnIncluiModelo.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/add324_24.png")));
		btnIncluiModelo.setBackground(Color.WHITE);
		
		JButton btnIncluiColecao = new JButton("");
		btnIncluiColecao.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/add324_24.png")));
		btnIncluiColecao.setBackground(Color.WHITE);
		
		JComboBox comboBoxModelo = new JComboBox();
		
		JComboBox comboBoxColecao = new JComboBox();
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox comboBoxGrade = new JComboBox();
		
		JLabel lblDerscricaoo = new JLabel("Derscri\u00E7\u00E3o");
		lblDerscricaoo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtRecebeDescricao = new JTextField();
		txtRecebeDescricao.setColumns(10);
		
		JLabel lblUnid = new JLabel("Unid.");
		lblUnid.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblRefFornecedor = new JLabel("Ref. Fornecedor");
		lblRefFornecedor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblReferencia = new JLabel("Refer\u00EAncia");
		lblReferencia.setForeground(Color.RED);
		lblReferencia.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtReferencia = new JTextField();
		txtReferencia.setColumns(10);
		
		JLabel lblRefernciaInativa = new JLabel("Refer\u00EAncia Inativa");
		lblRefernciaInativa.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JCheckBox checkRefereciaInativa = new JCheckBox("");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/Actions-dialog-close-icon (1).png")));
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/App-clean-icon (2).png")));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon(CadastroProdutos.class.getResource("/imagensAcao/mnSair16_16.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblRefernciaInativa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(checkRefereciaInativa)
							.addGap(563)
							.addComponent(btnConfirmar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLinha, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGrupo, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMaterial)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(comboBoxMaterial, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(comboBoxLinha, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(comboBoxGrupo, Alignment.LEADING, 0, 153, Short.MAX_VALUE))
											.addComponent(lblModelo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
										.addComponent(comboBoxModelo, 0, 153, Short.MAX_VALUE)
										.addComponent(comboBoxColecao, 0, 153, Short.MAX_VALUE)
										.addComponent(comboBoxGrade, Alignment.LEADING, 0, 153, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnIncluiColecao, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnIncluiLinha, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnIncluiProduto, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnIncluiMaterial, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnIncluiModelo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblColeo)
									.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblGrade, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 125, Short.MAX_VALUE)))
							.addGap(134)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblDerscricaoo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRecebeDescricao, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblRefFornecedor)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(271)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtReferencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblReferencia))))
							.addGap(85)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUnid)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addGap(93)))
					.addGap(51))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGrupo)
						.addComponent(lblDerscricaoo)
						.addComponent(lblUnid, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxGrupo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnIncluiProduto, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLinha)
								.addComponent(lblRefFornecedor)
								.addComponent(lblReferencia)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtRecebeDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBoxLinha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnIncluiLinha, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtReferencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(lblMaterial)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBoxMaterial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(lblModelo))
						.addComponent(btnIncluiMaterial, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnIncluiModelo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addComponent(lblColeo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxColecao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIncluiColecao, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(57)
					.addComponent(lblGrade)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(198)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblRefernciaInativa)
							.addComponent(btnCancelar)
							.addComponent(btnSair)
							.addComponent(btnConfirmar))
						.addComponent(checkRefereciaInativa))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
