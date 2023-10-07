package Task2;

public abstract class Predok{
    Integer run;
    Integer jamp;
    String name;
    public static int count;


    public Predok(Integer run, Integer jamp, String name ) {
        this.run = run;
        this.jamp = jamp;
        this.name = name;
        count++; 
    }

    public int getRun (){
        return run;
    }
    public void setRun (int run){
        this.run = run;
    }

    public int getJamp (){
        return jamp;
    }
    public void setJamp (int jamp){
        this.jamp = jamp;
    }

    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public static int getCount (){
        return count;
    }
    public static void setCount (int count){
        Animal.count = count;   
    }
    
    abstract void runmming(int runDistans);
    abstract void jamping(int jampDistans);
} 