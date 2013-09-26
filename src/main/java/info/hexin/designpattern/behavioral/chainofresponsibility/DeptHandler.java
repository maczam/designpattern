package info.hexin.designpattern.behavioral.chainofresponsibility;

/**
 * 部门经理可以批准300-500
 * 
 * @author hexin
 * 
 */
public class DeptHandler implements Handler {
    private Handler next;

    public DeptHandler() {
    }

    // 下一个
    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 如果请求自己能处理，那么就处理掉，不能处理就交给后面的处理者
     */
    @Override
    public void handleRequest(DinnerRequest request) {
        if (request.getCost() >= 300 && request.getCost() < 500) {
            System.out.println("部门经理批准了 聚餐请求 ！");
            request.execute();
        } else {
            next.handleRequest(request);
        }
    }
}
