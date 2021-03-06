package Entity;

import java.util.concurrent.CountDownLatch;

/**
 * Created by LiPeng on 17/12/22.
 */
public class NetworkHealthChecker extends BaseHealthChecker {
    public NetworkHealthChecker(String serviceName, CountDownLatch latch) {
        super(serviceName, latch);
    }

    @Override
    public boolean verifyService() {
        System.out.println("Checking  "+this.getServiceName());
        try {
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.getServiceName()+" is UP");
        return true;
    }
}
