package ru.company;

import java.util.Random;

public class TV {
    private final int MAX_CHANNELS_COUNT = 5;
    private Channel channels[];
    private int currentChannelsCount;


    public TV() {
        this.channels = new Channel[MAX_CHANNELS_COUNT];
        this.currentChannelsCount = 1;
    }

    void addChannel(Channel channel) {
        if (currentChannelsCount < MAX_CHANNELS_COUNT && currentChannelsCount !=0) {
            this.channels[currentChannelsCount] = channel;
            currentChannelsCount++;
        }
    }

        public void showChannel ( int channelNumber){
            channels[channelNumber].show();
        }
    }



