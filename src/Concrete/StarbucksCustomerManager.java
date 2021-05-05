package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			this.save(customer);
			System.out.println("Kay�t Ba�ar�l�");
		}else {
			System.out.println("Kay�t ba�ar�s�z");
		}
		 
	}
	

}
