package GO_IT_HM_8;

public class MyStack {
    Object[] stack;
    int position;

    MyStack() {
        position = -1;
    }

    void push(Object value) {
        if (position == 9) {
            System.out.println("Stack is full");
        } else {
            stack[++position] = value;
        }
    }

    void remove(int index) {
        Object[] newArray = new Object[stack.length - 1];
        int k = 0;
        for (int i = 0; i < stack.length; i++) {
            if (i != index) newArray[k++] = stack[i];
        }
        stack = newArray;
    }

    void clear() {
        stack = new Object[10];
        position = -1;
    }

    int size() {
        return stack.length;
    }

    Object peek() {
        if (position < 0) {
            System.out.println("Stack is not uploaded");
            return null;
        } else
            return stack[position];
    }

    Object pop() {
        if (position < 0) {
            System.out.println("Stack is not uploaded");
            return null;
        }else
            return stack[position--];
    }

}
