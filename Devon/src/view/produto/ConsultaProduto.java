package view.produto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class ConsultaProduto extends JFrame {
	private JTextField textReferencia;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaProduto frame = new ConsultaProduto();
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
	
	public void iniciaTela(){
		try {
			ConsultaProduto frame = new ConsultaProduto();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ConsultaProduto() {
		getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100,1250,700);
		
		JButton btnIncluir = new JButton("Incluir");
		
		btnIncluir.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/incluir16_16.png")));
		btnIncluir.setVerticalAlignment(SwingConstants.TOP);
		btnIncluir.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/btnAlterar.png")));
		btnAlterar.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/consultar16_16.png")));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent evt) {  
	           ConsultaProduto.this.dispose(); 
	        }  
	    });  
	 
		btnSair.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/mnSair16_16.png")));
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		Box horizontalBox = Box.createHorizontalBox();
		
		JLabel lblReferencia = new JLabel("Refer\u00EAncia:");
		lblReferencia.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblRefFornecedor = new JLabel("Ref. Fornecedor:");
		lblRefFornecedor.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblCodDeBarras = new JLabel("C\u00F3d. de Barras:");
		lblCodDeBarras.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textReferencia = new JTextField();
		textReferencia.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JCheckBox chckbxProdutosInativos = new JCheckBox("Produtos Inativos");
		chckbxProdutosInativos.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxProdutosInativos.setBackground(Color.WHITE);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/Pesquisar32_32.png")));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.RED);
		
		JList list = new JList();
		list.setBorder(new LineBorder(Color.RED));
		list.setForeground(UIManager.getColor("CheckBox.focus"));
		list.setBackground(SystemColor.control);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/exclui16_16.png")));
		
		JButton btnFiltros = new JButton("Filtros");
		btnFiltros.setIcon(new ImageIcon(ConsultaProduto.class.getResource("/imagensAcao/btnFilter32_32.png")));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(40)
									.addComponent(lblReferencia, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textReferencia, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRefFornecedor, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblDescricao)
												.addComponent(lblCodDeBarras))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(groupLayout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(textField_1))
													.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))))))
							.addGap(189)
							.addComponent(btnFiltros, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnPesquisar, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxProdutosInativos)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 1150, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnIncluir, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))))
					.addGap(18)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(horizontalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReferencia, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textReferencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxProdutosInativos))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRefFornecedor, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodDeBarras, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDescricao, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(15))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPesquisar)
								.addComponent(btnFiltros, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(horizontalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addGap(89)
							.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnIncluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
						.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
					.addGap(26))
		);
		getContentPane().setLayout(groupLayout);

	}
}
