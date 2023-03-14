public class Node<T> {

    Node<T> nextNode;
    Node<T> prevNode;
    T contentObj;

    public Node(T content) {
        contentObj = content;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> n) {
        n = nextNode;
    }

    public Node<T> getPrev() {
        return prevNode;
    }

    public void setPrev(Node<T> p) {
        p = prevNode;
    }

    public T getContent() {
        return contentObj;
    }

    public void setNext(T cnt) {
        cnt = contentObj;
    }
}
