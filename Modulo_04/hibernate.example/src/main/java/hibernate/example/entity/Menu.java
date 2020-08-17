package hibernate.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="menu")
public class Menu {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy="menu",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Plato> platos = new ArrayList<Plato>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", platos=" + platos + "]";
	}

	
}
