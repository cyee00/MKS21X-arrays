public class ArrayDemo{
  public static void printArray(int[]ary){
    String ans = "[";
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.print(ans+ary[ary.length-1]+"]");
  }
  public static void printArray(int[][]ary){
    String ans = "[";
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.print(ans+ary[ary.length-1]+"]");
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.print(ans+ary[ary.length-1]+"]");
  }
  public static void main(String[] args){
    int[]ary=new int[5];
    int[][]2dAry=new int[2][];
    printArray(ary);
    printArray(2dAry);
  }
}
