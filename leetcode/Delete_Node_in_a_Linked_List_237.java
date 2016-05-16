/*从链表中删除某个节点，你只有该节点的入口，没有头节点的入口****/
/*方法，将下一个节点的值和指针赋予该节点，删除下一个节点****/
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
