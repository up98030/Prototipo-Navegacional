package org.primefaces.showcase.view.input;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.SlideEndEvent;
 
@ManagedBean
public class SliderView {
    
    private int number1 = 100;
    private int entrega = 50;
    private int calidad = 50;
    private int insuficiente1 = 0;
    private int insuficiente2 = 19;
    private int regular1 = 20;
    private int regular2 = 39;
    private int bueno1 = 40;
    private int bueno2 = 69;
    private int excelente1 = 70;
    private int excelente2 = 100;    
    private int number2;   
    private int number3;   
    private int number4;   
    private int number5;   
    private int number6 = 30;  
    private int number7 = 80;     
    
    public int getEntrega() {
		return entrega;
	}

	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}

	public int getInsuficiente1() {
		return insuficiente1;
	}

	public void setInsuficiente1(int insuficiente1) {
		this.insuficiente1 = insuficiente1;
	}

	public int getInsuficiente2() {
		return insuficiente2;
	}

	public void setInsuficiente2(int insuficiente2) {
		this.insuficiente2 = insuficiente2;
	}

	public int getRegular1() {
		return regular1;
	}

	public void setRegular1(int regular1) {
		this.regular1 = regular1;
	}

	public int getRegular2() {
		return regular2;
	}

	public void setRegular2(int regular2) {
		this.regular2 = regular2;
	}

	public int getBueno1() {
		return bueno1;
	}

	public void setBueno1(int bueno1) {
		this.bueno1 = bueno1;
	}

	public int getBueno2() {
		return bueno2;
	}

	public void setBueno2(int bueno2) {
		this.bueno2 = bueno2;
	}

	public int getExcelente1() {
		return excelente1;
	}

	public void setExcelente1(int excelente1) {
		this.excelente1 = excelente1;
	}

	public int getExcelente2() {
		return excelente2;
	}

	public void setExcelente2(int excelente2) {
		this.excelente2 = excelente2;
	}

	public int getNumber1() {
        return number1;
    }
 
    public void setNumber1(int number1) {
    	this.number1 = number1;
    }
 
    public int getNumber2() {
        return number2;
    }
 
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
 
    public int getNumber3() {
        return number3;
    }
 
    public void setNumber3(int number3) {
        this.number3 = number3;
    }
 
    public int getNumber4() {
        return number4;
    }
 
    public void setNumber4(int number4) {
        this.number4 = number4;
    }
 
    public int getNumber5() {
        return number5;
    }
 
    public void setNumber5(int number5) {
        this.number5 = number5;
    }
 
    public int getNumber6() {
        return number6;
    }
 
    public void setNumber6(int number6) {
        this.number6 = number6;
    }
 
    public int getNumber7() {
        return number7;
    }
 
    public void setNumber7(int number7) {
        this.number7 = number7;
    }
     
    public void onSlideEnd(SlideEndEvent event) {
        FacesMessage message = new FacesMessage("Slide Ended", "Value: " + event.getValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
    } 
}