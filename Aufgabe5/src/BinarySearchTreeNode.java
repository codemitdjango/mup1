public class BinarySearchTreeNode {
    private BinarySearchTreeNode linkesKind = null;
    private BinarySearchTreeNode rechtesKind = null;
    private Double wert = null;

    public void add(Double zahl) {
        if (this.wert == null) {
            this.wert = zahl;
        } else if (zahl > this.wert) {
            if (this.rechtesKind == null) {
                this.rechtesKind = new BinarySearchTreeNode();
            }
            this.rechtesKind.add(zahl);
        } else if (zahl < this.wert) {
            if (this.linkesKind == null) {
                this.linkesKind = new BinarySearchTreeNode();
            }
            this.linkesKind.add(zahl);
        }
    }

    public int getDepth() {
        if (this.wert == null) {
            return 0;
        }
        if (this.linkesKind == null && this.rechtesKind == null) {
            return 1;
        }
        if (this.linkesKind == null) {
            return this.rechtesKind.getDepth() + 1;
        }
        if (this.rechtesKind == null) {
            return this.linkesKind.getDepth() + 1;
        }
        return Math.max(this.linkesKind.getDepth(), this.rechtesKind.getDepth()) + 1;

    }
}
