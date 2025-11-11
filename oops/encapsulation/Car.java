package oops.encapsulation;

public class Car 
{

	private String brand;
	private String model;
	private String colour;
	private float speed;
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
   public String getModel()
   {
	   return model;
   }
   
   public void setModel(String model)
   {
	   this.model=model;
   }
   
   public String getColour()
   {
	   return colour;
   }
   public void setColour(String col)
   {
	   colour=col;
   }
   
   public float getSpeed()
   {
	   return speed;
   }
   
   public void setSpeed(float speed)
   {
	   this.speed=speed;
   }
	
}



/*
 * Setter methods (like setBrand) are used only to set/update values, not to return anything.
    That’s why we use void — it means “no return value.”
    
    
    void = just update the variable
    return type = only used when you need to send some data back
 * */
