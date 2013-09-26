package info.hexin.designpattern.behavioral.chainofresponsibility;

/**
 * 项目经理 只能批准 300一下的
 * 
 * @author hexin
 * 
 */
public class ProjectHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(DinnerRequest request) {
        if (request.getCost() < 300) {
            System.out.println("项目经理批准了 聚餐请求 ！");
            request.execute();
        } else {
            next.handleRequest(request);
        }
    }
}
