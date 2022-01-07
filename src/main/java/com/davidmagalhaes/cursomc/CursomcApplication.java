package com.davidmagalhaes.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.davidmagalhaes.cursomc.domain.Categoria;
import com.davidmagalhaes.cursomc.domain.Cidade;
import com.davidmagalhaes.cursomc.domain.Cliente;
import com.davidmagalhaes.cursomc.domain.Endereco;
import com.davidmagalhaes.cursomc.domain.Estado;
import com.davidmagalhaes.cursomc.domain.ItemPedido;
import com.davidmagalhaes.cursomc.domain.Pagamento;
import com.davidmagalhaes.cursomc.domain.PagamentoComBoleto;
import com.davidmagalhaes.cursomc.domain.PagamentoComCartao;
import com.davidmagalhaes.cursomc.domain.Pedido;
import com.davidmagalhaes.cursomc.domain.Produto;
import com.davidmagalhaes.cursomc.domain.enums.EstadoPagamento;
import com.davidmagalhaes.cursomc.domain.enums.TipoCliente;
import com.davidmagalhaes.cursomc.repositories.CategoriaRepository;
import com.davidmagalhaes.cursomc.repositories.CidadeRepository;
import com.davidmagalhaes.cursomc.repositories.ClienteRepository;
import com.davidmagalhaes.cursomc.repositories.EnderecoRepository;
import com.davidmagalhaes.cursomc.repositories.EstadoRepository;
import com.davidmagalhaes.cursomc.repositories.ItemPedidoRepository;
import com.davidmagalhaes.cursomc.repositories.PagamentoRepository;
import com.davidmagalhaes.cursomc.repositories.PedidoRepository;
import com.davidmagalhaes.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		
		
	}

}
