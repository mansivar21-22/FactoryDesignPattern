import java.io.*;

abstract class Plan{
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
		class DomesticPlan extends Plan{
			//@override
			public void getRate() {
				rate=3.50;
			
	}
}
		class InstitutionalPlan extends Plan{
			//@override
			public void getRate() {
				rate=8.50;
			
	}
}
		
class CommercialPlan extends Plan{
			//@override
			public void getRate() {
				rate=6.50;
			
	}
}
		class GetPlanFactory{
			
			public Plan getPlan(String planType) {
				if(planType==null) {
					return null;
				}
				if(planType.equalsIgnoreCase("DomesticPlan")) {
					return new DomesticPlan();
				}
			
		
		else if(planType.equalsIgnoreCase("CommercialPlan")){
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("InstitutionalPlan")){
			return new InstitutionalPlan();
		}
		return null;
		}}
		
	public	class FactoryExample {
			public static void main(String[] args )throws IOException{
				GetPlanFactory planFactory= new GetPlanFactory();
				
				System.out.print("Enter the name of plan for which the bill will be generated:");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				String planName=br.readLine();
				System.out.println("Ënter no. of units");
				int units=Integer.parseInt(br.readLine());
				
				Plan p = planFactory.getPlan(planName);
			
				
				System.out.print("Bill amounbt for"+planName+"of" +units+ "units is:");
				p.getRate();
				p.calculateBill(units);
			}
		}
		
