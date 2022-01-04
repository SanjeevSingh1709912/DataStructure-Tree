package org.tree.dfs;

import com.sun.source.tree.Tree;
import org.tree.node.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public static void InOrderItr(TreeNode head)
    {
        Stack<TreeNode>st=new Stack<TreeNode>();
        TreeNode node=head;
        while(true)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.getLeft();
            }
            else
            {
                if(st.isEmpty())break;
                node=st.pop();
                System.out.println(node.getData());
                node=node.getRight();
            }
        }
    }

    public static void InOrder(TreeNode head)
    {
        if(head==null)return;

        InOrder(head.getLeft());
        System.out.println(head.getData());
        InOrder(head.getRight());
    }

    public static void PreOrderItr(TreeNode head)
    {
        Stack<TreeNode>st=new Stack<TreeNode>();
        st.push(head);
        if(head==null)return ;
        while(!st.isEmpty())
        {
            head=st.pop();
            System.out.println(head.getData());
            if(head.getLeft()!=null)st.push(head.getLeft());
            if(head.getRight()!=null)st.push(head.getRight());
        }
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
