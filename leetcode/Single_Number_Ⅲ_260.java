import java.util.ArrayList;
import java.util.List;

/*将2*n+2的问题划分为两个集合转化为2*n+1***/
/*所有数异或，得到最后结果，然后找最后一个非零位置。根据这个位置做分类，所有这个位置为零的为一组，所有这个位置为一的为一组**/
public class Single_Number_Ⅲ_260 {
	public int[] singleNumber(int[] nums) {
		if(nums.length<=2) return nums;
        int temp = nums[0];
		for(int i=1;i<nums.length;i++){
        	temp^=nums[i];
        }
		int i=0;
		while((temp&1)!=1){ //找最后一个非零位置
			i++;
			temp = temp>>1;
		}
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int j=0;j<nums.length;j++){
			if((nums[j]>>i&1)==1){
				list1.add(nums[j]);
			}
			else list2.add(nums[j]);
		}
		int result1 = list1.get(0);
		int result2 = list2.get(0);
		for(int k=1;k<list1.size();k++){
			result1^=list1.get(k);
		}
		for(int k=1;k<list2.size();k++){
			result2^=list2.get(k);
		}
		int[] result = new int[2];
		result[0] = result1;
		result[1] = result2;
		return result;
    }
	public static void main(String[] args) {
		Single_Number_Ⅲ_260 s260 = new Single_Number_Ⅲ_260();
		int nums[]={1193730082,587035181,-814709193,1676831308,-511259610,284593787,
		-2058511940,1970250135,-814709193,-1435587299,1308886332,-1435587299,
		1676831308,1403943960,-421534159,-528369977,-2058511940,1636287980,-1874234027,
		197290672,1976318504,-511259610,1308886332,336663447,1636287980,197290672,
		1970250135,1976318504,959128864,284593787,-528369977,-1874234027,587035181,-421534159,-786223891,933046536,959112204,336663447,933046536,959112204,1193730082,-786223891};
		int rs[] =s260.singleNumber(nums);
		System.out.println(rs[0]+" "+rs[1]);

	}

}
