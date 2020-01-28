package hibernate_image_demo.Service;
import java.time.LocalDate;
import java.util.List;

import hibernate_image_demo.dao.AlbumDao;
import hibernate_image_demo.dao.AlbumDaoImpl;
import hibernate_image_demo.model.Album;

public class ServiceImpl implements Service {
	private AlbumDao dao = null;
	{
		dao = new AlbumDaoImpl();
	}
	
	@Override
	public Album createAlbum(Album adao) {
		
		return dao.createAlbum(adao);
	}

	@Override
	public List<Album> getAlbums() {
		
		return dao.getAlbums();
	}

	@Override
	public Album findById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void systemExit() {
		dao.systemExit();
		
	}

	@Override
	public void updateById(int id) {
		// TODO Auto-generated method stub
		
	}

}