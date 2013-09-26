package info.hexin.designpattern.behavioral.chainofresponsibility;

/**
 * 公司 大老板 专门批准大雨500的，已经没有上级了
 * 
 * @author hexin
 * 
 */
public class BossHandler implements Handler {

    @Override
    public void setNext(Handler next) {

    }

    @Override
    public void handleRequest(DinnerRequest request) {
        System.out.println("还需要老板来批准");
        request.execute();
    }
}
