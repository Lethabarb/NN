public class Branch {
    private double weight;
    private Node head;
    private Node tail;
    public Branch(Double weight, Node head, Node tail) {
        this.weight = weight;
        this.head = head;
        this.tail = tail;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public Node getTail() {
        return tail;
    }
    public void setTail(Node tail) {
        this.tail = tail;
    }
}
