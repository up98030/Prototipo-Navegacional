package org.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.showcase.domain.Car;
import org.primefaces.showcase.service.CarService;

@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
	
	private final static String[] colors;

	private final static String[] manufacturers;
	static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";

		manufacturers = new String[10];
		manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
		}
    
   private List<Car> cars;
    
   @ManagedProperty("#{carService}")
   private CarService service;

   @PostConstruct
   public void init() {
       cars = service.createCars(10);
   }
    
   public List<Car> getCars() {
       return cars;
   }

   public void setService(CarService service) {
       this.service = service;
   }
}