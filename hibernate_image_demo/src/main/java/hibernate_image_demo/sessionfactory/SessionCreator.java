package hibernate_image_demo.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_image_demo.model.Album;
import hibernate_image_demo.model.Photo;



public class SessionCreator {
private static SessionFactory factory = null;
static {
	factory = new Configuration().configure().addAnnotatedClass(Album.class).addAnnotatedClass(Photo.class).buildSessionFactory();
}
private SessionCreator() {}
public static Session getSession()
{
	return factory.openSession();
	}
}