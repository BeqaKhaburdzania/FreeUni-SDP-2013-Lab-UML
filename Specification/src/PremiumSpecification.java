public class PremiumSpecification<T> extends CompositeSpecification<T>
{
    private int cost;
    public PremiumSpecification(int cost) {
        this.cost = cost;
    }
    
 @Override
    public boolean IsSatisfiedBy(T o) {
        return ((Mobile) o).getCost() >= this.cost;
    }
}