package com.drunkshulker.bartender.util.salhack.events;

import net.minecraft.network.Packet;

public class EventNetworkPostPacketEvent extends EventNetworkPacketEvent
{
    public EventNetworkPostPacketEvent(Packet p_Packet)
    {
        super(p_Packet);
    }
}
