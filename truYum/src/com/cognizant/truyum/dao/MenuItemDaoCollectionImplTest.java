package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
	}

	public static void testGetMenuItemListAdmin() {
		MenuItemDao menuItemDao;
		try {
			menuItemDao = new MenuItemDaoCollectionImpl();
			ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
			menuItems = menuItemDao.getMenuItemListAdmin();
			System.out.println("Menu item list for admin"); 
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			for (MenuItem items : menuItems) {
				System.out.println(items);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDao menuItemDao;
		try {
			menuItemDao = new MenuItemDaoCollectionImpl();
			ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
			menuItems = menuItemDao.getMenuItemListCustomer();
			System.out.println("Menu item list for customer"); 
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			for (MenuItem items : menuItems) {
				System.out.println(items);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testModifyMenuItem() {
		try {
			MenuItem menuItem = new MenuItem((long) 05, "Chocolate Brownie", (float) 150.0, true, DateUtil.convertToDate("02/11/2022"), "Dessert", true);
			MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
			if(menuItemDao.getMenuItem(menuItem.getId()) == menuItem);
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery")); 
			System.out.println(menuItem);
			System.out.println("Modification Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testGetMenuItem() {

	}
}
