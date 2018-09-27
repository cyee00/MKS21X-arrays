public class ArrayDemo{
  public static void printArray(int[]ary){
    String ans = "[";
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.print(ans+ary[ary.length-1]+"]");
  }
  public static void printArray(int[][]ary){
    String ans1 = "[";
    for (int i =0;i<ary[1].length-1;i++) {
      ans1 += ary[1][i] + ", ";
    }
    System.out.print(ans1+ary[ary[1].length-1]+"]");
    String ans2 = "[";
    for (int i =0;i<ary[2].length-1;i++) {
      ans2 += ary[2][i] + ", ";
    }
    System.out.print(ans2+ary[ary[2].length-1]+"]");
  }
  public static void main(String[] args){
    int[] ary=new int[5];
    int[][] ary2 = new int[2][3];
    printArray(ary);
    printArray(ary2);
  }
}
