package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Producto;
import com.example.demo.service.IProductoService;




@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	//GET
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo){
		List<Producto> lista = this.productoService.buscarTodos();
		modelo.addAttribute("productos",lista);
		return "vistaListaProductos";
	}
	
	@PostMapping("/insertar")
	public String insertarProducto(Producto producto) {
		this.productoService.ingresarProducto(producto);
		return "redirect:/productos/buscar";
	}
	
}
