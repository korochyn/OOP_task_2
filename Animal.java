package Task2;

public class Animal extends Predok {
    String sex;
    //static Integer count;
    Integer stopBit;
    public Animal (Integer run, Integer jamp, String name, String sex, Integer stopBit) {
        super(run, jamp, name);
        this.sex = sex;
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



    public String getSex (){
        return sex;
    }
    public void setSex (String sex){
        this.sex = sex;
    }

    // public static int getCount (){
    //     return count;
    //     }
    // public static void setCount (int count){
    //     Animal.count = count;   
    //     }


    
}
