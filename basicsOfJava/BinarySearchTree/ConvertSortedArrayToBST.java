class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class ConvertSortedArrayToBST {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return constructBST(nums, 0, nums.length - 1);
    }

    private TreeNode constructBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = constructBST(nums, start, mid - 1);
        node.right = constructBST(nums, mid + 1, end);

        return node;
    }

    // Helper function to print the tree (in-order traversal)
    public void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBST converter = new ConvertSortedArrayToBST();
        int[] nums = {-10, -3,0, 5, 9};
        TreeNode root = converter.sortedArrayToBST(nums);
        
        System.out.println("In-order traversal of constructed BST:");
        converter.printInOrder(root);
    }
}
