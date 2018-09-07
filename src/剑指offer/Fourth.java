package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by: Administrator 2018-09-04 10:50
 * 功能：重建二叉树
 * 实现深度优先遍历（前序、中序、后序），广度优先遍历
 */
public class Fourth {
    //根节点
    private Node root;

    //主函数
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5,6,7};
        Fourth BT = new Fourth();
        BT.createBT(data);
        BT.preOrder1();
        System.out.println("----------");
        BT.preOrder2();
        System.out.println("----------");
        BT.inOrder1();
        System.out.println("----------");
        BT.postOrder1();
        System.out.println("----------");
        BT.postOrder2();
    }

    //节点类
    public class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public void createBT(int[] data){
        int len = data.length;
        //将数组存放入节点中
        ArrayList<Node> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            list.add(new Node(data[i]));
        }

        //设置左右子节点
        for (int i = 0; i < len/2 - 1 ; i++) {
            list.get(i).left = list.get(2 * i + 1);//该节点的左子节点索引为2*i+1
            list.get(i).right = list.get(2 * i + 2);//该节点的右子节点索引为2*i+2
        }
        //最后一个父节点需要单独处理，因为可能没有右子节点
        int i = len / 2 - 1;
        list.get(i).left = list.get(2 * i + 1);//设置左子节点
        //如果数组长度为奇数，则最后一个父节点才有右子节点
        if(len %  2 == 1) list.get(i).right = list.get(2 * i + 2);
        root = list.get(0);
    }

    //递归前序遍历
    public void preOrder1(){
        preOrder1(root);
    }
    private void preOrder1(Node node){
        if(node == null) return;
        System.out.println(node.value + " ");
        preOrder1(node.left);
        preOrder1(node.right);
    }

    //非递归前序遍历，使用栈
    public void preOrder2(){
        preOrder2(root);

    }
    private void preOrder2(Node node){
        Stack<Node> stack = new Stack<>();
        while(node != null || !stack.empty()){
            while(node != null){
                System.out.println(node.value);
                stack.push(node);
                node = node.left;
            }
            if(!stack.empty()){
                node = stack.pop().right;
            }
        }

    }

    //递归中序遍历
    public void inOrder1(){
        inOrder1(root);
    }
    private void inOrder1(Node node){
        if(node == null) return;
        inOrder1(node.left);
        System.out.println(node.value + " ");
        inOrder1(node.right);
    }

    //非递归中序遍历，使用栈
    public void inOrder2(){
        inOrder2(root);
    }

    private void inOrder2(Node node){
        Stack<Node> stack = new Stack<>();
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.value);
                node = node.right;
            }
        }
    }



    //递归后序遍历
    public void postOrder1(){
        postOrder1(root);
    }

    private void postOrder1(Node node){
        if(node == null) return;
        postOrder1(node.left);
        postOrder1(node.right);
        System.out.println(node.value + " ");
    }

    //后序遍历，非递归
    public void postOrder2(){
        postOrder2(root);
    }

    private void postOrder2(Node node){
        Stack<Node> stack = new Stack<> ();
        Node p = node, prev = node;
        while(p != null || !stack.isEmpty()){
            while(p != null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()){
                Node temp = stack.peek().right;
            }
            if(!stack.isEmpty()){
                Node temp = stack.peek().right;
                if(temp == null || temp == prev){
                    p = stack.pop();
                    System.out.println(p.value);
                    prev = p;
                    p = null;
                }else{
                    p = temp;
                }
            }
        }
    }

    //广度优先遍历（层次遍历。从上到下一层一层遍历），使用队列
    //LinkedList这种数据结构既可以当做栈来使用也可以当做队列来使用
    public void bfs(){
//        if(root == null) return;
//        Queue<Node> x = new Queue<>();
//        LinkedList<Node> queue = new LinkedList<Node>();
//        queue.offer(root);//首先将根节点存入队列
//        //当队列中有值的时，每次取出队首的node打印
//        //打印之后判断
    }
}
