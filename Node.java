import java.util.ArrayList;
import java.util.Collections;

public class Node {
    private String name;
    private ArrayList<Branch> inputs;
    private ArrayList<Branch> outputs;
    private int value;

    public Node(int output, Branch... inputs) {
        this.value = output;
        this.inputs = new ArrayList<>();
        for (Branch B : inputs) {   
            this.inputs.add(B);
        }
    }

    public void addInputBranch(Branch b) {
        inputs.add(b);
    }
    public void addOutputBranch(Branch b) {
        outputs.add(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<Branch> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<Branch> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<Branch> outputs) {
        this.outputs = outputs;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
