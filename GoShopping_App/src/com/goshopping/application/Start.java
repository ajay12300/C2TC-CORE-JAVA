package com.goshopping.application;

import com.goshopping.framework.NormalAcc;
import com.goshopping.framework.PrimeAcc;
import com.goshopping.framework.ShopFactory;

public class Start {
public static void main(String[] args) {
//	a. Assign instance of GSShopFactory to ShopFactory reference
		ShopFactory shopObj = new GSShopFactory();

//	b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc
		PrimeAcc primeAccObj = new GSPrimeAcc(1234, "prime_account_name", 4321f, true);


//	c. Instantiate GSNormalAcc and refer it through reference NormalAcc
		NormalAcc normalAccObj = new GSNormalAcc(5678, "normal_account_name", 1234f, NormalAcc.getDeliveryCharges());

//	d. Invoke bookProduct() method
		primeAccObj.bookProduct(1234f);
		normalAccObj.bookProduct(1234f);

//	e. Invoke toString() method
		primeAccObj.toString();
		normalAccObj.toString();
	}
}