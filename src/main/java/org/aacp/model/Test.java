package org.aacp.model;

public class Test {
    private static Test instance;


    private Test(){

        public static Test getIntance (){
            if(instance == null){
                instance = new Test();
            }
            return Intance;
        }
    }
}
