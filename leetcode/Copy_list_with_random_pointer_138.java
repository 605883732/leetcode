import java.util.HashMap;

class RandomListNode {
    int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
 };
 /*
  * 由于random节点可以指向任何点，这个点可能还未创建，所以要先创建不含random的拷贝
  * 并把原节点和对应创建的节点用hashmap联系起来,
  * 最后再拷贝random节点
  */
public class Copy_list_with_random_pointer_138 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return null;
		RandomListNode result = new RandomListNode(-1);
		RandomListNode dummy = result;
		RandomListNode head_temp = head;
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        while(head_temp != null){ //先构建不含random指针的拷贝
        	dummy.next = new RandomListNode(head_temp.label);
        	map.put(head_temp, dummy.next); //把原节点和对应节点放入map
        	head_temp = head_temp.next;
        	dummy = dummy.next;
        }
        dummy = result;
        head_temp = head;
        while(head_temp != null){
        	dummy.next.random = map.get(head_temp.random); //找到对应的random
        	dummy = dummy.next;
        	head_temp = head_temp.next;
        }
        return result.next;
        
        
    }
	public static void main(String[] args) {
		
	}
}
