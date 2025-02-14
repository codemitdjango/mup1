public class BinarySearchTree {
    BinarySearchTreeNode wurzelKnoten = null;
    public BinarySearchTree(){}
    public void add (Double zahl){
        if(this.wurzelKnoten == null){
            this.wurzelKnoten = new BinarySearchTreeNode();
        }
        this.wurzelKnoten.add(zahl);
    }
    public int getDepth(){
        return this.wurzelKnoten.getDepth();
    }
}

