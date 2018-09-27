public class ArrayDemo{
  public static void printArray(int[]ary){
    String ans = "{";
    for (int i =0;i<ary.length-1;i++) {
      ans += ary[i] + ", ";
    }
    System.out.println(ans+ary[ary.length-1]+"}");
  }
  public static void printArray(int[][]ary){
    System.out.print("{");
    printArray(ary[0]);
    printArray(ary[1]);
    System.out.print("}");
  }
  public static void main(String[] args){
    int[] array=new int[5];
    int[][] array2 = new int[2][3];
    printArray(array);
    printArray(array2);
  }
}
