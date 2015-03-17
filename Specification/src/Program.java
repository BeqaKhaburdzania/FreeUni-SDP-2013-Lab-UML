import java.util.ArrayList;


public class Program {

	public static void main(String[] args) {
		
		Mobile samsung = new Mobile("samsung", "Smart", 500);
		Mobile htc = new Mobile("htc", "Smart", 420);
		Mobile apple = new Mobile("apple", "Smart", 942);
		Mobile samsung2 = new Mobile("samsung", "Basic", 70);
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		mobiles.add(samsung);
		mobiles.add(htc);
		mobiles.add(apple);
		mobiles.add(samsung2);
		ISpecification<Mobile> CostSpec = new PremiumSpecification<Mobile>(480);
		ISpecification<Mobile> BrSpec = new BrandSpecification<Mobile>("samsung");
		ISpecification<Mobile> TpSpec = new TypeSpecification<Mobile>("Smart");
		
		for(int i = 0; i<mobiles.size(); i++){
			if(!CostSpec.IsSatisfiedBy(mobiles.get(i))){
				mobiles.remove(i);
				i--;
			}
			
		}
		for(int i = 0; i<mobiles.size(); i++){
			if((TpSpec.And(BrSpec)).IsSatisfiedBy(mobiles.get(i))){
				mobiles.remove(i);
				i--;
			}
		}
		
	}

}
