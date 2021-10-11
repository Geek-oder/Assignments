class Car{  
	
	String company;
	int model;
	int engineVersion;
	String carType;
	
	Car(String company, int model){  
	 
	 this.company=company;  
	 this.model=model;  
 
	}  
	Car(String company, String carType){  
	 
	 this.company=company;   
	 this.carType=carType; 
	 }  
	Car(int engineVersion, String carType){  
	   
	 this.engineVersion=engineVersion;  
	 this.carType=carType; 
	 }  
   
	public String toString(){
	 
		return "Car2:Car [ Company= "+company+", Model= "+model+", EngineVersion= "+engineVersion+", CarType= "+carType+"]";  
 	} 
 
 	public static void main(String args[]){  
 		Car c1=new Car("Maruti",2010);  
 		Car c2=new Car("Maruti","FAM");
 		Car c3=new Car(2,"FAM");
 		
 		System.out.println(c1);  
 		System.out.println(c2);
 		System.out.println(c3);
 }  
}  