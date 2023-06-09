package daointerface;

import java.util.List;

import model.Item;

public interface ItemDAO {
	List<Item> getAllItems();

	void addItem(Item i);

	void removeItemById(int id);
}
