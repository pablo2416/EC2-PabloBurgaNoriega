package ec2.pablo.burga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ec2.pablo.burga.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
