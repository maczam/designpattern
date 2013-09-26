责任链模式定义：
-----------------------------------
阎宏的定义："发出这个请求的客户端并不知道链上的那一个对象最终处理这个请求,这使得系统可以在不影响客户端的情况下动态地重新组织链和分配责任."

阎宏的定义很精炼，但是太精炼的以至于很多人很难理解。
定义分解如下：
-----------------------------------
### 服务端有一组策略（也可以称之为方法，算法等等）按顺序处理请求。这组策略的组织顺序与客户端无关。

	Handler projectHandler = new ProjectHandler();
    Handler deptHandler = new DeptHandler();
    Handler bossHandler = new BossHandler();

    projectHandler.setNext(deptHandler);
    deptHandler.setNext(bossHandler);
    
### 当这组策略中的某一个策略满足结束条件时，整个责任链结束。

    public void handleRequest(DinnerRequest request) {
        if (request.getCost() >= 300 && request.getCost() < 500) {
            System.out.println("部门经理批准了 聚餐请求 ！");
            request.execute();
        } else {
            next.handleRequest(request);
        }
    }

### 解释：责任链模式可以被认为是"策略对象顺序执行"。在一个顺序策略链表中的策略按顺序被调用。当某种策略满足要求，就返回成功标志或者责任链结束。

### 责任链核心：
* 承担责任
* 将请求推到下一人

与Command模式区别：
-----------------------------------
Command 模式需要事先协商客户端和服务器端的调用关系，比如 1 代表 start 2 代表 move 等，这些 都是封装在 request 中，到达服务器端再分解。