package dao;

import java.util.List;

public interface IDAO <T> {

	public void create(T object);
	public void delete(T object);
	public void update(T object);
	public List<T> read();
	
}
