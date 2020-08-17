package hibernate.example;

import java.util.ArrayList;
import java.util.List;

import hibernate.example.DAO.MenuDAO;
import hibernate.example.entity.Menu;
import hibernate.example.entity.Plato;

public class MenuApplication {

	public static void main(String[] args) {
		MenuDAO menuDAO = new MenuDAO();
	
		
		List<Plato> platos = new ArrayList<Plato>();
		Menu menu = new Menu();
		
		Plato plato1 = new Plato();
		plato1.setNombre("MILANGA CLASICA");
		plato1.setPrice(500.00);
		plato1.setDescripcion("RICAAA");
		
		Plato plato2 = new Plato();
		plato2.setNombre("POLLO AL HORNO");
		plato2.setPrice(600.00);
		plato2.setDescripcion("RICAZOOO");
		
		platos.add(plato1);
		platos.add(plato2);
		
		plato1.setMenu(menu);
		plato2.setMenu(menu);
		
		menu.setPlatos(platos);
		
		menuDAO.createMenu(menu);
		
		for(Menu menuElement : menuDAO.getMenus()) {
			System.out.println(menuElement);
		}
		
	}

}
