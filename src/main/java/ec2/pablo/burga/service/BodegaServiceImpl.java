package ec2.pablo.burga.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec2.pablo.burga.model.Bodega;
import ec2.pablo.burga.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

	@Autowired
	private BodegaRepository rerpositorio;
	
	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		rerpositorio.save(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		rerpositorio.saveAndFlush(bodega);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		rerpositorio.deleteById(id);
	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return rerpositorio.findAll();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return rerpositorio.findById(id).orElse(null);
	}

}
