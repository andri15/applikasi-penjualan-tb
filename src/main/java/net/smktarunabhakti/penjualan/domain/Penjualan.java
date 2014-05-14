package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javassist.expr.NewArray;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.mapping.Value;

@Entity
@Table(name="trx_jual_header")
public class Penjualan implements Serializable{
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid" , strategy = "uuid2")
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTgl() {
		return tgl;
	}

	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}

	public String getKasir() {
		return kasir;
	}

	public void setKasir(String kasir) {
		this.kasir = kasir;
	}

	public String getNoStruk() {
		return noStruk;
	}

	public void setNoStruk(String noStruk) {
		this.noStruk = noStruk;
	}

	@Column(name="waktu_transaksi")
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date tgl;
	
	@Column(nullable = false)
	private String kasir;
	
	@Column(name="no_struk", nullable = false)
	private String noStruk;
	
	@OneToMany
	@Cascade(value=org.hibernate.annotations.CascadeType.ALL)
	private List<PenjualanDetail> listPenjualanDetail = new ArrayList<PenjualanDetail>();
}
