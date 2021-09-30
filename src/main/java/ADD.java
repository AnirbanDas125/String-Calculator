
public class ADD {
    public int printResult(String str) throws Exception{
        str=str.trim();

        if(str.isEmpty()){
            return 0;
        }
       if(str.length()==1){
          return stringToInt(str);
       }else{
         return getSum(str);
       }

    }
    private int stringToInt(String inp){
       return Integer.valueOf(inp);
    }
    private int getSum(String inp) throws Exception{
        for(String s:inp.split("[,|\n]+")){
            s=s.trim();
            if(stringToInt(s)<0){
              throw new Exception("negatives not allowed");
            }
        }
        int sum =0;
        for(String s:inp.split("[,|\n]+")){
            s=s.trim();
            sum = sum+Integer.valueOf(s);
        }
        return sum;
    }

}
