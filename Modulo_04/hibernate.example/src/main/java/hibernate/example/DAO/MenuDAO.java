package hibernate.example.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.example.MenuConfig;
import hibernate.example.entity.Menu;
import hibernate.example.entity.Plato;

public class MenuDAO {
	
	public void createMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
			session.save(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}
	
	public void createPlato(Plato plato) {

		Transaction transaction = null;

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();
			
			session.save(plato);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}

	public List<Menu> getMenus() {

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Menu", Menu.class).list();

		}

	}
	
	public List<Plato> getPlatos() {

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Plato", Plato.class).list();

		}

	}

	public List<Menu> getMenus(Long id) {

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Menu s where s.id = id"

					, Menu.class).setParameter("id", id).list();

		}

	}
	
	
	public void updateMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}

	public void removeMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = MenuConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.delete(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null)

				transaction.rollback();

			e.printStackTrace();

		}

	}
}
