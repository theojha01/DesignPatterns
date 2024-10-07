public class MargheritaPizza extends BasePizza{
    BasePizza basePizza;

    public MargheritaPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return 15;
    }
}
