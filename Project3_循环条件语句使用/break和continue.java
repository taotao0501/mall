package Project3_循环条件语句使用;

/**
 * break
 * 1.switch
 * 2.打断循环
 * continue
 * 一旦跳过，开始下一次循环
 */


public class break和continue {
    public static void main(String[] args) {
        for(int i = 0; i <8;i++){
            if(i == 4){
                break;
            }
            System.out.println("i=" + i);
        }

        for(int j = 0; j <8;j++){
                    if(j == 4){
                        continue;
                    }
                    System.out.println("j=" + j);
            
        }
    }
}
