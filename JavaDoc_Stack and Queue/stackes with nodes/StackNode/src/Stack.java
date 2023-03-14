public class Stack<T> {
    public Node<T> first;

    public Stack() {
    }

    Node<T> top() {
        if (isEmpty()) {
            return null;
        }
        return first;
    }

    // next ist immer der unter dir
    /**
     * @param n Dies ist der Knoten (Node) dieser Stack
     * @return gibt das hinzugefügte Objekt an
     *         //@ throws Exception.... (Muss nicht zwangsläufig verwendet werden)
     */

    // um das ergebnis zu sehen, mach Maus - Cursor auf push

    public void push(Node<T> n) {

        if (isEmpty()) {
            first = n;
            return;
        }

        if (!isEmpty()) {
            n.setNext(first);
        }

        first = n;
    }

    public Node<T> pop() {
        while (first != null) {
            first = first.getNext();
        }
        if (first == null) {
            return null;
        }
        return first;
    }

    public String toString() {
        String text = "";
        Node<T> sn = first;

        while (sn.getNext() != null) {
            text += sn.toString() + ", ";
            sn = sn.getNext();
        }
        if (isEmpty()) {
            return "leer";
        }

        return text;
    }

    private boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }
}