package view.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;

import com.sun.media.sound.Toolkit;

import view.produto.CadastroProdutos;
import view.produto.ConsultaProduto;
import view.usuario.CadastroUsuario;

import javax.swing.JTextField;
import java.awt.SystemColor;

public class MenuPrincipal extends JFrame {
	private JTextField textRetornaUsuario;
	private JTextField textRetornaValidade;

	
	public MenuPrincipal() {
		getContentPane().setBackground(SystemColor.textHighlightText);
		getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 1024, 768);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setHorizontalAlignment(SwingConstants.LEFT);
		btnProdutos.setVerticalAlignment(SwingConstants.BOTTOM);
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaProduto inicia = new ConsultaProduto();
				inicia.iniciaTela();
			}
		});
		btnProdutos.setSize(128,128);
		btnProdutos.setBackground(UIManager.getColor("Button.background"));
		btnProdutos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProdutos.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/produto48_48.png")));
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setHorizontalAlignment(SwingConstants.LEFT);
		btnClientes.setSize(128, 128);
		btnClientes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClientes.setVerticalAlignment(SwingConstants.BOTTOM);
		btnClientes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/btnCliente48_48.png")));
		btnClientes.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnPagamentos = new JButton("Pagamentos");
		btnPagamentos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPagamentos.setHorizontalAlignment(SwingConstants.LEFT);
		btnPagamentos.setSize(128,128);
		btnPagamentos.setBackground(UIManager.getColor("Button.background"));
		btnPagamentos.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/1378091524_money.png")));
		
		JButton btnRelatoriosF = new JButton("Relat\u00F3rios Fin.");
		btnRelatoriosF.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRelatoriosF.setHorizontalAlignment(SwingConstants.LEFT);
		btnRelatoriosF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatoriosF.setSize(128, 128);
		btnRelatoriosF.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/1378193100_sales-report.png")));
		btnRelatoriosF.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnRelatoriosE = new JButton("Relat\u00F3rios de Estoque");
		btnRelatoriosE.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRelatoriosE.setHorizontalAlignment(SwingConstants.LEFT);
		btnClientes.setSize(128, 128);
		btnRelatoriosE.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/1378193115_product-sales-report.png")));
		btnRelatoriosE.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnTelefoneSuporte = new JButton("Telefone do Suporte");
		btnTelefoneSuporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTelefoneSuporte.setHorizontalAlignment(SwingConstants.LEFT);
		btnTelefoneSuporte.setSize(128, 128);
		btnTelefoneSuporte.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/suporte48_48.png")));
		btnTelefoneSuporte.setSize(128,128);
		btnTelefoneSuporte.setBackground(UIManager.getColor("Button.background"));
		
		JButton btnTrocarUsuario = new JButton("Trocar Usu\u00E1rio");
		btnTrocarUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTrocarUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrocarUsuario.setSize(128, 128);
		btnTrocarUsuario.setBackground(UIManager.getColor("Button.background"));
		btnTrocarUsuario.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/trocausuario48_48.png")));
		btnTrocarUsuario.setSize(128, 128);
		
		JButton btnTrocarSenha = new JButton("Trocar Senha");
		btnTrocarSenha.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrocarSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTrocarSenha.setSize(128, 128);
		btnTrocarSenha.setBackground(UIManager.getColor("Button.background"));
		btnTrocarSenha.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/trocasenha48_48.png")));
		
		JButton btnSair = new JButton("Sair do Sistema");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSair.setSize(128, 128);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		btnSair.setBackground(UIManager.getColor("Button.background"));
		btnSair.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/btnExit48_48.png")));
		
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 9));
		
		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setFont(new Font("Tahoma", Font.BOLD, 9));
		
		textRetornaUsuario = new JTextField();
		textRetornaUsuario.setColumns(10);
		
		textRetornaValidade = new JTextField();
		textRetornaValidade.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnProdutos, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnPagamentos, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnRelatoriosF, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnTelefoneSuporte, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnTrocarUsuario, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnTrocarSenha, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRelatoriosE)
					.addContainerGap(1103, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnClientes, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1103, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(1024, Short.MAX_VALUE)
					.addComponent(lblUsurio, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textRetornaUsuario, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblValidade)
					.addGap(3)
					.addComponent(textRetornaValidade, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblUsurio, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClientes)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnProdutos)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPagamentos, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRelatoriosF)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRelatoriosE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTelefoneSuporte, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTrocarUsuario, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTrocarSenha)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textRetornaUsuario, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblValidade)
							.addComponent(textRetornaValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 1336, 700);
		
		JMenuBar Mcadastro = new JMenuBar();
		setJMenuBar(Mcadastro);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		Mcadastro.add(mnCadastro);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mntmProdutos.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			    CadastroProdutos produtos = new CadastroProdutos();
			    produtos.setVisible(true);
			   }
			  });
		mntmProdutos.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnProdutos16_16.png")));
		
		mntmProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultaProduto inicia = new ConsultaProduto();
				inicia.iniciaTela();
			}
		});
		mnCadastro.add(mntmProdutos);
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnCliente16_16.png")));
		mnCadastro.add(mntmClientes);
		
		JMenuItem mntmFuncionarios = new JMenuItem("Funcion\u00E1rios");
		mntmFuncionarios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnfuncionario16_16.png")));
		mnCadastro.add(mntmFuncionarios);
		
		JMenuItem mntmFornecedores = new JMenuItem("Fornecedores");
		mntmFornecedores.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnusuario16_16.png")));
		mnCadastro.add(mntmFornecedores);
		
		JMenuItem mntmCartes = new JMenuItem("Cart\u00F4es");
		mntmCartes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mncartoes16_16.png")));
		mnCadastro.add(mntmCartes);
		
		JMenuItem mntmLojas = new JMenuItem("Lojas");
		mntmLojas.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnloja16_16.png")));
		mnCadastro.add(mntmLojas);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mntmUsurios.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
			    CadastroUsuario usuario = new CadastroUsuario();
			    usuario.setVisible(true);
			   }
			  });
		mntmUsurios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnCliente16_16.png")));
		mnCadastro.add(mntmUsurios);
		
		JMenu mnEstoque = new JMenu("Estoque");
		Mcadastro.add(mnEstoque);
		
		JMenu mnEntradaDeMercadoria = new JMenu("Entrada de Mercadoria");
		mnEntradaDeMercadoria.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnEstoque16_16.png")));
		mnEstoque.add(mnEntradaDeMercadoria);
		
		JMenuItem mntmEntradaDeNota = new JMenuItem("Entrada de Nota Fiscal");
		mntmEntradaDeNota.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnEstoque16_16.png")));
		mnEntradaDeMercadoria.add(mntmEntradaDeNota);
		
		JMenuItem mntmEntradaESaida = new JMenuItem("Entrada e Sa\u00EDda Avulsa");
		mntmEntradaESaida.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnProdutos16_16.png")));
		mnEntradaDeMercadoria.add(mntmEntradaESaida);
		
		JMenuItem mntmInventario = new JMenuItem("Invent\u00E1rio");
		mntmInventario.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/msEstoque216_16.png")));
		mnEstoque.add(mntmInventario);
		
		JMenuItem mntmRelatoriosE = new JMenuItem("Relat\u00F3rios");
		mntmRelatoriosE.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnRelatorios16_16.png")));
		mnEstoque.add(mntmRelatoriosE);
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		Mcadastro.add(mnFinanceiro);
		
		JMenu mnContasAReceber = new JMenu("Contas a Receber");
		mnContasAReceber.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnMoeda.png")));
		mnFinanceiro.add(mnContasAReceber);
		
		JMenuItem mncartoes = new JMenuItem("Cart\u00F5es");
		mncartoes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mncartoes16_16.png")));
		mnContasAReceber.add(mncartoes);
		
		JMenuItem mnDinheiro = new JMenuItem("Dinheiro");
		mnDinheiro.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/1378091544_Grana.png")));
		mnContasAReceber.add(mnDinheiro);
		
		JMenuItem mnCheque = new JMenuItem("Cheque");
		mnCheque.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnCheque16_16.png")));
		mnContasAReceber.add(mnCheque);
		
		JMenu mnContasAPagar = new JMenu("Contas a Pagar");
		mnContasAPagar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnMoeda.png")));
		mnFinanceiro.add(mnContasAPagar);
		
		JMenuItem mntmPagamentos = new JMenuItem("Pagamentos");
		mntmPagamentos.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnPagament16_16.png")));
		mnContasAPagar.add(mntmPagamentos);
		
		JMenuItem mntmCentroDeCusto = new JMenuItem("Centro de Custo");
		mntmCentroDeCusto.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnMoney16_16.png")));
		mnContasAPagar.add(mntmCentroDeCusto);
		
		JMenuItem mntmGrupoFinanceiro = new JMenuItem("Grupo Financeiro");
		mntmGrupoFinanceiro.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnMoney16_16.png")));
		mnContasAPagar.add(mntmGrupoFinanceiro);
		
		JMenuItem mntmClassificacaoFinanceira = new JMenuItem("Classifica\u00E7\u00E3o Financeira");
		mntmClassificacaoFinanceira.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnMoney16_16.png")));
		mnContasAPagar.add(mntmClassificacaoFinanceira);
		
		JMenuItem mntmContaCorrente = new JMenuItem("Conta Corrente");
		mntmContaCorrente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnBanco16_16.png")));
		mnFinanceiro.add(mntmContaCorrente);
		
		JMenuItem mntmRelatoriosF = new JMenuItem("Relat\u00F3rios");
		mntmRelatoriosF.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnRelatorios16_16.png")));
		mnFinanceiro.add(mntmRelatoriosF);
		
		JMenu mnManutencao = new JMenu("Manuten\u00E7\u00E3o");
		Mcadastro.add(mnManutencao);
		
		JMenuItem mntmConfiguracoes = new JMenuItem("Configura\u00E7\u00F5es");
		mntmConfiguracoes.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnConfig.png")));
		mnManutencao.add(mntmConfiguracoes);
		
		JMenu mnSair = new JMenu("Sair");
		Mcadastro.add(mnSair);
		
		JMenuItem mntmSairDoSistema = new JMenuItem("Sair do sistema");
		mntmSairDoSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		mntmSairDoSistema.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagensAcao/mnSair16_16.png")));
		mnSair.add(mntmSairDoSistema);

	}
}