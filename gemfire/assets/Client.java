import java.util.Map;

import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;

public class Client {
  public static void main(final String[] args) throws Exception {
    ClientCache clientCache = new ClientCacheFactory()
        .addPoolLocator("localhost", 10334)
        .create();
    Map<String, String> region = clientCache.getRegion("demo");

    region.put("key", "value");
    String value = region.get("key");

    System.out.println("Value is: " + value);
  }
}
