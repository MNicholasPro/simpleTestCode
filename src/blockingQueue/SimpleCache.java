/*
package blockingQueue;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/23.
 *//*

public class SimpleCache {
    private final Map cache = new HashMap();
    public Object load(String objectName) {
// load the object somehow
        return null;
    }
    public void clearCache() {
        synchronized (cache) {
            cache.clear();
        }
    }
    public Object getObject(String objectName) {
        synchronized (cache) {
            Object o = cache.get(objectName);

            if (o == null) {
                o = load(objectName);
                cache.put(objectName, o);
            }
        }
        return o;
    }
}*/
