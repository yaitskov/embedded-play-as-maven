import static play.mvc.Results.ok;
import static play.routing.RoutingDsl.fromComponents;
import static play.server.Server.forRouter;

import org.junit.Test;
import play.server.Server;

public class DemoPlayTest {
    @Test
    public void run() throws InterruptedException {
        Server server = forRouter(
                9001,
                (components) ->
                        fromComponents(components)
                                .GET("/hello/:to")
                                .routeTo(to -> ok("Cześć [" + to + "]"))
                                .POST("/echo")
                                .routeTo(() -> ok("Gut"))
                                .build());
        Thread.sleep(1111111);
    }

}
