import java.util.HashMap;

class RandomListNode {
    int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
 };
 /*
  * ����random�ڵ����ָ���κε㣬�������ܻ�δ����������Ҫ�ȴ�������random�Ŀ���
  * ����ԭ�ڵ�Ͷ�Ӧ�����Ľڵ���hashmap��ϵ����,
  * ����ٿ���random�ڵ�
  */
public class Copy_list_with_random_pointer_138 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) return null;
		RandomListNode result = new RandomListNode(-1);
		RandomListNode dummy = result;
		RandomListNode head_temp = head;
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        while(head_temp != null){ //�ȹ�������randomָ��Ŀ���
        	dummy.next = new RandomListNode(head_temp.label);
        	map.put(head_temp, dummy.next); //��ԭ�ڵ�Ͷ�Ӧ�ڵ����map
        	head_temp = head_temp.next;
        	dummy = dummy.next;
        }
        dummy = result;
        head_temp = head;
        while(head_temp != null){
        	dummy.next.random = map.get(head_temp.random); //�ҵ���Ӧ��random
        	dummy = dummy.next;
        	head_temp = head_temp.next;
        }
        return result.next;
        
        
    }
	public static void main(String[] args) {
		
	}
}
