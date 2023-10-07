package Task2;

public class Robot extends Predok {
    // static Integer count;
     Integer stopBit;
    public Robot (Integer run, Integer jamp, String name, Integer stopBit) {
        super(run, jamp, name);
        this.stopBit = stopBit;
    }

    
    @Override
    void runmming(int runDistans){
            if (runDistans < run && runDistans > 0 && stopBit == 0 ) {
                System.out.println(name + " пробежал " + runDistans + " метров");
            } else { if (runDistans > 0 && stopBit == 0 ) {
                  System.out.println(name + " не смог добежать до цели");
                  stopBit =1;
            }
                
            }
    }
    @Override    
     void jamping(int jampDistans){
            if (jampDistans < jamp && jampDistans > 0 && stopBit == 0 ) {
                System.out.println(name + " преодолел " + jamp + " метров");
            } else { if (jampDistans > 0 && stopBit == 0 ) {
                System.out.println(name + " не смог перепрыгнуть");   
                stopBit =1;
            }
                
            }
        }



    // public static int getCount (){
    //     return count;
    //     }
    // public static void setCount (int count){
    //     Robot.count = count;   
    //     }


    
}
