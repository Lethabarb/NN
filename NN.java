import java.util.ArrayList;
import java.util.Random;

public class NN {
    private ArrayList<Node> inputs;
    private ArrayList<Node> outputs;
    private ArrayList<Node[]> hiddenLayers;

    public NN(ArrayList<Node> inputs, ArrayList<Node> outputs, int hiddenLayerCount) {
        this.inputs = inputs;
        this.outputs = outputs;
        for (int i = 0; i < hiddenLayerCount; i++) {
            Node[] hl = new Node[10];
            hiddenLayers.add(hl);
        }
        Random r = new Random();
        for (Node node : inputs) {
            for (Node node2 : hiddenLayers.get(0)) {
                Branch branch = new Branch(r.nextDouble(2)-1, node2, node);
            }
        }
        for(int i = 0; i < hiddenLayers.size() - 2; i++) {
            Node[] layer = hiddenLayers.get(i);
            Node[] next = hiddenLayers.get(i+1);
            for (Node node : layer) {
                for (Node node2 : next) {
                    Branch branch = new Branch(r.nextDouble(2)-1, node2, node);
                }
            }
        }
        for (Node node1 : hiddenLayers.get(hiddenLayers.size()-1)) {
            for (Node node2 : outputs) {
                Branch branch = new Branch(r.nextDouble(2)-1, node2, node1);
            }
        }
    }


    public ArrayList<Node> getInputs() {
        return inputs;
    }
    public void setInputs(ArrayList<Node> inputs) {
        this.inputs = inputs;
    }
    public ArrayList<Node> getOutputs() {
        return outputs;
    }
    public void setOutputs(ArrayList<Node> outputs) {
        this.outputs = outputs;
    }
    public ArrayList<ArrayList<Node>> getHiddenLayers() {
        return hiddenLayers;
    }
    public void setHiddenLayers(ArrayList<ArrayList<Node>> hiddenLayers) {
        this.hiddenLayers = hiddenLayers;
    }
}
