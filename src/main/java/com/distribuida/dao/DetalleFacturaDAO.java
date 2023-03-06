package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaDAO {
	public List<DetalleFactura> findAll();
	public DetalleFactura findOne(int id);
	public void add(DetalleFactura detalleFactura);
	public void up(DetalleFactura detalleFactura);
	public void del(int id);

}
