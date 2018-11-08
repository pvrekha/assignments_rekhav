package day19;

public class Methods {
	
	 public void Pizza() {
			 System.out.println("Pizza brings happiness ");
			 Happiness();
			 Health();
				 }
		public void Happiness() {
			
			System.out.println("Happiness makes you healthy");
			
		}
		
		public void Health() {
			
			System.out.println("Eat more Pizza to stay healthy");
		}
		
		
		public static void main(String[] args) {
			
			Methods m= new Methods();
			m.Pizza();
				}

	}


