package hibernate_image_demo.dao;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate_image_demo.model.Album;
import hibernate_image_demo.model.Photo;
import hibernate_image_demo.sessionfactory.SessionCreator;

public class AlbumDaoImpl implements AlbumDao{
	Session session = null;
	{
		session = SessionCreator.getSession();
		
	}
	
	@Override
	public Album createAlbum(Album adao) {
		session.getTransaction().begin();
		session.save(adao);
		session.getTransaction().commit();
		
		return adao;
		
	}

	@Override
	public List<Album> getAlbums() {
		Query q = session.createQuery("from Album");
		return q.list();
	}

	@Override
	public Album findById(int id) {
		Album album = session.get(Album.class, id);
		return album;
	}

	@Override
	public void deleteById(int id) {
		
		Photo photo = session.get(Photo.class, id);
		
		if(photo!=null)
		{
			session.getTransaction().begin();
			session.delete(photo);
			session.getTransaction().commit();
			
		}
		
		
	}
	@Override
	public void UpdateById(int id)
	{
	Photo photo = session.get(Photo.class, id);
	if(photo!= null)
	{
		session.getTransaction().begin();
		session.update(photo);
		session.getTransaction().commit();
	}
	}

	@Override
	public void systemExit()
	{
		session.close();
		System.exit(0);
	}

}