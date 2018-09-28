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
  public static void fill2D(int[][] vals){
    for (int i=0;i<vals[0].length;i++) {
      if (i==0) {
      vals[0][i]=3;
    } else
      vals[0][i]=1;
    }
    for (int i=0;i<vals[1].length;i++) {
      if (i==1) {
      vals[1][i]=3;
    } else
      vals[1][i]=1;
    }
    printArray(vals);
  }
  public static int[][] fill2DCopy(int[][] vals){
    int[][] copiedArray = new int[vals.length][vals[0].length];
    for (int i=0;i<vals[0].length;i++) {
      if (vals[0][i]<0) {
        copiedArray[0][i]=3;
      } else copiedArray[0][i]=1;
    }
    for (int i=0;i<vals[1].length;i++) {
      if (vals[1][i]<0) {
        copiedArray[1][i]=3;
      } else copiedArray[1][i]=1;
    }
    return copiedArray;
  }
  public static void main(String[] args){
    int[] array=new int[5];
    int[][] array2 = new int[][] {
      {0,0,3,0},
      {0,1,2,0},
    };
    int[][] array3 = new int[][] {
      {0,-5,3,0},
      {0,1,2,-2},
    };
    printArray(array);
    System.out.print("\n\n");
    printArray(array2);
    System.out.print("\n\n"+countZeros2D(array2)+"\n\n");
    fill2D(array2);
    System.out.print("\n\n");
    printArray(fill2DCopy(array3));
  }
}
