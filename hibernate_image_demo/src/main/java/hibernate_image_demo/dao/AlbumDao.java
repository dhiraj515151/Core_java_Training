package hibernate_image_demo.dao;
import java.time.LocalDate;
import java.util.List;

import hibernate_image_demo.model.Album;

public interface AlbumDao {
public Album createAlbum(Album adao);
public List<Album> getAlbums();
public Album findById(int id);
public void deleteById(int id);
public void systemExit();
}