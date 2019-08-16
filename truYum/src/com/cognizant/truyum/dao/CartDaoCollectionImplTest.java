package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddCartItem();
		testGetAllCartItems();
		testRemoveCartItem();
	}

	public static void testAddCartItem() {
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem(1, 1);
		// cartDao.getAllCartItems(1);
		
		try {
			ArrayList<MenuItem> cartList = cartDao.getAllCartItems(1);
			System.out.println("Item added to the cart successfully");
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			for (MenuItem item : cartList) {
				System.out.println(item);
			}
			// System.out.println(cartList);
			// cartList.add(
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testGetAllCartItems() {
		try {
			CartDao cartDao = new CartDaoCollectionImpl();
			ArrayList<MenuItem> cartList = cartDao.getAllCartItems(1);
			System.out.println(String.format("%-25s%-25s%-25s%-25s%-25s%-20s\n","Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			for (MenuItem item : cartList) {
				System.out.println(item);
			}
			// System.out.println(cartList);
			// cartList.add(
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testRemoveCartItem() {

		CartDao cartDao = new CartDaoCollectionImpl();

		cartDao.removeCartItem(1, 1);
		System.out.println("Item has been removed successfully");
		try {
			ArrayList<MenuItem> cartList = cartDao.getAllCartItems(1);
			if (cartList.isEmpty()) {
				
				throw new CartEmptyException();
			} else {
				for (MenuItem item : cartList) {
					System.out.println(item);
				}
			}

		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
