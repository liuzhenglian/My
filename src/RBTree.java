//import jdk.internal.org.objectweb.asm.tree.analysis.Value;
//
//import java.security.Key;
//
//
///**
// * Description:
// * User: Administrator
// * Date: 2018-08-27
// * Time: 11:38
// *
// * 说明：
// */
//public class RBTree {
//    private static final boolean RED = true;
//    private static final boolean BLACK = false;
//
//    private class Node{
//        Key key; //键
//        Value val;//相关联的值
//        Node left,right;//左右子树
//        int N;//这棵树中的节点总数
//        boolean color;//由其父节点指向它的连接的颜色
//
//        Node(Key key, Value val, int N, boolean color){
//            this.key = key;
//            this.val = val;
//            this.N = N;
//            this.colr = color;
//        }
//    }
//    private boolean isRed(Node X){
//        if(x == null) return false;
//        return x.color  == RED;
//    }
//
//}
