package me.exerosis.packet.wrappers.in;

import me.exerosis.packet.utils.packet.PacketPlay;
import me.exerosis.packet.wrappers.PacketWrapper;
import me.exerosis.reflection.Reflect;

public final class PacketWrapperInCloseWindow extends PacketWrapper {

    public PacketWrapperInCloseWindow(Object packet) {
        super(packet);
    }

    public PacketWrapperInCloseWindow(int windowID) {
        super(PacketPlay.In.CloseWindow(windowID));
    }

    public int getWindowId() {
        return Reflect.Field(getPacket(), int.class).getValue();
    }

    public void setWindowId(int windowId) {
        Reflect.Field(getPacket(), int.class, 0).setValue(windowId);
    }
}