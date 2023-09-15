public class Factoriel {
    public static void main(String[] args) {
        int num=3;
        int multipl=1;
        System.out.println(factoroiel(num,1,multipl));
    }
    public static int factoroiel(int num,int start,int mult){

//        if(start==num){
//            return mult;
//        }
//mult*=start;
//            System.out.println(mult+"m");
//        return     factoroiel(num, start + 1,mult);
//
//    }
//    static int calculateN(int start,int num, int multipl){
            if(start==num+1){
                return mult;
            }
            mult=mult*start;
            return factoroiel(num,start+1,mult);
        }
}
