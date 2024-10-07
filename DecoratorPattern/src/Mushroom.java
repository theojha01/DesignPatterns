public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    int cost(){
        return basePizza.cost()+10;
    }
}
