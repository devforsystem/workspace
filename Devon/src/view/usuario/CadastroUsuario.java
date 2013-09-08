package view.usuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import controle.usuario.Usuario;



public class CadastroUsuario extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JPanel jContentPane_1;
	private JLabel jLabel = null;
	private JLabel lblNome;
	private JLabel jLabel1 = null;
	private JLabel lblSenha;
	private JLabel jLabel2 = null;
	private JLabel lblLogin;
	private JTextField txtLogin = null;

	private JLabel labelTitulo = null;
	private JLabel lblUsuario;
	private JPasswordField passwordUsuario;
	private JTextField txtSobrenome;
	private JTextField textField;
	private JTextField txtCargo;
	private JTextField txtNome;
	private JTextField txtApelido;
	private JLabel label;
	private JButton btnConfgDeAcesso;
	
	private Usuario usuario = null;
	
	public CadastroUsuario()
	{
		super();
		initialize();
	}

	private void initialize()
	{
		this.setSize(680,385);
		this.setTitle("Cadastro de Usuários");
		this.setContentPane(getJContentPane());
		
		passwordUsuario = new JPasswordField();
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnConfirma = new JButton("Confirmar");
		btnConfirma.setIcon(new ImageIcon(CadastroUsuario.class.getResource("/imagensAcao/App-clean-icon (2).png")));
		
		btnConfirma.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   // ler os dados digitados
					String nome = txtNome.getText();
					String sobreNome = txtSobrenome.getText();
					String cargo = txtCargo.getText();
					String login = txtLogin.getText();
					char[] senha = passwordUsuario.getPassword();
					String apelido = textField.getText();
					
					try {
						usuario = new Usuario();
						usuario.setNome(nome);
						usuario.setSobreNome(sobreNome);
						usuario.setCargo(cargo);
						usuario.setLogin(login);
						usuario.setSenha(senha);
						usuario.setApelido(apelido);
						
						//solicita ao DAO que salve o objeto
						
					} catch (Exception exUsuario) {
						System.out.println("Exceção: " + exUsuario.getMessage());
					}
					// fechar esta a janela
					setVisible(false);
					//Aqui vai chamar a listagem
			   }
			  });
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroUsuario.class.getResource("/imagensAcao/Actions-dialog-close-icon (1).png")));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon(CadastroUsuario.class.getResource("/imagensAcao/mnSair16_16.png")));
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		label = new JLabel("");
		
		btnConfgDeAcesso = new JButton("Confg. de Acesso");
		btnConfgDeAcesso.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConfgDeAcesso.setIcon(new ImageIcon(CadastroUsuario.class.getResource("/imagensAcao/Actions-unlock-icon (1).png")));
		GroupLayout gl_jContentPane_1 = new GroupLayout(jContentPane_1);
		gl_jContentPane_1.setHorizontalGroup(
			gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jContentPane_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jContentPane_1.createSequentialGroup()
							.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApelido)
								.addComponent(lblLogin))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_jContentPane_1.createSequentialGroup()
									.addComponent(getTxtLogin(), GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jContentPane_1.createSequentialGroup()
									.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
										.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSobrenome, Alignment.TRAILING)
										.addComponent(lblCargo, Alignment.TRAILING)))))
						.addComponent(btnConfgDeAcesso, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jContentPane_1.createSequentialGroup()
							.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jContentPane_1.createSequentialGroup()
									.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCargo, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
										.addComponent(txtSobrenome, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
									.addGap(67))
								.addComponent(passwordUsuario, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
							.addGap(102))
						.addGroup(gl_jContentPane_1.createSequentialGroup()
							.addComponent(btnConfirma)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_jContentPane_1.createSequentialGroup()
					.addGap(201)
					.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(292, Short.MAX_VALUE))
				.addGroup(gl_jContentPane_1.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(761, Short.MAX_VALUE))
		);
		gl_jContentPane_1.setVerticalGroup(
			gl_jContentPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jContentPane_1.createSequentialGroup()
					.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSobrenome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSobrenome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApelido)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCargo))
					.addGap(47)
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTxtLogin(), GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addComponent(label)
					.addGap(38)
					.addGroup(gl_jContentPane_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSair)
						.addComponent(btnCancelar)
						.addComponent(btnConfirma)
						.addComponent(btnConfgDeAcesso))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		jContentPane_1.setLayout(gl_jContentPane_1);
		this.setLocationRelativeTo(null);
	}

	private JPanel getJContentPane(){
	
		lblUsuario = new JLabel();
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setText("Dados do Usuário");
		lblLogin = new JLabel();
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogin.setText("Login:");
		lblSenha = new JLabel();
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setText("Senha:");
		lblNome = new JLabel();
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setText("Nome:");
		jContentPane_1 = new JPanel();
		jContentPane_1.setBackground(Color.WHITE);
		return jContentPane_1;
	}

	private JTextField getTxtLogin()
	{
		if (txtLogin == null)
		{
			txtLogin = new JTextField();
		}
		return txtLogin;
	}
}
