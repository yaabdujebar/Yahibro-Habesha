package net.yahia.yahibroshoppingbackend.dao;

import java.util.List;

import net.yahia.yahibroshoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
	
}
