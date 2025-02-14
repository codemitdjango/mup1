public class TestBinarySearchTree {
    public static void main (String[] args){
        BinarySearchTree binarySearchTree1 = new BinarySearchTree();
        binarySearchTree1.add(50.0);
        binarySearchTree1.add(25.0);
        binarySearchTree1.add(75.0);
        binarySearchTree1.add(12.5);
        binarySearchTree1.add(87.5);
        binarySearchTree1.add(37.5);
        binarySearchTree1.add(62.5);
        System.out.println(binarySearchTree1.getDepth());

        BinarySearchTree binarySearchTree2 = new BinarySearchTree();
        binarySearchTree2.add(12.5);
        binarySearchTree2.add(25.0);
        binarySearchTree2.add(37.5);
        binarySearchTree2.add(50.0);
        binarySearchTree2.add(62.5);
        binarySearchTree2.add(75.0);
        binarySearchTree2.add(87.5);
        System.out.println(binarySearchTree2.getDepth());
    }
}
