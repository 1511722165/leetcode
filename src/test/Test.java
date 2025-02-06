package test;

public class Test {
   public int compareVersion(String version1,String version2){
       String[] strV1=version1.split("\\.");
       String[] strV2=version2.split("\\.");
       //从左到右一个一个判断
      if(strV1.length>=strV2.length){
          for(int i=0;i<strV2.length;i++){
              //两个字符串数值 需要去除前置0
              int a=Integer.parseInt(strV1[i]);
              int b=Integer.parseInt(strV2[i]);
              if(a>b){
                return 1;
              }else if(a<b){
                  return -1;
              }
          }
          //如果没有返回则两个一样 比较后续剩余的值
         for(int j=strV2.length;j<strV1.length;j++){
             if(Integer.parseInt(strV1[j])>0){
                 return 1;
             }
         }
      }else {
          for(int i=0;i<strV1.length;i++){
              //两个字符串数值 需要去除前置0
              int a=Integer.parseInt(strV1[i]);
              int b=Integer.parseInt(strV2[i]);
              if(a>b){
                  return 1;
              }else if(a<b){
                  return -1;
              }
          }
          for(int j=strV1.length;j<strV2.length;j++){
              if(Integer.parseInt(strV2[j])>0){
                  return -1;
              }
          }

      }

        return 0;
   }


   public String multiply(String num1,String num2){
       char[] chars1=num1.toCharArray();
       char[] chars2=num2.toCharArray();
       int[] res=new int[chars1.length+chars2.length];
       for(int i=chars1.length-1;i>=0;i--){

           for (int j=chars2.length-1;j>=0;j--){
               //计算两个相乘 是否需要进位
               int multiply=(chars1[i]-'0')*(chars2[j]-'0');
                    res[i+j+1]+=multiply;
           }
       }
        StringBuilder sb=new StringBuilder();
       for (int i=res.length-1;i>0;i--){
           if (res[i]>10){
               res[i-1]+=res[i]/10;
               res[i]=res[i]%10;
           }
            sb.insert(0,res[i]);
       }

       if(res[0]>0){
           sb.insert(0,res[0]);
       }
       return sb.toString();
   }

    public static void main(String[] args) {
        Test test=new Test();
//        test.compareVersion("1.01","1.010");
       System.out.println( test.multiply("123","456"));
    }
}
