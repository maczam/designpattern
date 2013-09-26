package info.hexin.designpattern.behavioral.chainofresponsibility;

/**
 * 聚餐请求
 * 
 * @author hexin
 * 
 */
public class DinnerRequest {

    private int cost;

    public DinnerRequest(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void execute() {
        System.out.println(" 聚餐 花费 " + cost + " 元，申请成功");
    }
}
