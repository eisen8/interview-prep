import common.TreeNode;

import java.util.Stack;

// 226. Invert Binary Tree --- https://leetcode.com/problems/invert-binary-tree/description
// See bottom for problem statement
public class P_0226 {
    /**
     * Swap the children and recursively iterate through the tree
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { return null; }

        swapChildren(root);

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    /**
     * Same as above but with a stack instead of recursion
     */
    public TreeNode invertTree2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr != null) {
                swapChildren(curr);

                // Add children to stack
                stack.push(curr.left);
                stack.push(curr.right);
            }
        }

        return root;
    }

    private void swapChildren(TreeNode node) {
        TreeNode temp = node.left; // swap
        node.left = node.right;
        node.right = temp;
    }
}

/*
Given the root of a binary tree, invert the tree, and return its root.
*/
