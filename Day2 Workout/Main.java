class Addition{
    int add(int a,int b){
        return a+b;
    }
}
class Main{
    public static void main(String[]args){
        Addition a=new Addition();
         int res=a.add(10,20);
          System.out.println(res);
    }
}
