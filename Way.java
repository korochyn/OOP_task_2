package Task2;

public abstract class Way {
    Integer height;
    Integer lenght;
    public Way(Integer lenght, Integer height) {

        this.lenght = lenght;
        this.height = height;
    }


    public int getLenght (){
        return lenght;
    }
    public void setLenght (int height){
        this.height = lenght;
    }

    public int getHeight (){
        return height;
    }
    public void setHeight (int height){
        this.height = height;
    }



    
}
