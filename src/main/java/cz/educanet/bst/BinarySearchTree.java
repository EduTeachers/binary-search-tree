package cz.educanet.bst;

public interface BinarySearchTree<T extends Comparable<T>> {

    /**
     * Inserts item into the binary tree.
     *
     * @param item Item to insert
     */
    void insert(T item);

    /**
     * Returns depth of the tree
     *
     * @return Depth of the tree
     */
    int depth();

    /**
     * Searches for the given item.
     * Note: The item must have a valid implementation of the `equals()` method.
     *
     * @return True if the item is found, else false
     */
    boolean contains(T item);
}
