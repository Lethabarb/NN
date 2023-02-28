import java.util.ArrayList;

public class Node {
    private ArrayList<Node> inputs;
    private float weight;
    private int output;

    public Node(float weight) {
        this.weight = weight;
    }
    public Node(float weight, int output, Node... inputs) {
        this.weight = weight;
        this.output = output;
        this.inputs = new ArrayList<>(inputs);
    }

}
