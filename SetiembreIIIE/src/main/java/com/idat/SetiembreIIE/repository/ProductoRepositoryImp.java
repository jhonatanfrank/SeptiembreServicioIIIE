package com.idat.SetiembreIIE.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.SetiembreIIE.model.Producto;

@Repository
public class ProductoRepositoryImp implements ProductoRepository {

	List<Producto> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		almacenamiento.add(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		Producto existeActualizar = obtener(producto.getIdProducto());
		eliminar(producto.getIdProducto());
		almacenamiento.add(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		/*
		 * for (Producto producto : almacenamiento) { if (producto.getIdProducto() ==
		 * id) { return producto; } } return null;
		 */
		return almacenamiento.stream().filter(p -> p.getIdProducto() == id).findFirst().orElse(null);
	}

}
