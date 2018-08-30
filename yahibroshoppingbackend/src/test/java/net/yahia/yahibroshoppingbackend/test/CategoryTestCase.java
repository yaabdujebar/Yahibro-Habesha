package net.yahia.yahibroshoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.yahia.yahibroshoppingbackend.dao.CategoryDAO;
import net.yahia.yahibroshoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.yahia.yahibroshoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void testCRUDCategory() {
		// add operation
		category = new Category();
		category.setName("car");
		category.setDescription("This is the description of the car !");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category inside the table !", true ,categoryDAO.add(category));

		category = new Category();
		category.setName("tv");
		category.setDescription("This is the description of the tv !");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Successfully added a category inside the table !", true ,categoryDAO.add(category));
		
		// fetching and renaming category
		category = categoryDAO.get(1);
		category.setName("Mekina");
		assertEquals("Successfully updated a sinlgle category in the table!",true ,categoryDAO.update(category));

		// delete the category
	
		assertEquals("Successfully delete a sinlgle category in the table!",true ,categoryDAO.delete(category));
       // fecthing the list
		assertEquals("Successfully feched a list of categories from the table!",1 ,categoryDAO.list().size());
	}
//	@Test
//	public void testAddCategory() {
//		category = new Category();
//		category.setName("car");
//		category.setDescription("This is the description of the toshoba !");
//		category.setImageURL("CAT_1.png");
//		
//		assertEquals("Successfully added a category inside the table !", true ,categoryDAO.add(category));
//	}
	
//	@Test
//	public void testGetCategory() {
//		category = categoryDAO.get(3);
//		System.out.println(category.getName());
//		assertEquals("Successfully fetched a sinlgle category from the table!", "car" ,category.getName());
//	}
	
//	@Test
//	public void testUpdateCategory() {
//		category = categoryDAO.get(1);
//		category.setName("Mekina");
//		assertEquals("Successfully updated a sinlgle category in the table!",true ,categoryDAO.update(category));
//	}
	
//	@Test
//	public void testDeleteCategory() {
//		category = categoryDAO.get(1);
//		assertEquals("Successfully delete a sinlgle category in the table!",true ,categoryDAO.delete(category));
//	}
//	
//	@Test
//	public void testListCategory() {
//		
//		assertEquals("Successfully feched a list of categories from the table!",3 ,categoryDAO.list().size());
//	}
}
