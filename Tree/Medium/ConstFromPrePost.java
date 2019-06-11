import java.util.*;

public class ConstFromPrePost{
		
	class Node{

		int val;
		Node right;
		Node left;
		Node next;

		public Node(int x){ val = x; }
	}

	public TreeNode construct(int[] pre, int[] post){

		return construct(pre, 0, pre.length - 1, post, 0, post.length - 1);
	}

	public TreeNode construct(int[] pre, int plo, int phi, int[] post, int postlo, int posthi){

		if(plo > phi || postlo > posthi){
			return null;
		}

		TreeNode nn = new TreeNode(pre[plo]);

		int i = postlo;
		for(i = postlo;i <= posthi;i++){

			if(post[i] == pre[plo + 1]){
				break;
			}
		}

		int si = i - postlo;

		nn.left = construct(pre,plo + 1,plo + nel + 1,post, postlo, postlo + nel);
		nn.right = construct(pre, plo + nel + 2, phi, post, postlo + nel + 1, phi - 1);

		return nn;
	}

	
}