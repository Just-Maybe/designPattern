package com.example.helloworld.androiddesignpattern.mediator;

/**
 * Created by helloworld on 2017/6/13.
 */

public class MainBoard extends Mediator {
    private CDDevice cdDevice;  //光驱设备
    private CPU cpu; //CPU
    private SoundCard soundCard;    //声卡设备
    private GraphicsCard graphicsCard;//    显卡设备

    @Override
    public void changed(Colleague c) {
        //如果光驱读取了数据
        if (c == cdDevice) {
            handleCD((CDDevice) c);
        } else if (c == cpu) {  //如果CPU处理完数据
            handleCPU((CPU) c);
        }
    }

    /**
     * 处理CPU 读取数据后与其他设备的交互
     * @param cpu
     */
    private void handleCPU(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    /**
     * 设置CD 设备
     * @param c
     */
    private void handleCD(CDDevice c) {
        cpu.decodeData(cdDevice.read());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
