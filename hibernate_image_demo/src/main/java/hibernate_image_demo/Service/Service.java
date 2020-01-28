package hibernate_image_demo.Service;
import java.time.LocalDate;
import java.util.List;

import hibernate_image_demo.model.Album;

public interface Service {
	public Album createAlbum(Album adao);
	public List<Album> getAlbums();
	public Album findById(int id);
	public void deleteById(int id);
	public void updateById(int id);
	public void systemExit();
}