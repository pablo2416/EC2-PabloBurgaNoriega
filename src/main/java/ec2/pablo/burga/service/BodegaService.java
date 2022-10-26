package ec2.pablo.burga.service;

import java.util.List;
import ec2.pablo.burga.model.Bodega;

public interface BodegaService {
	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
