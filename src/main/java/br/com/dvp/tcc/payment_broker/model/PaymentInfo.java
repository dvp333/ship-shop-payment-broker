package br.com.dvp.tcc.payment_broker.model;

import java.io.Serializable;

public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nomeCompleto;
	private String numeroCartao;
	private String codigoSeguranca;
	private String dataVencimentoCartão;
	private String emailContaDestino;
	private double valorTotal;
	private int vezesParcelamento;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public String getDataVencimentoCartão() {
		return dataVencimentoCartão;
	}
	public void setDataVencimentoCartão(String dataVencimentoCartão) {
		this.dataVencimentoCartão = dataVencimentoCartão;
	}
	public String getEmailContaDestino() {
		return emailContaDestino;
	}
	public void setEmailContaDestino(String emailContaDestino) {
		this.emailContaDestino = emailContaDestino;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getVezesParcelamento() {
		return vezesParcelamento;
	}
	public void setVezesParcelamento(int vezesParcelamento) {
		this.vezesParcelamento = vezesParcelamento;
	}

}
