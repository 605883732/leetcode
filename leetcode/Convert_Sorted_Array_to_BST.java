/*将排好序的数组转化为平衡二叉查找树***/
public  class Convert_Sorted_Array_to_BST {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0) return null;
		return build(nums,0,nums.length-1);
    }
	TreeNode build(int nums[],int low,int high){
		if(low==high) return new TreeNode(nums[low]);
		if(low>high) return null;
		int mid = low+(high-low)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = build(nums,low,mid-1);
        node.right = build(nums,mid+1,high);
        return node;
	}
	public static void main(String[] args) {
		Convert_Sorted_Array_to_BST cbst = new Convert_Sorted_Array_to_BST();
		int nums[]={1,2,3,4};
		TreeNode result = cbst.sortedArrayToBST(nums);
		while(result!=null){
			System.out.println(result.val);
			result = result.left;
		}
		

	}

}
