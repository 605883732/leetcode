/*��������ɾ��ĳ���ڵ㣬��ֻ�иýڵ����ڣ�û��ͷ�ڵ�����****/
/*����������һ���ڵ��ֵ��ָ�븳��ýڵ㣬ɾ����һ���ڵ�****/
public class Delete_Node_in_a_Linked_List_237 {

	public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val =next.val;
        node.next = next.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
