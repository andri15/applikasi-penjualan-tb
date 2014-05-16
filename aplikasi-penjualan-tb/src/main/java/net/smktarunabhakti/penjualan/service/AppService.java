package net.smktarunabhakti.penjualan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.smktarunabhakti.penjualan.domain.Barang;

public interface AppService {
	
	void simpanBarang(Barang b);
	
	void hapusBarang(Barang b);
	  
	Page<Barang> cariSemuaBarang
	(Pageable p);
	
	Barang cariBarangById(String id);
	
	Long counSemuaBarang();

}
