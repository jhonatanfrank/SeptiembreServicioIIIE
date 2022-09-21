package com.idat.SetiembreIIE.repository;

import java.util.List;

import com.idat.SetiembreIIE.model.Producto;

public interface ProductoRepository {

	void guardar(Producto producto);

	void actualizar(Producto producto);

	void eliminar(Integer id);

	List<Producto> listar();

	Producto obtener(Integer id);

}
