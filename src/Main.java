import java.time.LocalDate;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdaptor());

		Customer customer = new Customer(1,"Taha","Durdu",LocalDate.of(2000, 10, 12),"99999999");
	
		baseCustomerManager.save(customer);
	
	}

}
