package GO_IT_HM_8;

public class MyQueueClass implements MyQueue {
    Node firstNode;
    Node lastNode;
    int size;
    int maxSize;

    public void myQueueClass (int mazSize) {
        this.maxSize = mazSize;
    }

    @Override
    public void add(Object value) {
        if (size == maxSize) {
            System.out.println("Черга вже повністю забита елементами! Не можливо додати новий! ");
        }
        if (size == 0) {
            firstNode = new Node(value, null);
            lastNode = firstNode;
        }
        else {
            Node previous = lastNode;
            lastNode = new Node(value, null);
            previous.next = lastNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.next;
        }
        else {
            Node previousNode = firstNode;
            Node followingNode = firstNode.next;
            for (int i = 0; i < index; i++) {
                previousNode = followingNode;
                followingNode = firstNode.next;
            }
            previousNode.next = followingNode.next;
        }
        size--;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return firstNode.actual;
    }

    @Override
    public Object poll() {
        Node element = firstNode;
        firstNode = firstNode.next;
        size--;
        return element.actual;
    }
}
