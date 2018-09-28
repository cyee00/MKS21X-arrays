public class ArrayDemo{
  public static void printArray(int[]ary){
    String ans = "{";
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.print(ans+ary[ary.length-1]+"}");
  }
  public static void printArray(int[][]ary){
    System.out.print("{");
    printArray(ary[0]);
    System.out.print("\n");
    printArray(ary[1]);
    System.out.print("}");
  }
  public static int countZeros2D(int[][] nums){
    int ans = 0;
    for (int i=0;i<nums[0].length;i++) {
      if (nums[0][i]==0) {
        ans++;
      }
    }
    for (int i=0;i<nums[1].length;i++) {
      if (nums[1][i]==0) {
        ans++;
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int[] array=new int[5];
    int[][] array2 = new int[][] {
      {0,0,3,0},
      {0,1,2,3},
    };
    printArray(array);
    System.out.print("\n");
    printArray(array2);
    System.out.print("\n"+countZeros2D(array2));
  }
}
