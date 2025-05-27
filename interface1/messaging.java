package interface1;


public  interface messaging {
    String getMessage();
    void print();
    String getRecipient();
    default void printConnection(){
        System.out.println("connection is sucessful");

    }


    
}
