package info.hexin.designpattern.behavioral.chainofresponsibility;

/**
 * 审批
 * 
 * @author hexin
 * 
 */
public interface Handler {

    /**
     * 下一个审批者
     * 
     * @param next
     */
    public void setNext(Handler next);

    /**
     * 责任链模式的核心  ：
     *   1. 承担责任
     *   2. 把请求推到下一个人去
     * 
     * @param request
     */
    public void handleRequest(DinnerRequest request);
}
