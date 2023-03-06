package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.DetalleFacturaDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

	@Autowired
	private DetalleFacturaDAO detalleFacturaDAO;
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private ProductoDAO productoDAO;
	@Override
	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return detalleFacturaDAO.findAll();
	}

	@Override
	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
		return detalleFacturaDAO.findOne(id);
	}
	
	
	@Override
	public void add(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		detalleFacturaDAO.add(detalleFactura);
	}

	@Override
	public void up(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		detalleFacturaDAO.up(detalleFactura);
	}
	
	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		detalleFacturaDAO.del(id);
	}
	
	@Override
	public void add(int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		Factura factura = facturaDAO.findOne(id_factura);
		Producto producto = productoDAO.findOne(id_producto);
		
		DetalleFactura detalleFactura = new DetalleFactura(cantidad, subtotal); 
		detalleFactura.setFactura(factura);
		detalleFactura.setProducto(producto);
		
		detalleFacturaDAO.add(detalleFactura);
	}

	@Override
	public void up(int idDetalleFactura, int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		Factura factura = facturaDAO.findOne(id_factura);
		Producto producto = productoDAO.findOne(id_producto);
		 
		DetalleFactura detalleFactura = new DetalleFactura(idDetalleFactura, cantidad, subtotal); 
		detalleFactura.setFactura(factura);
		detalleFactura.setProducto(producto);
		
		detalleFacturaDAO.add(detalleFactura);
	
	}
	

}
