package org.tree.dfs;

import org.tree.node.TreeNode;

public class DFS {
    public static void InOrder(TreeNode head)
    {
        if(head==null)return;

        InOrder(head.getLeft());
        System.out.println(head.getData());
        InOrder(head.getRight());
    }

    public static void PreOrder(TreeNode head)
    {
        if(head==null)return;

        System.out.println(head.getData());
        PreOrder(head.getLeft());
        PreOrder(head.getRight());
    }

    public static void PostOrder(TreeNode head)
    {
        if(head==null)return;
        PostOrder(head.getLeft());
        PostOrder(head.getRight());
        System.out.println(head.getData());
    }


}
