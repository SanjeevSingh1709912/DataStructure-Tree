package org.tree.bfs;

import org.tree.node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static ArrayList<ArrayList<Integer>> LevelOrder(TreeNode head)
    {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        if(head==null)return arr;
        q.offer(head);

        while(!q.isEmpty())
        {
            int levelSize=q.size();
            ArrayList<Integer> sarr=new ArrayList<Integer>();
            for(int i=0;i<levelSize;i++)
            {
                if((q.peek().getLeft()!=null))q.offer(q.peek().getLeft());
                if(q.peek().getRight()!=null)q.offer(q.peek().getRight());
                sarr.add(q.peek().getData());
            }
            arr.add(sarr);
        }
        return arr;
    }
}
