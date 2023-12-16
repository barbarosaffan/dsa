package problems

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinarySearchTree {
    private var root: TreeNode? = null

    fun insert(value: Int) {
        root = insertRec(root, value)
    }

    private fun insertRec(root: TreeNode?, value: Int): TreeNode {
        if (root == null) {
            return TreeNode(value)
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value)
        } else if (value > root.value) {
            root.right = insertRec(root.right, value)
        }

        return root
    }

    fun search(value: Int): Boolean {
        return searchRec(root, value)
    }

    private fun searchRec(root: TreeNode?, value: Int): Boolean {
        if (root == null) {
            return false
        }

        if (value == root.value) {
            return true
        }

        return if (value < root.value) {
            searchRec(root.left, value)
        } else {
            searchRec(root.right, value)
        }
    }

    fun inorderTraversal() {
        inorderTraversalRec(root)
    }

    private fun inorderTraversalRec(node: TreeNode?) {
        if (node != null) {
            inorderTraversalRec(node.left)
            print("${node.value} ")
            inorderTraversalRec(node.right)
        }
    }

    fun levelOrder() {
        levelOrderTraversalRec(root)
    }

    private fun levelOrderTraversalRec(node: TreeNode?) {
        if (node!= null) {
            levelOrderTraversalRec(node.left)
            levelOrderTraversalRec(node.right)
            print("${node.value} ")
        }
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    val size = scanner.nextInt()
    val insertions = mutableListOf<Int>()
    for (i in 0 until size) {
        insertions.add(scanner.nextInt())
    }
    val bst = BinarySearchTree()

    for (insertion in insertions) {
        bst.insert(insertion)
    }

    bst.levelOrder()
}
