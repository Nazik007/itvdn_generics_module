package GO_IT_HM_8;

public class NodeForMap {
    Object key;
    Object value;
    NodeForMap next;

    public NodeForMap (Object key, Object value, NodeForMap next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
