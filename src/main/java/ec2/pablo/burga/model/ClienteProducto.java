package ec2.pablo.burga.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente_producto")
public class ClienteProducto {
	
	@Id
	private ClienteProducto fk = new ClienteProducto();
}

@Embeddable
class ClienteProductoFk implements Serializable{
	
	private static final long serialVersionUID = 668727937556427463L;
	
	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idCliente;
	
	@Column(name = "id_producto", nullable = false, unique = true)
	private Integer idProducto;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}	
}
