package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto producto);
	
	public Producto buscarPorCodigoBarras(String coidgo);
	public List<Producto> buscarTodos();
}
