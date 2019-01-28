package ru.company;

import java.util.Random;
import java.util.Scanner;

public class Channel {
    private  final int MAX_PROGRAMS_COUNT = 5;
    private  String channelname;
    private Program programs[];
    private int currentProgramsCount;


    public Channel(String channelname) {
        this.channelname = channelname;
        this.programs = new Program[MAX_PROGRAMS_COUNT];
        this.currentProgramsCount = 0;
    }
    public void  addProgram(Program program){
        this.programs[currentProgramsCount] = program;
        currentProgramsCount++;

    }

     void show(){
        Random random = new Random();
        programs[random.nextInt(currentProgramsCount)].printName();
     }
}


